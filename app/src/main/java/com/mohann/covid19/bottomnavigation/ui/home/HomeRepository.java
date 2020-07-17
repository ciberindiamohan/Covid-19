package com.mohann.covid19.bottomnavigation.ui.home;

import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.mohann.covid19.model.CovidModelResponse;
import com.mohann.covid19.model.DistrictData;
import com.mohann.covid19.model.DistrictWiseDataModel;
import com.mohann.covid19.webservicehandler.CovidApi;
import com.mohann.covid19.webservicehandler.CovidRetrofitService;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeRepository {
    private static HomeRepository homeRepository;

    public static HomeRepository getInstance() {
        if (homeRepository == null) {
            homeRepository = new HomeRepository();
        }
        return homeRepository;
    }

    public CovidApi covidApi;

    public HomeRepository() {
        covidApi = CovidRetrofitService.getCovidClient().create(CovidApi.class);
    }

    public MutableLiveData<CovidModelResponse> getCovidResults() {
        MutableLiveData<CovidModelResponse> covidData = new MutableLiveData<>();
        covidApi.getCovidData().enqueue(new Callback<CovidModelResponse>() {
            @Override
            public void onResponse(@NotNull Call<CovidModelResponse> call,
                                   @NotNull Response<CovidModelResponse> response) {
                if (response.isSuccessful()) {
                    CovidModelResponse covidModelResponse = response.body();
                    if (covidModelResponse != null) {
                        covidData.setValue(covidModelResponse);
                    } else {
                        covidData.setValue(null);
                    }

                }
            }

            @Override
            public void onFailure(@NotNull Call<CovidModelResponse> call, @NotNull Throwable t) {
                covidData.setValue(null);
            }
        });
        return covidData;
    }


    public MutableLiveData<List<DistrictWiseDataModel>> getStateWiseCovidResults() {
        MutableLiveData<List<DistrictWiseDataModel>> stateWiseModelList = new MutableLiveData<>();
        List<DistrictWiseDataModel> districtWiseDataModels = new ArrayList<>();
        covidApi.getStateWiseCovidData().enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(@NotNull Call<ResponseBody> call,
                                   @NotNull Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        try {
                            JSONObject jsonObject = new JSONObject(response.body().string());
                            Iterator<?> keys = jsonObject.keys();
                            while (keys.hasNext()) {
                                String key = (String) keys.next();
                                DistrictWiseDataModel districtWiseDataModel = new DistrictWiseDataModel();
                                String stateCode = "";
                                String stateName = "";
                                stateName = key;
                                if (jsonObject.get(key) instanceof JSONObject) {
                                    stateCode = ((JSONObject) jsonObject.get(key)).getString("statecode");
                                    JSONObject jsonObject1 = new JSONObject(((JSONObject) jsonObject.get(key)).getString("districtData"));
                                    Iterator<?> keys1 = jsonObject1.keys();
                                    while (keys1.hasNext()) {
                                        String key1 = (String) keys1.next();
                                        if (jsonObject1.get(key1) instanceof JSONObject) {
                                            DistrictData districtData = new Gson().fromJson(jsonObject1.get(key1).toString(), DistrictData.class);
                                            districtWiseDataModel.setStateCode(stateCode);
                                            districtWiseDataModel.setStateName(stateName);
                                            districtWiseDataModel.setDistrictName(key1);
                                            districtWiseDataModel.setConfirmed(districtData.getConfirmed());
                                            districtWiseDataModel.setDeceased(districtData.getDeceased());
                                            districtWiseDataModel.setActive(districtData.getActive());
                                            districtWiseDataModel.setRecovered(districtData.getRecovered());
                                            districtWiseDataModel.setDeltaRecovered(districtData.getDelta().getRecovered());
                                            districtWiseDataModel.setDeltaConfirmed(districtData.getDelta().getConfirmed());
                                            districtWiseDataModel.setDeltaDeceased(districtData.getDelta().getDeceased());
                                            districtWiseDataModels.add(districtWiseDataModel);
                                            districtWiseDataModel = new DistrictWiseDataModel();
                                        }
                                    }
                                }
                            }
                            stateWiseModelList.setValue(districtWiseDataModels);
                        } catch (IOException | JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            @Override
            public void onFailure(@NotNull Call<ResponseBody> call, @NotNull Throwable t) {
                stateWiseModelList.setValue(null);
            }
        });
        return stateWiseModelList;
    }
}
