package com.mohann.covid19.loginandregistration;

import android.app.Application;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.mohann.covid19.model.RegisterUser;
import com.mohann.covid19.room.CovidDatabase;
import com.mohann.covid19.room.model.RegisterUserModel;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Maybe;

public class RegisterViewModel extends AndroidViewModel {

    public MutableLiveData<String> firstName = new MutableLiveData<>();
    public MutableLiveData<String> lastName = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();
    public MutableLiveData<String> confirmPassword = new MutableLiveData<>();
    public MutableLiveData<String> eMail = new MutableLiveData<>();
    public MutableLiveData<String> phoneNo = new MutableLiveData<>();

    private MutableLiveData<RegisterUser> userMutableLiveData;
    private CovidDatabase covidDatabase;

    public RegisterViewModel(@NonNull Application application) {
        super(application);
        covidDatabase = CovidDatabase.getInstance(application);
    }

    MutableLiveData<RegisterUser> getRegisterUser() {
        if (userMutableLiveData == null) {
            userMutableLiveData = new MutableLiveData<>();
        }
        return userMutableLiveData;

    }

    public void onClick(View view) {
        RegisterUser registerUser = new RegisterUser(firstName.getValue(), lastName.getValue(),
                password.getValue(), confirmPassword.getValue(), eMail.getValue(), phoneNo.getValue());
        userMutableLiveData.setValue(registerUser);
    }

    Completable registerUser(RegisterUserModel registerUserModel) {
        return covidDatabase.covidDao().registerUser(registerUserModel);
    }

    Maybe<List<RegisterUserModel>> getSpecifiedUser(String emailID) {
        return covidDatabase.covidDao().getSpecifiedUser(emailID);
    }

}
