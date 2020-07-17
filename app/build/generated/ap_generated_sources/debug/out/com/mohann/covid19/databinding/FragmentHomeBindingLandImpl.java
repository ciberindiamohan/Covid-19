package com.mohann.covid19.databinding;
import com.mohann.covid19.R;
import com.mohann.covid19.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingLandImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_progress_view_centre, 7);
        sViewsWithIds.put(R.id.clFragmentHome, 8);
        sViewsWithIds.put(R.id.clHeader, 9);
        sViewsWithIds.put(R.id.tvConfirmed, 10);
        sViewsWithIds.put(R.id.tvActive, 11);
        sViewsWithIds.put(R.id.tvRecovered, 12);
        sViewsWithIds.put(R.id.tvDeceased, 13);
        sViewsWithIds.put(R.id.clHeaderState, 14);
        sViewsWithIds.put(R.id.tvDummyOne, 15);
        sViewsWithIds.put(R.id.tvState, 16);
        sViewsWithIds.put(R.id.tvDummyTwo, 17);
        sViewsWithIds.put(R.id.tvConfirmedHeader, 18);
        sViewsWithIds.put(R.id.tvDummyThree, 19);
        sViewsWithIds.put(R.id.tvActiveHeader, 20);
        sViewsWithIds.put(R.id.tvDummyFour, 21);
        sViewsWithIds.put(R.id.tvRecoveredHeader, 22);
        sViewsWithIds.put(R.id.tvDummyFive, 23);
        sViewsWithIds.put(R.id.tvDeceasedHeader, 24);
        sViewsWithIds.put(R.id.tvDummySix, 25);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvActiveValueandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mHomeDataModel.active
            //         is mHomeDataModel.setActive((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvActiveValue);
            // localize variables for thread safety
            // mHomeDataModel
            com.mohann.covid19.bottomnavigation.ui.home.HomeDataModel mHomeDataModel = mMHomeDataModel;
            // mHomeDataModel != null
            boolean mHomeDataModelJavaLangObjectNull = false;
            // mHomeDataModel.active
            java.lang.String mHomeDataModelActive = null;



            mHomeDataModelJavaLangObjectNull = (mHomeDataModel) != (null);
            if (mHomeDataModelJavaLangObjectNull) {




                mHomeDataModel.setActive(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvConfirmedValueandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mHomeDataModel.confirmed
            //         is mHomeDataModel.setConfirmed((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvConfirmedValue);
            // localize variables for thread safety
            // mHomeDataModel.confirmed
            java.lang.String mHomeDataModelConfirmed = null;
            // mHomeDataModel
            com.mohann.covid19.bottomnavigation.ui.home.HomeDataModel mHomeDataModel = mMHomeDataModel;
            // mHomeDataModel != null
            boolean mHomeDataModelJavaLangObjectNull = false;



            mHomeDataModelJavaLangObjectNull = (mHomeDataModel) != (null);
            if (mHomeDataModelJavaLangObjectNull) {




                mHomeDataModel.setConfirmed(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvDateandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mHomeDataModel.date
            //         is mHomeDataModel.setDate((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvDate);
            // localize variables for thread safety
            // mHomeDataModel
            com.mohann.covid19.bottomnavigation.ui.home.HomeDataModel mHomeDataModel = mMHomeDataModel;
            // mHomeDataModel != null
            boolean mHomeDataModelJavaLangObjectNull = false;
            // mHomeDataModel.date
            java.lang.String mHomeDataModelDate = null;



            mHomeDataModelJavaLangObjectNull = (mHomeDataModel) != (null);
            if (mHomeDataModelJavaLangObjectNull) {




                mHomeDataModel.setDate(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvDeceasedValueandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mHomeDataModel.deceased
            //         is mHomeDataModel.setDeceased((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvDeceasedValue);
            // localize variables for thread safety
            // mHomeDataModel
            com.mohann.covid19.bottomnavigation.ui.home.HomeDataModel mHomeDataModel = mMHomeDataModel;
            // mHomeDataModel.deceased
            java.lang.String mHomeDataModelDeceased = null;
            // mHomeDataModel != null
            boolean mHomeDataModelJavaLangObjectNull = false;



            mHomeDataModelJavaLangObjectNull = (mHomeDataModel) != (null);
            if (mHomeDataModelJavaLangObjectNull) {




                mHomeDataModel.setDeceased(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvRecoveredValueandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mHomeDataModel.recovered
            //         is mHomeDataModel.setRecovered((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvRecoveredValue);
            // localize variables for thread safety
            // mHomeDataModel
            com.mohann.covid19.bottomnavigation.ui.home.HomeDataModel mHomeDataModel = mMHomeDataModel;
            // mHomeDataModel.recovered
            java.lang.String mHomeDataModelRecovered = null;
            // mHomeDataModel != null
            boolean mHomeDataModelJavaLangObjectNull = false;



            mHomeDataModelJavaLangObjectNull = (mHomeDataModel) != (null);
            if (mHomeDataModelJavaLangObjectNull) {




                mHomeDataModel.setRecovered(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public FragmentHomeBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[14]
            , (android.widget.ProgressBar) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[16]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvState.setTag(null);
        this.tvActiveValue.setTag(null);
        this.tvConfirmedValue.setTag(null);
        this.tvDate.setTag(null);
        this.tvDeceasedValue.setTag(null);
        this.tvRecoveredValue.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.mHomeDataModel == variableId) {
            setMHomeDataModel((com.mohann.covid19.bottomnavigation.ui.home.HomeDataModel) variable);
        }
        else if (BR.mStateListAdapter == variableId) {
            setMStateListAdapter((com.mohann.covid19.bottomnavigation.ui.home.StateListAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMHomeDataModel(@Nullable com.mohann.covid19.bottomnavigation.ui.home.HomeDataModel MHomeDataModel) {
        this.mMHomeDataModel = MHomeDataModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mHomeDataModel);
        super.requestRebind();
    }
    public void setMStateListAdapter(@Nullable com.mohann.covid19.bottomnavigation.ui.home.StateListAdapter MStateListAdapter) {
        this.mMStateListAdapter = MStateListAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.mStateListAdapter);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String mHomeDataModelActive = null;
        java.lang.String mHomeDataModelRecovered = null;
        com.mohann.covid19.bottomnavigation.ui.home.HomeDataModel mHomeDataModel = mMHomeDataModel;
        java.lang.String mHomeDataModelConfirmed = null;
        com.mohann.covid19.bottomnavigation.ui.home.StateListAdapter mStateListAdapter = mMStateListAdapter;
        java.lang.String mHomeDataModelDeceased = null;
        java.lang.String mHomeDataModelDate = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (mHomeDataModel != null) {
                    // read mHomeDataModel.active
                    mHomeDataModelActive = mHomeDataModel.getActive();
                    // read mHomeDataModel.recovered
                    mHomeDataModelRecovered = mHomeDataModel.getRecovered();
                    // read mHomeDataModel.confirmed
                    mHomeDataModelConfirmed = mHomeDataModel.getConfirmed();
                    // read mHomeDataModel.deceased
                    mHomeDataModelDeceased = mHomeDataModel.getDeceased();
                    // read mHomeDataModel.date
                    mHomeDataModelDate = mHomeDataModel.getDate();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.rvState.setAdapter(mStateListAdapter);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvActiveValue, mHomeDataModelActive);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvConfirmedValue, mHomeDataModelConfirmed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDate, mHomeDataModelDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDeceasedValue, mHomeDataModelDeceased);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRecoveredValue, mHomeDataModelRecovered);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvActiveValue, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvActiveValueandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvConfirmedValue, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvConfirmedValueandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvDate, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvDateandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvDeceasedValue, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvDeceasedValueandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvRecoveredValue, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvRecoveredValueandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mHomeDataModel
        flag 1 (0x2L): mStateListAdapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}