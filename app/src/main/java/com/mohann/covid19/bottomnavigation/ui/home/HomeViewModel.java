package com.mohann.covid19.bottomnavigation.ui.home;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.mohann.covid19.model.CovidModelResponse;
import com.mohann.covid19.model.DistrictWiseDataModel;
import com.mohann.covid19.room.CovidDatabase;
import com.mohann.covid19.room.model.DistrictWiseModel;
import com.mohann.covid19.room.model.StateWiseModel;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Maybe;

public class HomeViewModel extends AndroidViewModel {

    public MutableLiveData<CovidModelResponse> covidModelResponseMutableLiveData;
    public MutableLiveData<List<DistrictWiseDataModel>> covidStateWiseModelResponseMutableLiveData;
    public MutableLiveData<HomeDataModel> homeDataModelMutableLiveData = new MutableLiveData<>();
    private CovidDatabase covidDatabase;

    public HomeViewModel(@NonNull Application application) {
        super(application);
        covidDatabase = CovidDatabase.getInstance(application);
    }

    public void setData(HomeDataModel homeDataModel) {
        homeDataModelMutableLiveData.setValue(homeDataModel);
    }

    public void init() {
        if (covidModelResponseMutableLiveData != null) {
            return;
        }
        if (covidStateWiseModelResponseMutableLiveData != null) {
            return;
        }
        HomeRepository homeRepository = HomeRepository.getInstance();
        covidModelResponseMutableLiveData = homeRepository.getCovidResults();
        covidStateWiseModelResponseMutableLiveData = homeRepository.getStateWiseCovidResults();
    }

    public LiveData<CovidModelResponse> getHomeRepository() {
        return covidModelResponseMutableLiveData;
    }

    public LiveData<List<DistrictWiseDataModel>> getStateWiseCovidResults() {
        return covidStateWiseModelResponseMutableLiveData;
    }

    //State wise data
    Completable saveStateListData(List<StateWiseModel> stateWiseModels) {
        return covidDatabase.covidDao().insertStateWiseData(stateWiseModels);
    }

    Maybe<List<StateWiseModel>> getStateWiseModels() {
        return covidDatabase.covidDao().getStateWiseData();
    }

    Completable deleteStateListData() {
        return covidDatabase.covidDao().deleteStateWiseData();
    }


    //District Wise data
    Completable saveDistrictListData(List<DistrictWiseModel> districtWiseModels) {
        return covidDatabase.covidDao().insertDistrictWiseData(districtWiseModels);
    }

    Maybe<List<DistrictWiseModel>> getDistrictWiseModels(String stateCode) {
        return covidDatabase.covidDao().getDistrictWiseData(stateCode);
    }

    Completable deleteDistrictListData() {
        return covidDatabase.covidDao().deleteDistrictWiseData();
    }
}