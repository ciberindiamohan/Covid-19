package com.mohann.covid19.room;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.mohann.covid19.room.model.CasesTimeSeriesModel;
import com.mohann.covid19.room.model.DistrictWiseModel;
import com.mohann.covid19.room.model.RegisterUserModel;
import com.mohann.covid19.room.model.StateWiseModel;
import com.mohann.covid19.room.model.TestedModel;
import com.mohann.covid19.utils.Constants;

@Database(entities = {DistrictWiseModel.class,RegisterUserModel.class, CasesTimeSeriesModel.class, StateWiseModel.class, TestedModel.class}, version = 4, exportSchema = false)
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
