package com.mohann.covid19.databinding;
import com.mohann.covid19.R;
import com.mohann.covid19.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRegistrationBindingImpl extends ActivityRegistrationBinding implements com.mohann.covid19.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideLine, 8);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener txtConfirmPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of RegisterViewModel.confirmPassword.getValue()
            //         is RegisterViewModel.confirmPassword.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtConfirmPassword);
            // localize variables for thread safety
            // RegisterViewModel.confirmPassword != null
            boolean registerViewModelConfirmPasswordJavaLangObjectNull = false;
            // RegisterViewModel.confirmPassword
            androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelConfirmPassword = null;
            // RegisterViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // RegisterViewModel
            com.mohann.covid19.loginandregistration.RegisterViewModel registerViewModel = mRegisterViewModel;
            // RegisterViewModel.confirmPassword.getValue()
            java.lang.String registerViewModelConfirmPasswordGetValue = null;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {


                registerViewModelConfirmPassword = registerViewModel.confirmPassword;

                registerViewModelConfirmPasswordJavaLangObjectNull = (registerViewModelConfirmPassword) != (null);
                if (registerViewModelConfirmPasswordJavaLangObjectNull) {




                    registerViewModelConfirmPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtEmailAddressandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of RegisterViewModel.eMail.getValue()
            //         is RegisterViewModel.eMail.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtEmailAddress);
            // localize variables for thread safety
            // RegisterViewModel.eMail.getValue()
            java.lang.String registerViewModelEMailGetValue = null;
            // RegisterViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // RegisterViewModel.eMail != null
            boolean registerViewModelEMailJavaLangObjectNull = false;
            // RegisterViewModel
            com.mohann.covid19.loginandregistration.RegisterViewModel registerViewModel = mRegisterViewModel;
            // RegisterViewModel.eMail
            androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelEMail = null;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {


                registerViewModelEMail = registerViewModel.eMail;

                registerViewModelEMailJavaLangObjectNull = (registerViewModelEMail) != (null);
                if (registerViewModelEMailJavaLangObjectNull) {




                    registerViewModelEMail.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtFirstNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of RegisterViewModel.firstName.getValue()
            //         is RegisterViewModel.firstName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtFirstName);
            // localize variables for thread safety
            // RegisterViewModel.firstName.getValue()
            java.lang.String registerViewModelFirstNameGetValue = null;
            // RegisterViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // RegisterViewModel
            com.mohann.covid19.loginandregistration.RegisterViewModel registerViewModel = mRegisterViewModel;
            // RegisterViewModel.firstName
            androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelFirstName = null;
            // RegisterViewModel.firstName != null
            boolean registerViewModelFirstNameJavaLangObjectNull = false;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {


                registerViewModelFirstName = registerViewModel.firstName;

                registerViewModelFirstNameJavaLangObjectNull = (registerViewModelFirstName) != (null);
                if (registerViewModelFirstNameJavaLangObjectNull) {




                    registerViewModelFirstName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtLastNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of RegisterViewModel.lastName.getValue()
            //         is RegisterViewModel.lastName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtLastName);
            // localize variables for thread safety
            // RegisterViewModel.lastName
            androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelLastName = null;
            // RegisterViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // RegisterViewModel.lastName.getValue()
            java.lang.String registerViewModelLastNameGetValue = null;
            // RegisterViewModel
            com.mohann.covid19.loginandregistration.RegisterViewModel registerViewModel = mRegisterViewModel;
            // RegisterViewModel.lastName != null
            boolean registerViewModelLastNameJavaLangObjectNull = false;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {


                registerViewModelLastName = registerViewModel.lastName;

                registerViewModelLastNameJavaLangObjectNull = (registerViewModelLastName) != (null);
                if (registerViewModelLastNameJavaLangObjectNull) {




                    registerViewModelLastName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of RegisterViewModel.password.getValue()
            //         is RegisterViewModel.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtPassword);
            // localize variables for thread safety
            // RegisterViewModel.password
            androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelPassword = null;
            // RegisterViewModel.password.getValue()
            java.lang.String registerViewModelPasswordGetValue = null;
            // RegisterViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // RegisterViewModel.password != null
            boolean registerViewModelPasswordJavaLangObjectNull = false;
            // RegisterViewModel
            com.mohann.covid19.loginandregistration.RegisterViewModel registerViewModel = mRegisterViewModel;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {


                registerViewModelPassword = registerViewModel.password;

                registerViewModelPasswordJavaLangObjectNull = (registerViewModelPassword) != (null);
                if (registerViewModelPasswordJavaLangObjectNull) {




                    registerViewModelPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtPhoneNoandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of RegisterViewModel.phoneNo.getValue()
            //         is RegisterViewModel.phoneNo.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtPhoneNo);
            // localize variables for thread safety
            // RegisterViewModel.phoneNo != null
            boolean registerViewModelPhoneNoJavaLangObjectNull = false;
            // RegisterViewModel != null
            boolean registerViewModelJavaLangObjectNull = false;
            // RegisterViewModel
            com.mohann.covid19.loginandregistration.RegisterViewModel registerViewModel = mRegisterViewModel;
            // RegisterViewModel.phoneNo
            androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelPhoneNo = null;
            // RegisterViewModel.phoneNo.getValue()
            java.lang.String registerViewModelPhoneNoGetValue = null;



            registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
            if (registerViewModelJavaLangObjectNull) {


                registerViewModelPhoneNo = registerViewModel.phoneNo;

                registerViewModelPhoneNoJavaLangObjectNull = (registerViewModelPhoneNo) != (null);
                if (registerViewModelPhoneNoJavaLangObjectNull) {




                    registerViewModelPhoneNo.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityRegistrationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityRegistrationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.Button) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , null
            , null
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[6]
            );
        this.btnLogin.setTag(null);
        this.clRegister.setTag(null);
        this.txtConfirmPassword.setTag(null);
        this.txtEmailAddress.setTag(null);
        this.txtFirstName.setTag(null);
        this.txtLastName.setTag(null);
        this.txtPassword.setTag(null);
        this.txtPhoneNo.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.mohann.covid19.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.RegisterViewModel == variableId) {
            setRegisterViewModel((com.mohann.covid19.loginandregistration.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRegisterViewModel(@Nullable com.mohann.covid19.loginandregistration.RegisterViewModel RegisterViewModel) {
        this.mRegisterViewModel = RegisterViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.RegisterViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRegisterViewModelLastName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeRegisterViewModelConfirmPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeRegisterViewModelFirstName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeRegisterViewModelEMail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeRegisterViewModelPhoneNo((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeRegisterViewModelPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRegisterViewModelLastName(androidx.lifecycle.MutableLiveData<java.lang.String> RegisterViewModelLastName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterViewModelConfirmPassword(androidx.lifecycle.MutableLiveData<java.lang.String> RegisterViewModelConfirmPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterViewModelFirstName(androidx.lifecycle.MutableLiveData<java.lang.String> RegisterViewModelFirstName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterViewModelEMail(androidx.lifecycle.MutableLiveData<java.lang.String> RegisterViewModelEMail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterViewModelPhoneNo(androidx.lifecycle.MutableLiveData<java.lang.String> RegisterViewModelPhoneNo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRegisterViewModelPassword(androidx.lifecycle.MutableLiveData<java.lang.String> RegisterViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String registerViewModelEMailGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelLastName = null;
        java.lang.String registerViewModelPasswordGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelConfirmPassword = null;
        java.lang.String registerViewModelLastNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelFirstName = null;
        java.lang.String registerViewModelPhoneNoGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelEMail = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelPhoneNo = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> registerViewModelPassword = null;
        java.lang.String registerViewModelConfirmPasswordGetValue = null;
        java.lang.String registerViewModelFirstNameGetValue = null;
        com.mohann.covid19.loginandregistration.RegisterViewModel registerViewModel = mRegisterViewModel;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (registerViewModel != null) {
                        // read RegisterViewModel.lastName
                        registerViewModelLastName = registerViewModel.lastName;
                    }
                    updateLiveDataRegistration(0, registerViewModelLastName);


                    if (registerViewModelLastName != null) {
                        // read RegisterViewModel.lastName.getValue()
                        registerViewModelLastNameGetValue = registerViewModelLastName.getValue();
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (registerViewModel != null) {
                        // read RegisterViewModel.confirmPassword
                        registerViewModelConfirmPassword = registerViewModel.confirmPassword;
                    }
                    updateLiveDataRegistration(1, registerViewModelConfirmPassword);


                    if (registerViewModelConfirmPassword != null) {
                        // read RegisterViewModel.confirmPassword.getValue()
                        registerViewModelConfirmPasswordGetValue = registerViewModelConfirmPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (registerViewModel != null) {
                        // read RegisterViewModel.firstName
                        registerViewModelFirstName = registerViewModel.firstName;
                    }
                    updateLiveDataRegistration(2, registerViewModelFirstName);


                    if (registerViewModelFirstName != null) {
                        // read RegisterViewModel.firstName.getValue()
                        registerViewModelFirstNameGetValue = registerViewModelFirstName.getValue();
                    }
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (registerViewModel != null) {
                        // read RegisterViewModel.eMail
                        registerViewModelEMail = registerViewModel.eMail;
                    }
                    updateLiveDataRegistration(3, registerViewModelEMail);


                    if (registerViewModelEMail != null) {
                        // read RegisterViewModel.eMail.getValue()
                        registerViewModelEMailGetValue = registerViewModelEMail.getValue();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (registerViewModel != null) {
                        // read RegisterViewModel.phoneNo
                        registerViewModelPhoneNo = registerViewModel.phoneNo;
                    }
                    updateLiveDataRegistration(4, registerViewModelPhoneNo);


                    if (registerViewModelPhoneNo != null) {
                        // read RegisterViewModel.phoneNo.getValue()
                        registerViewModelPhoneNoGetValue = registerViewModelPhoneNo.getValue();
                    }
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (registerViewModel != null) {
                        // read RegisterViewModel.password
                        registerViewModelPassword = registerViewModel.password;
                    }
                    updateLiveDataRegistration(5, registerViewModelPassword);


                    if (registerViewModelPassword != null) {
                        // read RegisterViewModel.password.getValue()
                        registerViewModelPasswordGetValue = registerViewModelPassword.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.btnLogin.setOnClickListener(mCallback4);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtConfirmPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtConfirmPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtEmailAddress, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtEmailAddressandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtFirstName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtFirstNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtLastName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtLastNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtPhoneNo, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtPhoneNoandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtConfirmPassword, registerViewModelConfirmPasswordGetValue);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmailAddress, registerViewModelEMailGetValue);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtFirstName, registerViewModelFirstNameGetValue);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtLastName, registerViewModelLastNameGetValue);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPassword, registerViewModelPasswordGetValue);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPhoneNo, registerViewModelPhoneNoGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // RegisterViewModel != null
        boolean registerViewModelJavaLangObjectNull = false;
        // RegisterViewModel
        com.mohann.covid19.loginandregistration.RegisterViewModel registerViewModel = mRegisterViewModel;



        registerViewModelJavaLangObjectNull = (registerViewModel) != (null);
        if (registerViewModelJavaLangObjectNull) {



            registerViewModel.onClick(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): RegisterViewModel.lastName
        flag 1 (0x2L): RegisterViewModel.confirmPassword
        flag 2 (0x3L): RegisterViewModel.firstName
        flag 3 (0x4L): RegisterViewModel.eMail
        flag 4 (0x5L): RegisterViewModel.phoneNo
        flag 5 (0x6L): RegisterViewModel.password
        flag 6 (0x7L): RegisterViewModel
        flag 7 (0x8L): null
    flag mapping end*/
    //end
}