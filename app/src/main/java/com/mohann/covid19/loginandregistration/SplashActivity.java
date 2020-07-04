package com.mohann.covid19.loginandregistration;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.mohann.covid19.R;
import com.mohann.covid19.utils.Constants;
import com.mohann.covid19.utils.PreferenceConnector;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> {
            //First time after 3 seconds the User navigates to terms and condition page
            //else navigate to Dashboard screen
            if (PreferenceConnector.readBoolean(this, Constants.REGISTER_PREF, false)) {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            } else {
                Intent intent = new Intent(SplashActivity.this, RegistrationActivity.class);
                intent.putExtra(Constants.REGISTER_BOOLEAN,false);
                startActivity(intent);
                finish();
            }

        }, 3000);
    }
}
