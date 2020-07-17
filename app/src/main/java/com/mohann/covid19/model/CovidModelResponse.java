package com.mohann.covid19.model;

import java.text.DecimalFormat;
import java.util.List;

public class CovidModelResponse {
    private List<CasesTimeSery> cases_time_series;
    private List<Statewise> statewise;
    private List<Tested> tested;

    public List<CasesTimeSery> getCasesTimeSeries() {
        return cases_time_series;
    }

    @Override
    public String toString() {
        return "CovidModelResponse{" +
                "cases_time_series=" + cases_time_series +
                ", statewise=" + statewise +
                ", tested=" + tested +
                '}';
    }

    public void setCasesTimeSeries(List<CasesTimeSery> value) {
        this.cases_time_series = value;
    }

    public List<Statewise> getStatewise() {
        return statewise;
    }

    public void setStatewise(List<Statewise> value) {
        this.statewise = value;
    }

    public List<Tested> getTested() {
        return tested;
    }

    public void setTested(List<Tested> value) {
        this.tested = value;
    }

    public static class CasesTimeSery {
        private String dailyconfirmed;
        private String dailydeceased;
        private String dailyrecovered;
        private String date;
        private String totalconfirmed;
        private String totaldeceased;
        private String totalrecovered;

        @Override
        public String toString() {
            return "CasesTimeSery{" +
                    "dailyconfirmed='" + dailyconfirmed + '\'' +
                    ", dailydeceased='" + dailydeceased + '\'' +
                    ", dailyrecovered='" + dailyrecovered + '\'' +
                    ", date='" + date + '\'' +
                    ", totalconfirmed='" + totalconfirmed + '\'' +
                    ", totaldeceased='" + totaldeceased + '\'' +
                    ", totalrecovered='" + totalrecovered + '\'' +
                    '}';
        }

        public String getDailyconfirmed() {
            return dailyconfirmed;
        }

        public void setDailyconfirmed(String value) {
            this.dailyconfirmed = value;
        }

        public String getDailydeceased() {
            return dailydeceased;
        }

        public void setDailydeceased(String value) {
            this.dailydeceased = value;
        }

        public String getDailyrecovered() {
            return dailyrecovered;
        }

        public void setDailyrecovered(String value) {
            this.dailyrecovered = value;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String value) {
            this.date = value;
        }

        public String getTotalconfirmed() {
            return totalconfirmed;
        }

        public void setTotalconfirmed(String value) {
            this.totalconfirmed = value;
        }

        public String getTotaldeceased() {
            return totaldeceased;
        }

        public void setTotaldeceased(String value) {
            this.totaldeceased = value;
        }

        public String getTotalrecovered() {
            return totalrecovered;
        }

        public void setTotalrecovered(String value) {
            this.totalrecovered = value;
        }
    }

    public static class Statewise {
        private String active;
        private String confirmed;
        private String deaths;
        private String deltaconfirmed;
        private String deltadeaths;
        private String deltarecovered;
        private String lastupdatedtime;
        private String migratedother;
        private String recovered;
        private String state;
        private String statecode;
        private String statenotes;

        @Override
        public String toString() {
            return "Statewise{" +
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

        public String getActive() {
            return new DecimalFormat("##,##,##,###").format(Integer.parseInt(active));
        }

        public void setActive(String value) {
            this.active = value;
        }

        public String getConfirmed() {
            return new DecimalFormat("##,##,##,###").format(Integer.parseInt(confirmed));
        }

        public void setConfirmed(String value) {
            this.confirmed = value;
        }

        public String getDeaths() {
            return new DecimalFormat("##,##,##,###").format(Integer.parseInt(deaths));
        }

        public void setDeaths(String value) {
            this.deaths = value;
        }

        public String getDeltaconfirmed() {
            return deltaconfirmed;
        }

        public void setDeltaconfirmed(String value) {
            this.deltaconfirmed = value;
        }

        public String getDeltadeaths() {
            return deltadeaths;
        }

        public void setDeltadeaths(String value) {
            this.deltadeaths = value;
        }

        public String getDeltarecovered() {
            return deltarecovered;
        }

        public void setDeltarecovered(String value) {
            this.deltarecovered = value;
        }

        public String getLastupdatedtime() {
            return lastupdatedtime;
        }

        public void setLastupdatedtime(String value) {
            this.lastupdatedtime = value;
        }

        public String getMigratedother() {
            return migratedother;
        }

        public void setMigratedother(String value) {
            this.migratedother = value;
        }

        public String getRecovered() {
            return new DecimalFormat("##,##,##,###").format(Integer.parseInt(recovered));
        }

        public void setRecovered(String value) {
            this.recovered = value;
        }

        public String getState() {
            return state;
        }

        public void setState(String value) {
            this.state = value;
        }

        public String getStatecode() {
            return statecode;
        }

        public void setStatecode(String value) {
            this.statecode = value;
        }

        public String getStatenotes() {
            return statenotes;
        }

        public void setStatenotes(String value) {
            this.statenotes = value;
        }
    }

    public static class Tested {
        private String individualstestedperconfirmedcase;
        private String positivecasesfromsamplesreported;
        private String samplereportedtoday;
        private String source;
        private String testpositivityrate;
        private String testsconductedbyprivatelabs;
        private String testsperconfirmedcase;
        private String testspermillion;
        private String totalindividualstested;
        private String totalpositivecases;
        private String totalsamplestested;
        private String updatetimestamp;

        @Override
        public String toString() {
            return "Tested{" +
                    "individualstestedperconfirmedcase='" + individualstestedperconfirmedcase + '\'' +
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

        public String getIndividualstestedperconfirmedcase() {
            return individualstestedperconfirmedcase;
        }

        public void setIndividualstestedperconfirmedcase(String value) {
            this.individualstestedperconfirmedcase = value;
        }

        public String getPositivecasesfromsamplesreported() {
            return positivecasesfromsamplesreported;
        }

        public void setPositivecasesfromsamplesreported(String value) {
            this.positivecasesfromsamplesreported = value;
        }

        public String getSamplereportedtoday() {
            return samplereportedtoday;
        }

        public void setSamplereportedtoday(String value) {
            this.samplereportedtoday = value;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String value) {
            this.source = value;
        }

        public String getTestpositivityrate() {
            return testpositivityrate;
        }

        public void setTestpositivityrate(String value) {
            this.testpositivityrate = value;
        }

        public String getTestsconductedbyprivatelabs() {
            return testsconductedbyprivatelabs;
        }

        public void setTestsconductedbyprivatelabs(String value) {
            this.testsconductedbyprivatelabs = value;
        }

        public String getTestsperconfirmedcase() {
            return testsperconfirmedcase;
        }

        public void setTestsperconfirmedcase(String value) {
            this.testsperconfirmedcase = value;
        }

        public String getTestspermillion() {
            return testspermillion;
        }

        public void setTestspermillion(String value) {
            this.testspermillion = value;
        }

        public String getTotalindividualstested() {
            return totalindividualstested;
        }

        public void setTotalindividualstested(String value) {
            this.totalindividualstested = value;
        }

        public String getTotalpositivecases() {
            return totalpositivecases;
        }

        public void setTotalpositivecases(String value) {
            this.totalpositivecases = value;
        }

        public String getTotalsamplestested() {
            return totalsamplestested;
        }

        public void setTotalsamplestested(String value) {
            this.totalsamplestested = value;
        }

        public String getUpdatetimestamp() {
            return updatetimestamp;
        }

        public void setUpdatetimestamp(String value) {
            this.updatetimestamp = value;
        }
    }
}
