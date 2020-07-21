package com.mohann.covid19.bottomnavigation.ui.who;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WhoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WhoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is WHO fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}