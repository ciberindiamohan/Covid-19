package com.mohann.covid19.model;

import org.jetbrains.annotations.NotNull;

public class DistrictData {

    private String notes;
    private int active;
    private int confirmed;
    private int deceased;
    private int recovered;
    private Delta delta;

    @NotNull
    @Override
    public String toString() {
        return "DistrictData{" +
                "notes='" + notes + '\'' +
                ", active=" + active +
                ", confirmed=" + confirmed +
                ", deceased=" + deceased +
                ", recovered=" + recovered +
                ", delta=" + delta +
                '}';
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    public Delta getDelta() {
        return delta;
    }

    public void setDelta(Delta delta) {
        this.delta = delta;
    }

    public static class Delta {
        private int confirmed;
        private int deceased;
        private int recovered;

        @NotNull
        @Override
        public String toString() {
            return "Delta{" +
                    "confirmed=" + confirmed +
                    ", deceased=" + deceased +
                    ", recovered=" + recovered +
                    '}';
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
    }
}
