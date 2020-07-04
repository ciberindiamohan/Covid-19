package com.mohann.covid19.loginandregistration;

import android.app.Application;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.mohann.covid19.model.RegisterUser;
import com.mohann.covid19.room.CovidRepository;
import com.mohann.covid19.room.model.RegisterUserModel;

public class RegisterViewModel extends AndroidViewModel {

    public MutableLiveData<String> firstName = new MutableLiveData<>();
    public MutableLiveData<String> lastName = new MutableLiveData<>();
    public MutableLiveData<String> password = new MutableLiveData<>();
    public MutableLiveData<String> confirmPassword = new MutableLiveData<>();
    public MutableLiveData<String> eMail = new MutableLiveData<>();
    public MutableLiveData<String> phoneNo = new MutableLiveData<>();

    private MutableLiveData<RegisterUser> userMutableLiveData;

    private CovidRepository covidRepository;

    public RegisterViewModel(@NonNull Application application) {
        super(application);
        covidRepository = new CovidRepository(application);
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

    Boolean registerUser(RegisterUserModel registerUserModel) {
        return covidRepository.registerUser(registerUserModel);
    }

    RegisterUserModel getSpecifiedUser(String emailID) {
        return covidRepository.getSpecifiedUser(emailID);
    }

}
