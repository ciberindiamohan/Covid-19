package com.mohann.covid19.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.mohann.covid19.room.model.DistrictWiseModel;
import com.mohann.covid19.room.model.RegisterUserModel;
import com.mohann.covid19.room.model.StateWiseModel;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Maybe;

@Dao
public interface CovidDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Completable registerUser(RegisterUserModel registerUserModel);

    @Query("select * from register where emailId= :emailId")
    Maybe<List<RegisterUserModel>> getSpecifiedUser(String emailId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Completable insertStateWiseData(List<StateWiseModel> stateWiseModels);

    @Query("SELECT * FROM statewise")
    Maybe<List<StateWiseModel>> getStateWiseData();

    @Query("DELETE FROM statewise ")
    Completable deleteStateWiseData();

    @Insert
    Completable insertDistrictWiseData(List<DistrictWiseModel> stateWiseModels);

    @Query("SELECT * FROM districtwise where stateCode= :stateCode")
    Maybe<List<DistrictWiseModel>> getDistrictWiseData(String stateCode);

    @Query("DELETE FROM districtwise ")
    Completable deleteDistrictWiseData();



}
