package com.mohann.covid19.model;

import android.util.Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterUser {
    private String strFirstName;
    private String strLastName;
    private String strEmailAddress;
    private String strPassword;
    private String strConfirmPassword;
    private String strPhoneNumber;

    public RegisterUser(String strFirstName, String strLastName, String strPassword, String strConfirmPassword, String strEmailAddress, String strPhoneNumber) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
        this.strEmailAddress = strEmailAddress;
        this.strPhoneNumber = strPhoneNumber;
    }

    public String getStrFirstName() {
        return strFirstName;
    }

    public void setStrFirstName(String strFirstName) {
        this.strFirstName = strFirstName;
    }

    public String getStrLastName() {
        return strLastName;
    }

    public void setStrLastName(String strLastName) {
        this.strLastName = strLastName;
    }

    public String getStrEmailAddress() {
        return strEmailAddress;
    }

    public void setStrEmailAddress(String strEmailAddress) {
        this.strEmailAddress = strEmailAddress;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrConfirmPassword() {
        return strConfirmPassword;
    }

    public void setStrConfirmPassword(String strConfirmPassword) {
        this.strConfirmPassword = strConfirmPassword;
    }

    public String getStrPhoneNumber() {
        return strPhoneNumber;
    }

    public void setStrPhoneNumber(String strPhoneNumber) {
        this.strPhoneNumber = strPhoneNumber;
    }

    public static boolean isEmailValid(String eMail) {
        return Patterns.EMAIL_ADDRESS.matcher(eMail).matches();
    }

    public static boolean isValidPassword(String password) {
        Pattern pattern;
        Matcher matcher;
        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean isValidCheckPassword(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }

    public static boolean isPasswordLengthGreaterThan8(String password) {
        return password.length() > 7 && password.length() < 16;
    }

    public static boolean isValidPhoneNumber(String text) {
        if (text == null || ((CharSequence) text).length() < 10 || ((CharSequence) text).length() > 13) {
            return false;
        } else {
            return android.util.Patterns.PHONE.matcher(text).matches();
        }
    }
}
