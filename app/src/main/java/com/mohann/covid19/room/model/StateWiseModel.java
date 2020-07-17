package com.mohann.covid19.room.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Comparator;

@Entity(tableName = "statewise")
public class StateWiseModel implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo(name = "active")
    private String active;

    @ColumnInfo(name = "confirmed")
    private String confirmed;

    @ColumnInfo(name = "deaths")
    private String deaths;

    @ColumnInfo(name = "deltaconfirmed")
    private String deltaconfirmed;

    @ColumnInfo(name = "deltadeaths")
    private String deltadeaths;

    @ColumnInfo(name = "deltarecovered")
    private String deltarecovered;

    @ColumnInfo(name = "lastupdatedtime")
    private String lastupdatedtime;

    @ColumnInfo(name = "migratedother")
    private String migratedother;

    @ColumnInfo(name = "recovered")
    private String recovered;

    @ColumnInfo(name = "state")
    private String state;

    @ColumnInfo(name = "statecode")
    private String statecode;

    @ColumnInfo(name = "statenotes")
    private String statenotes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NotNull
    @Override
    public String toString() {
        return "StateWiseModel{" +
                "active='" + active + '\'' +
                ", confirmed='" + confirmed + '\'' +
                ", deaths='" + deaths + '\'' +
                ", deltaconfirmed='" + deltaconfirmed + '\'' +
                ", deltadeaths='" + deltadeaths + '\'' +
                ", deltarecovered='" + deltarecovered + '\'' +
                ", lastupdatedtime='" + lastupdatedtime + '\'' +
                ", migratedother='" + migratedother + '\'' +
                ", recovered='" + recovered + '\'' +
                ", state='" + state + '\'' +
                ", statecode='" + statecode + '\'' +
                ", statenotes='" + statenotes + '\'' +
                '}';
    }

    public StateWiseModel(String active, String confirmed, String deaths, String deltaconfirmed, String deltadeaths, String deltarecovered, String lastupdatedtime, String migratedother, String recovered, String state, String statecode, String statenotes) {
        this.active = active;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.deltaconfirmed = deltaconfirmed;
        this.deltadeaths = deltadeaths;
        this.deltarecovered = deltarecovered;
        this.lastupdatedtime = lastupdatedtime;
        this.migratedother = migratedother;
        this.recovered = recovered;
        this.state = state;
        this.statecode = statecode;
        this.statenotes = statenotes;
    }


    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getDeltaconfirmed() {
        return deltaconfirmed;
    }

    public void setDeltaconfirmed(String deltaconfirmed) {
        this.deltaconfirmed = deltaconfirmed;
    }

    public String getDeltadeaths() {
        return deltadeaths;
    }

    public void setDeltadeaths(String deltadeaths) {
        this.deltadeaths = deltadeaths;
    }

    public String getDeltarecovered() {
        return deltarecovered;
    }

    public void setDeltarecovered(String deltarecovered) {
        this.deltarecovered = deltarecovered;
    }

    public String getLastupdatedtime() {
        return lastupdatedtime;
    }

    public void setLastupdatedtime(String lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    public String getMigratedother() {
        return migratedother;
    }

    public void setMigratedother(String migratedother) {
        this.migratedother = migratedother;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatecode() {
        return statecode;
    }

    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }

    public String getStatenotes() {
        return statenotes;
    }

    public void setStatenotes(String statenotes) {
        this.statenotes = statenotes;
    }

    public static Comparator<StateWiseModel> stateWiseModelComparator = (s1, s2) -> {
        return Integer.parseInt(s2.getConfirmed().replace(",", "")) - Integer.parseInt(s1.getConfirmed().replace(",", ""));
    };
}
