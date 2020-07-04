package com.mohann.covid19.room.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

import org.jetbrains.annotations.NotNull;

@Entity(tableName = "register", primaryKeys = {"emailId"})
public class RegisterUserModel {

    @ColumnInfo(name = "firstName")
    private String firstName;

    @ColumnInfo(name = "lastName")
    private String lastName;

    @ColumnInfo(name = "password")
    private String password;

    @NonNull
    @ColumnInfo(name = "emailId")
    private String emailID;

    @ColumnInfo(name = "phoneNo")
    private String phoneNo;

    public RegisterUserModel(String firstName, String lastName, String password, @NonNull String emailID, String phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.emailID = emailID;
        this.phoneNo = phoneNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NonNull
    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(@NonNull String emailID) {
        this.emailID = emailID;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
