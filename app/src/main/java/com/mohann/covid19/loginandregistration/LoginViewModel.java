package com.mohann.covid19.loginandregistration;

import android.app.Application;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.mohann.covid19.model.LoginUser;
import com.mohann.covid19.room.CovidRepository;
import com.mohann.covid19.room.model.RegisterUserModel;

public class LoginViewModel extends AndroidViewModel {

    public MutableLiveData<String> eMail = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();

    private MutableLiveData<LoginUser> userMutableLiveData;
    private CovidRepository covidRepository;

    public LoginViewModel(@NonNull Application application) {
        super(application);
        covidRepository = new CovidRepository(application);
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


    RegisterUserModel getSpecifiedUser(String emailID) {
        return covidRepository.getSpecifiedUser(emailID);
    }
}