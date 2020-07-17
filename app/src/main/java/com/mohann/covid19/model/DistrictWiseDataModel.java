package com.mohann.covid19.model;

import org.jetbrains.annotations.NotNull;

public class DistrictWiseDataModel {
    private String stateName;
    private String stateCode;
    private String districtName;
    private int active;
    private int confirmed;
    private int deceased;
    private int recovered;
    private int deltaConfirmed;
    private int deltaDeceased;
    private int deltaRecovered;

    public DistrictWiseDataModel() {
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

    public DistrictWiseDataModel(String stateName, String stateCode, String districtName, int active, int confirmed, int deceased, int recovered, int deltaConfirmed, int deltaDeceased, int deltaRecovered) {
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
}
