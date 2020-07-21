package com.mohann.covid19.webservicehandler;

import com.mohann.covid19.model.CovidModelResponse;
import com.mohann.covid19.model.TravelHistory;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CovidApi {
    @GET("data.json")
    Call<CovidModelResponse> getCovidData();

    @GET("state_district_wise.json")
    Call<ResponseBody> getStateWiseCovidData();

    @GET("travel_history.json")
    Call<TravelHistory> getTravelHistory();


}


