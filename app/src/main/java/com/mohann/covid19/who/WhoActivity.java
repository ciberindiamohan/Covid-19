package com.mohann.covid19.who;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import com.mohann.covid19.R;
import com.mohann.covid19.utils.WebViewController;

import static com.mohann.covid19.utils.Constants.WHO_URL;

public class WhoActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who);
        WebView webViewWho = findViewById(R.id.webViewWho);
        webViewWho.getSettings().setJavaScriptEnabled(true);
        String urlWho = getIntent().getStringExtra(WHO_URL);
        if (urlWho != null) {
            webViewWho.loadUrl(urlWho);
            webViewWho.setWebViewClient(new WebViewController());
        }
    }
}