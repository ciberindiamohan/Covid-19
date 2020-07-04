package com.mohann.covid19.room;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.MutableLiveData;

import com.mohann.covid19.room.model.RegisterUserModel;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class CovidRepository {
    private CovidDao covidDao;
    public MutableLiveData<ArrayList<RegisterUserModel>> registerUserModelList = new MutableLiveData<>();

    public CovidRepository(Application application) {
        CovidDatabase covidDatabase = CovidDatabase.getInstance(application);
        covidDao = covidDatabase.covidDao();
    }

    public Boolean registerUser(RegisterUserModel product) {
        try {
            return new registerUserAsyncTask(covidDao).execute(product).get();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static class registerUserAsyncTask extends AsyncTask<RegisterUserModel, Void, Boolean> {
        CovidDao covidDao;

        registerUserAsyncTask(CovidDao covidDao) {
            this.covidDao = covidDao;
        }

        @Override
        protected Boolean doInBackground(RegisterUserModel... registerUserModel) {
            covidDao.insertUser(registerUserModel[0]);
            return true;
        }
    }


    public RegisterUserModel getSpecifiedUser(String emailId) {
        try {
            return new getSpecifiedUserAsyncTask(covidDao).execute(emailId).get();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static class getSpecifiedUserAsyncTask extends AsyncTask<String, Void, RegisterUserModel> {

        CovidDao covidDao;

        getSpecifiedUserAsyncTask(CovidDao covidDao) {
            this.covidDao = covidDao;
        }

        @Override
        protected RegisterUserModel doInBackground(String... voids) {
            return covidDao.getSpecifiedUser(voids[0]);

        }

    }
}
