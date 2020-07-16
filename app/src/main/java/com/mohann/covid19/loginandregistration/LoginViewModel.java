package com.mohann.covid19.loginandregistration;

import android.app.Application;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.mohann.covid19.model.LoginUser;
import com.mohann.covid19.room.CovidDatabase;
import com.mohann.covid19.room.model.RegisterUserModel;

import java.util.List;

import io.reactivex.Maybe;

public class LoginViewModel extends AndroidViewModel {

    public MutableLiveData<String> eMail = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();

    public MutableLiveData<LoginUser> userMutableLiveData;
    private CovidDatabase covidDatabase;

    public LoginViewModel(@NonNull Application application) {
        super(application);
        covidDatabase = CovidDatabase.getInstance(application);
    }

    MutableLiveData<LoginUser> getUser() {
        if (userMutableLiveData == null) {
            userMutableLiveData = new MutableLiveData<>();
        }
        return userMutableLiveData;
    }

    public void onClick(View view) {
        LoginUser loginUser = new LoginUser(eMail.getValue(), password.getValue());
        userMutableLiveData.setValue(loginUser);
    }


    Maybe<List<RegisterUserModel>> getSpecifiedUser(String emailID) {
        return covidDatabase.covidDao().getSpecifiedUser(emailID);
    }

}