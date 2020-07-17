package com.mohann.covid19.databinding;
import com.mohann.covid19.R;
import com.mohann.covid19.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingLandImpl extends ActivityLoginBinding implements com.mohann.covid19.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clLogin, 4);
        sViewsWithIds.put(R.id.lblTitle, 5);
        sViewsWithIds.put(R.id.guideLine, 6);
        sViewsWithIds.put(R.id.guideLineOne, 7);
        sViewsWithIds.put(R.id.guideLineTwo, 8);
        sViewsWithIds.put(R.id.tvRegister, 9);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener txtEmailAddressandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of LoginViewModel.eMail.getValue()
            //         is LoginViewModel.eMail.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtEmailAddress);
            // localize variables for thread safety
            // LoginViewModel
            com.mohann.covid19.loginandregistration.LoginViewModel loginViewModel = mLoginViewModel;
            // LoginViewModel.eMail.getValue()
            java.lang.String loginViewModelEMailGetValue = null;
            // LoginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // LoginViewModel.eMail != null
            boolean loginViewModelEMailJavaLangObjectNull = false;
            // LoginViewModel.eMail
            androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelEMail = null;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelEMail = loginViewModel.eMail;

                loginViewModelEMailJavaLangObjectNull = (loginViewModelEMail) != (null);
                if (loginViewModelEMailJavaLangObjectNull) {




                    loginViewModelEMail.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener txtPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of LoginViewModel.password.getValue()
            //         is LoginViewModel.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(txtPassword);
            // localize variables for thread safety
            // LoginViewModel
            com.mohann.covid19.loginandregistration.LoginViewModel loginViewModel = mLoginViewModel;
            // LoginViewModel != null
            boolean loginViewModelJavaLangObjectNull = false;
            // LoginViewModel.password
            androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelPassword = null;
            // LoginViewModel.password.getValue()
            java.lang.String loginViewModelPasswordGetValue = null;
            // LoginViewModel.password != null
            boolean loginViewModelPasswordJavaLangObjectNull = false;



            loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
            if (loginViewModelJavaLangObjectNull) {


                loginViewModelPassword = loginViewModel.password;

                loginViewModelPasswordJavaLangObjectNull = (loginViewModelPassword) != (null);
                if (loginViewModelPasswordJavaLangObjectNull) {




                    loginViewModelPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityLoginBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            );
        this.btnLogin.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.txtEmailAddress.setTag(null);
        this.txtPassword.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.mohann.covid19.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.LoginViewModel == variableId) {
            setLoginViewModel((com.mohann.covid19.loginandregistration.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginViewModel(@Nullable com.mohann.covid19.loginandregistration.LoginViewModel LoginViewModel) {
        this.mLoginViewModel = LoginViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.LoginViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLoginViewModelPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeLoginViewModelEMail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLoginViewModelPassword(androidx.lifecycle.MutableLiveData<java.lang.String> LoginViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeLoginViewModelEMail(androidx.lifecycle.MutableLiveData<java.lang.String> LoginViewModelEMail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.mohann.covid19.loginandregistration.LoginViewModel loginViewModel = mLoginViewModel;
        java.lang.String loginViewModelPasswordGetValue = null;
        java.lang.String loginViewModelEMailGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelPassword = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> loginViewModelEMail = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (loginViewModel != null) {
                        // read LoginViewModel.password
                        loginViewModelPassword = loginViewModel.password;
                    }
                    updateLiveDataRegistration(0, loginViewModelPassword);


                    if (loginViewModelPassword != null) {
                        // read LoginViewModel.password.getValue()
                        loginViewModelPasswordGetValue = loginViewModelPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (loginViewModel != null) {
                        // read LoginViewModel.eMail
                        loginViewModelEMail = loginViewModel.eMail;
                    }
                    updateLiveDataRegistration(1, loginViewModelEMail);


                    if (loginViewModelEMail != null) {
                        // read LoginViewModel.eMail.getValue()
                        loginViewModelEMailGetValue = loginViewModelEMail.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnLogin.setOnClickListener(mCallback5);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtEmailAddress, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtEmailAddressandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.txtPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, txtPasswordandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmailAddress, loginViewModelEMailGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPassword, loginViewModelPasswordGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // LoginViewModel
        com.mohann.covid19.loginandregistration.LoginViewModel loginViewModel = mLoginViewModel;
        // LoginViewModel != null
        boolean loginViewModelJavaLangObjectNull = false;



        loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
        if (loginViewModelJavaLangObjectNull) {



            loginViewModel.onClick(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): LoginViewModel.password
        flag 1 (0x2L): LoginViewModel.eMail
        flag 2 (0x3L): LoginViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}