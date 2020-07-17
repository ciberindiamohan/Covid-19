package com.mohann.covid19.bottomnavigation.ui.who;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WhoViewModel extends ViewModel {

    public MutableLiveData<Boolean> whoInt = new MutableLiveData<>();
    public MutableLiveData<Boolean> whoRss = new MutableLiveData<>();

    public void whoInt(){
        whoInt.setValue(true);
    }

    public void whoRss(){
        whoRss.setValue(true);
    }
}