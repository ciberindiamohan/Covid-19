package com.mohann.covid19.loginandregistration;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.mohann.covid19.R;
import com.mohann.covid19.bottomnavigation.DashboardActivity;
import com.mohann.covid19.databinding.ActivityLoginBinding;
import com.mohann.covid19.model.LoginUser;
import com.mohann.covid19.utils.AESCrypt;
import com.mohann.covid19.utils.Constants;
import com.mohann.covid19.utils.PreferenceConnector;

import java.util.Objects;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityLoginBinding binding;
    private ConstraintLayout clLogin;
    private final CompositeDisposable mDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoginViewModel loginViewModel = new ViewModelProvider(this).get(LoginViewModel.class);
        binding = DataBindingUtil.setContentView(LoginActivity.this, R.layout.activity_login);
        binding.setLifecycleOwner(this);
        binding.setLoginViewModel(loginViewModel);
        binding.setMLoginActivity(this);
        clLogin = findViewById(R.id.clLogin);
        TextView tvRegister = findViewById(R.id.tvRegister);
        tvRegister.setOnClickListener(this);

    }

    public void onClick(View view, LoginViewModel loginViewModel) {
            hideKeyboard(this);
            if (TextUtils.isEmpty(binding.txtEmailAddress.getText().toString())) {
                binding.txtEmailAddress.setError(getString(R.string.email_id_is_required));
                binding.txtEmailAddress.requestFocus();
            } else if (!LoginUser.isEmailValid(binding.txtEmailAddress.getText().toString())) {
                binding.txtEmailAddress.setError(getString(R.string.invalid_email_id));
                binding.txtEmailAddress.requestFocus();
            } else if (TextUtils.isEmpty(binding.txtPassword.getText().toString())) {
                binding.txtPassword.setError(getString(R.string.password_is_required));
                binding.txtPassword.requestFocus();
            } else if (!LoginUser.isPasswordLengthGreaterThan8(binding.txtPassword.getText().toString())) {
                binding.txtPassword.setError(getString(R.string.password_should_minimum_eight_chars));
                binding.txtPassword.requestFocus();
            } else {
                clLogin.clearFocus();
                try {
                    mDisposable.add(loginViewModel.getSpecifiedUser(binding.txtEmailAddress.getText().toString())
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe(registerUserModel -> {
                                        if (registerUserModel.size() != 0) {
                                            if (binding.txtEmailAddress.getText().toString().equals(registerUserModel.get(0).getEmailID()) && binding.txtPassword.getText().toString().equals(AESCrypt.decrypt(registerUserModel.get(0).getPassword()))) {
                                                PreferenceConnector.writeString(this, Constants.FIRST_NAME, registerUserModel.get(0).getFirstName());
                                                PreferenceConnector.writeString(this, Constants.LAST_NAME, registerUserModel.get(0).getLastName());
                                                PreferenceConnector.writeString(this, Constants.EMAIL_ID, registerUserModel.get(0).getEmailID());
                                                PreferenceConnector.writeString(this, Constants.PHONE_NO, registerUserModel.get(0).getPhoneNo());
                                                Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                                                startActivity(intent);
                                                finish();
                                            } else {
                                                Toast.makeText(this, R.string.email_id_password_wrong, Toast.LENGTH_SHORT).show();
                                            }
                                        } else {
                                            Toast.makeText(this, R.string.user_not_registered, Toast.LENGTH_SHORT).show();
                                        }
                                    },
                                    throwable -> {
                                        Toast.makeText(this, R.string.something_went_wrong, Toast.LENGTH_SHORT).show();
                                    }));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }

    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        assert imm != null;
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.tvRegister) {
            Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
            intent.putExtra(Constants.REGISTER_BOOLEAN, true);
            startActivity(intent);
        }
    }
}
