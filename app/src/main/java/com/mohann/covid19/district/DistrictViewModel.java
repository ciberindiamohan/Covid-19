package com.mohann.covid19.district;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mohann.covid19.room.model.StateWiseModel;

public class DistrictViewModel extends ViewModel {

    public MutableLiveData<StateWiseModel> stateWiseModelMutableLiveData = new MutableLiveData<>();

    public void setData(StateWiseModel stateWiseModel) {
        stateWiseModelMutableLiveData.setValue(stateWiseModel);
    }
}
