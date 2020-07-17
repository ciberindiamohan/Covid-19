package com.mohann.covid19.room.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tested")
public class TestedModel {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "individualstestedperconfirmedcase")
    private String individualstestedperconfirmedcase;

    @ColumnInfo(name = "positivecasesfromsamplesreported")
    private String positivecasesfromsamplesreported;

    @ColumnInfo(name = "samplereportedtoday")
    private String samplereportedtoday;

    @ColumnInfo(name = "source")
    private String source;

    @ColumnInfo(name = "testpositivityrate")
    private String testpositivityrate;

    @ColumnInfo(name = "testsconductedbyprivatelabs")
    private String testsconductedbyprivatelabs;

    @ColumnInfo(name = "testsperconfirmedcase")
    private String testsperconfirmedcase;

    @ColumnInfo(name = "testspermillion")
    private String testspermillion;

    @ColumnInfo(name = "totalindividualstested")
    private String totalindividualstested;

    @ColumnInfo(name = "totalpositivecases")
    private String totalpositivecases;

    @ColumnInfo(name = "totalsamplestested")
    private String totalsamplestested;

    @ColumnInfo(name = "updatetimestamp")
    private String updatetimestamp;

    public TestedModel(String individualstestedperconfirmedcase, String positivecasesfromsamplesreported, String samplereportedtoday, String source, String testpositivityrate, String testsconductedbyprivatelabs, String testsperconfirmedcase, String testspermillion, String totalindividualstested, String totalpositivecases, String totalsamplestested, String updatetimestamp) {
        this.individualstestedperconfirmedcase = individualstestedperconfirmedcase;
        this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
        this.samplereportedtoday = samplereportedtoday;
        this.source = source;
        this.testpositivityrate = testpositivityrate;
        this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
        this.testsperconfirmedcase = testsperconfirmedcase;
        this.testspermillion = testspermillion;
        this.totalindividualstested = totalindividualstested;
        this.totalpositivecases = totalpositivecases;
        this.totalsamplestested = totalsamplestested;
        this.updatetimestamp = updatetimestamp;
    }

    @Override
    public String toString() {
        return "TestedModel{" +
                "id=" + id +
                ", individualstestedperconfirmedcase='" + individualstestedperconfirmedcase + '\'' +
                ", positivecasesfromsamplesreported='" + positivecasesfromsamplesreported + '\'' +
                ", samplereportedtoday='" + samplereportedtoday + '\'' +
                ", source='" + source + '\'' +
                ", testpositivityrate='" + testpositivityrate + '\'' +
                ", testsconductedbyprivatelabs='" + testsconductedbyprivatelabs + '\'' +
                ", testsperconfirmedcase='" + testsperconfirmedcase + '\'' +
                ", testspermillion='" + testspermillion + '\'' +
                ", totalindividualstested='" + totalindividualstested + '\'' +
                ", totalpositivecases='" + totalpositivecases + '\'' +
                ", totalsamplestested='" + totalsamplestested + '\'' +
                ", updatetimestamp='" + updatetimestamp + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndividualstestedperconfirmedcase() {
        return individualstestedperconfirmedcase;
    }

    public void setIndividualstestedperconfirmedcase(String individualstestedperconfirmedcase) {
        this.individualstestedperconfirmedcase = individualstestedperconfirmedcase;
    }

    public String getPositivecasesfromsamplesreported() {
        return positivecasesfromsamplesreported;
    }

    public void setPositivecasesfromsamplesreported(String positivecasesfromsamplesreported) {
        this.positivecasesfromsamplesreported = positivecasesfromsamplesreported;
    }

    public String getSamplereportedtoday() {
        return samplereportedtoday;
    }

    public void setSamplereportedtoday(String samplereportedtoday) {
        this.samplereportedtoday = samplereportedtoday;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTestpositivityrate() {
        return testpositivityrate;
    }

    public void setTestpositivityrate(String testpositivityrate) {
        this.testpositivityrate = testpositivityrate;
    }

    public String getTestsconductedbyprivatelabs() {
        return testsconductedbyprivatelabs;
    }

    public void setTestsconductedbyprivatelabs(String testsconductedbyprivatelabs) {
        this.testsconductedbyprivatelabs = testsconductedbyprivatelabs;
    }

    public String getTestsperconfirmedcase() {
        return testsperconfirmedcase;
    }

    public void setTestsperconfirmedcase(String testsperconfirmedcase) {
        this.testsperconfirmedcase = testsperconfirmedcase;
    }

    public String getTestspermillion() {
        return testspermillion;
    }

    public void setTestspermillion(String testspermillion) {
        this.testspermillion = testspermillion;
    }

    public String getTotalindividualstested() {
        return totalindividualstested;
    }

    public void setTotalindividualstested(String totalindividualstested) {
        this.totalindividualstested = totalindividualstested;
    }

    public String getTotalpositivecases() {
        return totalpositivecases;
    }

    public void setTotalpositivecases(String totalpositivecases) {
        this.totalpositivecases = totalpositivecases;
    }

    public String getTotalsamplestested() {
        return totalsamplestested;
    }

    public void setTotalsamplestested(String totalsamplestested) {
        this.totalsamplestested = totalsamplestested;
    }

    public String getUpdatetimestamp() {
        return updatetimestamp;
    }

    public void setUpdatetimestamp(String updatetimestamp) {
        this.updatetimestamp = updatetimestamp;
    }
}
