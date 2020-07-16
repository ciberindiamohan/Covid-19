package com.mohann.covid19.loginandregistration;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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

import java.util.Objects;

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
        clRegister = findViewById(R.id.clRegister);
        viewModelObserver(registerViewModel);
    }

    private void viewModelObserver(RegisterViewModel registerViewModel) {
        registerViewModel.getRegisterUser().observe(this, registerUser -> {
            hideKeyboard(this);
            if (TextUtils.isEmpty(Objects.requireNonNull(registerUser).getStrFirstName())) {
                binding.txtFirstName.setError(getString(R.string.first_name_is_required));
                binding.txtFirstName.requestFocus();
            } else if (TextUtils.isEmpty(Objects.requireNonNull(registerUser).getStrLastName())) {
                binding.txtLastName.setError(getString(R.string.last_name_is_required));
                binding.txtLastName.requestFocus();
            } else if (TextUtils.isEmpty(Objects.requireNonNull(registerUser).getStrPassword())) {
                binding.txtPassword.setError(getString(R.string.password_is_required));
                binding.txtPassword.requestFocus();
            } else if (!registerUser.isPasswordLengthGreaterThan8()) {
                binding.txtPassword.setError(getString(R.string.password_validation_error));
                binding.txtPassword.requestFocus();
            } else if (!registerUser.isValidPassword()) {
                binding.txtPassword.setError(getString(R.string.password_validation_error));
                binding.txtPassword.requestFocus();
            } else if (TextUtils.isEmpty(Objects.requireNonNull(registerUser).getStrPassword())) {
                binding.txtConfirmPassword.setError(getString(R.string.confirm_your_password));
                binding.txtConfirmPassword.requestFocus();
            } else if (!registerUser.isValidCheckPassword()) {
                binding.txtConfirmPassword.setError(getString(R.string.passwords_do_not_match));
                binding.txtConfirmPassword.requestFocus();
            } else if (TextUtils.isEmpty(Objects.requireNonNull(registerUser).getStrEmailAddress())) {
                binding.txtEmailAddress.setError(getString(R.string.email_id_is_required));
                binding.txtEmailAddress.requestFocus();
            } else if (!registerUser.isEmailValid()) {
                binding.txtEmailAddress.setError(getString(R.string.invalid_email_id));
                binding.txtEmailAddress.requestFocus();
            } else if (TextUtils.isEmpty(Objects.requireNonNull(registerUser).getStrEmailAddress())) {
                binding.txtPhoneNo.setError(getString(R.string.mobile_number_is_required));
                binding.txtPhoneNo.requestFocus();
            } else if (!registerUser.isValidPhoneNumber()) {
                binding.txtPhoneNo.setError(getString(R.string.invalid_mobile_number));
                binding.txtPhoneNo.requestFocus();
            } else {
                clRegister.clearFocus();
                try {
                    if (PreferenceConnector.getPreferences(this).getBoolean(REGISTER_PREF_FIRST, true)) {
                        mDisposable.add(registerViewModel.getSpecifiedUser(registerUser.getStrEmailAddress())
                                .subscribeOn(Schedulers.io())
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe(registerUserModel -> {
                                            if (registerUserModel.size() == 0) {
                                                PreferenceConnector.writeBoolean(this, Constants.REGISTER_PREF, true);
                                                register(registerViewModel, registerUser);
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
        });
    }

    private void register(RegisterViewModel registerViewModel, RegisterUser registerUser) throws Exception {
        mDisposable.add(registerViewModel.registerUser(new RegisterUserModel(registerUser.getStrFirstName(), registerUser.getStrLastName(), AESCrypt.encrypt(registerUser.getStrConfirmPassword()), registerUser.getStrEmailAddress(), registerUser.getStrPhoneNumber()))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(() -> {
                    Toast.makeText(this, R.string.registered_successfully, Toast.LENGTH_SHORT).show();
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
