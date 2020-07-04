package com.mohann.covid19.room;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.mohann.covid19.room.model.RegisterUserModel;
import com.mohann.covid19.utils.Constants;

@Database(entities = {RegisterUserModel.class}, version = 2, exportSchema = false)
public abstract class CovidDatabase extends RoomDatabase {

    public static CovidDatabase INSTANCE;

    public abstract CovidDao covidDao();

    public static CovidDatabase getInstance(Context context) {
        synchronized (CovidDatabase.class) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(), CovidDatabase.class, Constants.COVID_DATABASE).allowMainThreadQueries().fallbackToDestructiveMigration().build();
            }
        }
        return INSTANCE;
    }
}
