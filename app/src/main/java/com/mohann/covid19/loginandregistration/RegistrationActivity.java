package com.mohann.covid19.loginandregistration;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.mohann.covid19.R;
import com.mohann.covid19.bottomnavigation.DashboardActivity;
import com.mohann.covid19.databinding.ActivityRegistrationBinding;
import com.mohann.covid19.model.RegisterUser;
import com.mohann.covid19.room.model.RegisterUserModel;
import com.mohann.covid19.utils.AESCrypt;
import com.mohann.covid19.utils.Constants;
import com.mohann.covid19.utils.PreferenceConnector;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

import static com.mohann.covid19.loginandregistration.LoginActivity.hideKeyboard;
import static com.mohann.covid19.utils.Constants.REGISTER_PREF_FIRST;

public class RegistrationActivity extends AppCompatActivity {

    private ActivityRegistrationBinding binding;
    private ConstraintLayout clRegister;
    private final CompositeDisposable mDisposable = new CompositeDisposable();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RegisterViewModel registerViewModel = new ViewModelProvider(this).get(RegisterViewModel.class);
        binding = DataBindingUtil.setContentView(RegistrationActivity.this, R.layout.activity_registration);
        binding.setLifecycleOwner(this);
        binding.setRegisterViewModel(registerViewModel);
        binding.setMRegistrationActivity(this);
        clRegister = findViewById(R.id.clRegister);
    }

    public void onClick(View view, RegisterViewModel registerViewModel) {
        hideKeyboard(this);
        if (TextUtils.isEmpty(binding.txtFirstName.getText().toString())) {
            binding.txtFirstName.setError(getString(R.string.first_name_is_required));
            binding.txtFirstName.requestFocus();
        } else if (TextUtils.isEmpty(binding.txtLastName.getText().toString())) {
            binding.txtLastName.setError(getString(R.string.last_name_is_required));
            binding.txtLastName.requestFocus();
        } else if (TextUtils.isEmpty(binding.txtPassword.getText().toString())) {
            binding.txtPassword.setError(getString(R.string.password_is_required));
            binding.txtPassword.requestFocus();
        } else if (!RegisterUser.isPasswordLengthGreaterThan8(binding.txtPassword.getText().toString())) {
            binding.txtPassword.setError(getString(R.string.password_validation_error));
            binding.txtPassword.requestFocus();
        } else if (!RegisterUser.isValidPassword(binding.txtPassword.getText().toString())) {
            binding.txtPassword.setError(getString(R.string.password_validation_error));
            binding.txtPassword.requestFocus();
        } else if (TextUtils.isEmpty(binding.txtConfirmPassword.getText().toString())) {
            binding.txtConfirmPassword.setError(getString(R.string.confirm_your_password));
            binding.txtConfirmPassword.requestFocus();
        } else if (!RegisterUser.isValidCheckPassword(binding.txtPassword.getText().toString(), binding.txtConfirmPassword.getText().toString())) {
            binding.txtConfirmPassword.setError(getString(R.string.passwords_do_not_match));
            binding.txtConfirmPassword.requestFocus();
        } else if (TextUtils.isEmpty(binding.txtEmailAddress.getText().toString())) {
            binding.txtEmailAddress.setError(getString(R.string.email_id_is_required));
            binding.txtEmailAddress.requestFocus();
        } else if (!RegisterUser.isEmailValid(binding.txtEmailAddress.getText().toString())) {
            binding.txtEmailAddress.setError(getString(R.string.invalid_email_id));
            binding.txtEmailAddress.requestFocus();
        } else if (TextUtils.isEmpty(binding.txtPhoneNo.getText().toString())) {
            binding.txtPhoneNo.setError(getString(R.string.mobile_number_is_required));
            binding.txtPhoneNo.requestFocus();
        } else if (!RegisterUser.isValidPhoneNumber(binding.txtPhoneNo.getText().toString())) {
            binding.txtPhoneNo.setError(getString(R.string.invalid_mobile_number));
            binding.txtPhoneNo.requestFocus();
        } else {
            clRegister.clearFocus();
            try {
                if (PreferenceConnector.getPreferences(this).getBoolean(REGISTER_PREF_FIRST, true)) {
                    mDisposable.add(registerViewModel.getSpecifiedUser(binding.txtEmailAddress.getText().toString())
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe(registerUserModel -> {
                                        if (registerUserModel.size() == 0) {
                                            PreferenceConnector.writeBoolean(this, Constants.REGISTER_PREF, true);
                                            register(registerViewModel, new RegisterUser(
                                                    binding.txtFirstName.getText().toString(),
                                                    binding.txtLastName.getText().toString(),
                                                    binding.txtPassword.getText().toString(),
                                                    binding.txtConfirmPassword.getText().toString(),
                                                    binding.txtEmailAddress.getText().toString(),
                                                    binding.txtPhoneNo.getText().toString()
                                            ));
                                        } else {
                                            Toast.makeText(this, R.string.user_already_registered, Toast.LENGTH_SHORT).show();
                                        }
                                    },
                                    throwable -> {
                                        Toast.makeText(this, R.string.something_went_wrong, Toast.LENGTH_SHORT).show();
                                    }));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void register(RegisterViewModel registerViewModel, RegisterUser registerUser) throws Exception {
        mDisposable.add(registerViewModel.registerUser(new RegisterUserModel(registerUser.getStrFirstName(), registerUser.getStrLastName(), AESCrypt.encrypt(registerUser.getStrConfirmPassword()), registerUser.getStrEmailAddress(), registerUser.getStrPhoneNumber()))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(() -> {
                    Toast.makeText(this, R.string.registered_successfully, Toast.LENGTH_SHORT).show();
                    PreferenceConnector.writeString(this, Constants.FIRST_NAME, registerUser.getStrFirstName());
                    PreferenceConnector.writeString(this, Constants.LAST_NAME, registerUser.getStrLastName());
                    PreferenceConnector.writeString(this, Constants.EMAIL_ID, registerUser.getStrEmailAddress());
                    PreferenceConnector.writeString(this, Constants.PHONE_NO, registerUser.getStrPhoneNumber());

                    Intent intent = new Intent(RegistrationActivity.this, DashboardActivity.class);
                    startActivity(intent);
                    finish();
                }, throwable -> {
                    Toast.makeText(this, R.string.something_went_wrong, Toast.LENGTH_SHORT).show();
                }));
    }

    @Override
    public void onBackPressed() {
        if (!getIntent().getBooleanExtra(Constants.REGISTER_BOOLEAN, false)) {
            moveTaskToBack(true);
        } else {
            super.onBackPressed();
        }
    }
}
