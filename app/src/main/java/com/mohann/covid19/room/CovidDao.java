package com.mohann.covid19.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.mohann.covid19.room.model.RegisterUserModel;

import java.util.List;

@Dao
public interface CovidDao {

    @Query("select * from register")
    List<RegisterUserModel> getRegisterUserList();

    @Query("select * from register where emailId= :emailId")
    RegisterUserModel getSpecifiedUser(String emailId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertUser(RegisterUserModel registerUserModel);

}
