package com.mohann.covid19.room.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "casestimeseries")
public class CasesTimeSeriesModel {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "dailyconfirmed")
    private String dailyconfirmed;

    @ColumnInfo(name = "dailydeceased")
    private String dailydeceased;

    @ColumnInfo(name = "dailyrecovered")
    private String dailyrecovered;

    @ColumnInfo(name = "date")
    private String date;

    @ColumnInfo(name = "totalconfirmed")
    private String totalconfirmed;

    @ColumnInfo(name = "totaldeceased")
    private String totaldeceased;

    @ColumnInfo(name = "totalrecovered")
    private String totalrecovered;

    public CasesTimeSeriesModel(String dailyconfirmed, String dailydeceased, String dailyrecovered, String date, String totalconfirmed, String totaldeceased, String totalrecovered) {
        this.dailyconfirmed = dailyconfirmed;
        this.dailydeceased = dailydeceased;
        this.dailyrecovered = dailyrecovered;
        this.date = date;
        this.totalconfirmed = totalconfirmed;
        this.totaldeceased = totaldeceased;
        this.totalrecovered = totalrecovered;
    }

    @Override
    public String toString() {
        return "CasesTimeSeriesModel{" +
                "id=" + id +
                ", dailyconfirmed='" + dailyconfirmed + '\'' +
                ", dailydeceased='" + dailydeceased + '\'' +
                ", dailyrecovered='" + dailyrecovered + '\'' +
                ", date='" + date + '\'' +
                ", totalconfirmed='" + totalconfirmed + '\'' +
                ", totaldeceased='" + totaldeceased + '\'' +
                ", totalrecovered='" + totalrecovered + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDailyconfirmed() {
        return dailyconfirmed;
    }

    public void setDailyconfirmed(String dailyconfirmed) {
        this.dailyconfirmed = dailyconfirmed;
    }

    public String getDailydeceased() {
        return dailydeceased;
    }

    public void setDailydeceased(String dailydeceased) {
        this.dailydeceased = dailydeceased;
    }

    public String getDailyrecovered() {
        return dailyrecovered;
    }

    public void setDailyrecovered(String dailyrecovered) {
        this.dailyrecovered = dailyrecovered;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotalconfirmed() {
        return totalconfirmed;
    }

    public void setTotalconfirmed(String totalconfirmed) {
        this.totalconfirmed = totalconfirmed;
    }

    public String getTotaldeceased() {
        return totaldeceased;
    }

    public void setTotaldeceased(String totaldeceased) {
        this.totaldeceased = totaldeceased;
    }

    public String getTotalrecovered() {
        return totalrecovered;
    }

    public void setTotalrecovered(String totalrecovered) {
        this.totalrecovered = totalrecovered;
    }
}
