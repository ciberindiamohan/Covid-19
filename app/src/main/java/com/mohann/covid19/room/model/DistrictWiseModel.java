package com.mohann.covid19.room.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Comparator;

@Entity(tableName = "districtwise")
public class DistrictWiseModel implements Serializable {

    @PrimaryKey(autoGenerate = true)
    private long id;
    @ColumnInfo(name = "stateName")
    private String stateName;
    @ColumnInfo(name = "stateCode")
    private String stateCode;
    @ColumnInfo(name = "districtName")
    private String districtName;
    @ColumnInfo(name = "active")
    private int active;
    @ColumnInfo(name = "confirmed")
    private int confirmed;
    @ColumnInfo(name = "deceased")
    private int deceased;
    @ColumnInfo(name = "recovered")
    private int recovered;
    @ColumnInfo(name = "deltaConfirmed")
    private int deltaConfirmed;
    @ColumnInfo(name = "deltaDeceased")
    private int deltaDeceased;
    @ColumnInfo(name = "deltaRecovered")
    private int deltaRecovered;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getDeceased() {
        return deceased;
    }

    public void setDeceased(int deceased) {
        this.deceased = deceased;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getDeltaConfirmed() {
        return deltaConfirmed;
    }

    public void setDeltaConfirmed(int deltaConfirmed) {
        this.deltaConfirmed = deltaConfirmed;
    }

    public int getDeltaDeceased() {
        return deltaDeceased;
    }

    public void setDeltaDeceased(int deltaDeceased) {
        this.deltaDeceased = deltaDeceased;
    }

    public int getDeltaRecovered() {
        return deltaRecovered;
    }

    public void setDeltaRecovered(int deltaRecovered) {
        this.deltaRecovered = deltaRecovered;
    }

    @NotNull
    @Override
    public String toString() {
        return "StateWiseModel{" +
                "stateName='" + stateName + '\'' +
                ", stateCode='" + stateCode + '\'' +
                ", districtName='" + districtName + '\'' +
                ", active=" + active +
                ", confirmed=" + confirmed +
                ", deceased=" + deceased +
                ", recovered=" + recovered +
                ", deltaConfirmed=" + deltaConfirmed +
                ", deltaDeceased=" + deltaDeceased +
                ", deltaRecovered=" + deltaRecovered +
                '}';
    }

    public DistrictWiseModel(String stateName, String stateCode, String districtName, int active, int confirmed, int deceased, int recovered, int deltaConfirmed, int deltaDeceased, int deltaRecovered) {
        this.stateName = stateName;
        this.stateCode = stateCode;
        this.districtName = districtName;
        this.active = active;
        this.confirmed = confirmed;
        this.deceased = deceased;
        this.recovered = recovered;
        this.deltaConfirmed = deltaConfirmed;
        this.deltaDeceased = deltaDeceased;
        this.deltaRecovered = deltaRecovered;
    }

    public static Comparator<DistrictWiseModel> districtWiseModelComparator = (s1, s2) -> {
        return s2.getConfirmed() - s1.getConfirmed();
    };
}
