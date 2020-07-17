package com.mohann.covid19.utils;

import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import java.text.DecimalFormat;

public class Converter {

//    @BindingAdapter("convertIntToDecimalConversion")
//    public static String convertIntToDecimalConversion(TextView textView,int text) {
//        return new DecimalFormat("##,##,##,###").format(text);
//    }

    @BindingAdapter("android:textDecimal")
    public static void convertIntToDecimalConversion(TextView view, int value) {
        view.setText(new DecimalFormat("##,##,##,###").format(value));
    }
}
