package com.mohann.covid19.model;

import android.util.Patterns;

public class LoginUser {
    private String strEmailAddress;
    private String strPassword;

    public LoginUser(String EmailAddress, String Password) {
        strEmailAddress = EmailAddress;
        strPassword = Password;
    }

    public String getStrEmailAddress() {
        return strEmailAddress;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public static boolean isEmailValid(String eMail) {
        return Patterns.EMAIL_ADDRESS.matcher(eMail).matches();
    }


    public static boolean isPasswordLengthGreaterThan8(String password) {
        return password.length() > 7 && password.length() < 16;
    }
}
