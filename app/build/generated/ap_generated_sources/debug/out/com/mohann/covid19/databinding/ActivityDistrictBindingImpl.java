package com.mohann.covid19.databinding;
import com.mohann.covid19.R;
import com.mohann.covid19.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDistrictBindingImpl extends ActivityDistrictBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appBar, 6);
        sViewsWithIds.put(R.id.toolbar, 7);
        sViewsWithIds.put(R.id.clHeader, 8);
        sViewsWithIds.put(R.id.tvConfirmed, 9);
        sViewsWithIds.put(R.id.tvActive, 10);
        sViewsWithIds.put(R.id.tvRecovered, 11);
        sViewsWithIds.put(R.id.tvDeceased, 12);
        sViewsWithIds.put(R.id.clHeaderState, 13);
        sViewsWithIds.put(R.id.tvDummyOne, 14);
        sViewsWithIds.put(R.id.tvState, 15);
        sViewsWithIds.put(R.id.tvDummyTwo, 16);
        sViewsWithIds.put(R.id.tvConfirmedHeader, 17);
        sViewsWithIds.put(R.id.tvDummyThree, 18);
        sViewsWithIds.put(R.id.tvActiveHeader, 19);
        sViewsWithIds.put(R.id.tvDummyFour, 20);
        sViewsWithIds.put(R.id.tvRecoveredHeader, 21);
        sViewsWithIds.put(R.id.tvDummyFive, 22);
        sViewsWithIds.put(R.id.tvDeceasedHeader, 23);
        sViewsWithIds.put(R.id.tvDummySix, 24);
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
            // Inverse of mDistrictViewModel.active
            //         is mDistrictViewModel.setActive((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvActiveValue);
            // localize variables for thread safety
            // mDistrictViewModel.active
            java.lang.String mDistrictViewModelActive = null;
            // mDistrictViewModel
            com.mohann.covid19.room.model.StateWiseModel mDistrictViewModel = mMDistrictViewModel;
            // mDistrictViewModel != null
            boolean mDistrictViewModelJavaLangObjectNull = false;



            mDistrictViewModelJavaLangObjectNull = (mDistrictViewModel) != (null);
            if (mDistrictViewModelJavaLangObjectNull) {




                mDistrictViewModel.setActive(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvConfirmedValueandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mDistrictViewModel.confirmed
            //         is mDistrictViewModel.setConfirmed((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvConfirmedValue);
            // localize variables for thread safety
            // mDistrictViewModel
            com.mohann.covid19.room.model.StateWiseModel mDistrictViewModel = mMDistrictViewModel;
            // mDistrictViewModel != null
            boolean mDistrictViewModelJavaLangObjectNull = false;
            // mDistrictViewModel.confirmed
            java.lang.String mDistrictViewModelConfirmed = null;



            mDistrictViewModelJavaLangObjectNull = (mDistrictViewModel) != (null);
            if (mDistrictViewModelJavaLangObjectNull) {




                mDistrictViewModel.setConfirmed(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvDeceasedValueandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mDistrictViewModel.deaths
            //         is mDistrictViewModel.setDeaths((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvDeceasedValue);
            // localize variables for thread safety
            // mDistrictViewModel.deaths
            java.lang.String mDistrictViewModelDeaths = null;
            // mDistrictViewModel
            com.mohann.covid19.room.model.StateWiseModel mDistrictViewModel = mMDistrictViewModel;
            // mDistrictViewModel != null
            boolean mDistrictViewModelJavaLangObjectNull = false;



            mDistrictViewModelJavaLangObjectNull = (mDistrictViewModel) != (null);
            if (mDistrictViewModelJavaLangObjectNull) {




                mDistrictViewModel.setDeaths(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvRecoveredValueandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mDistrictViewModel.recovered
            //         is mDistrictViewModel.setRecovered((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvRecoveredValue);
            // localize variables for thread safety
            // mDistrictViewModel
            com.mohann.covid19.room.model.StateWiseModel mDistrictViewModel = mMDistrictViewModel;
            // mDistrictViewModel != null
            boolean mDistrictViewModelJavaLangObjectNull = false;
            // mDistrictViewModel.recovered
            java.lang.String mDistrictViewModelRecovered = null;



            mDistrictViewModelJavaLangObjectNull = (mDistrictViewModel) != (null);
            if (mDistrictViewModelJavaLangObjectNull) {




                mDistrictViewModel.setRecovered(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityDistrictBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private ActivityDistrictBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.appcompat.widget.Toolbar) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[15]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvDistrict.setTag(null);
        this.tvActiveValue.setTag(null);
        this.tvConfirmedValue.setTag(null);
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
        if (BR.mDistrictViewModel == variableId) {
            setMDistrictViewModel((com.mohann.covid19.room.model.StateWiseModel) variable);
        }
        else if (BR.mDistrictListAdapter == variableId) {
            setMDistrictListAdapter((com.mohann.covid19.district.DistrictListAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMDistrictViewModel(@Nullable com.mohann.covid19.room.model.StateWiseModel MDistrictViewModel) {
        this.mMDistrictViewModel = MDistrictViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mDistrictViewModel);
        super.requestRebind();
    }
    public void setMDistrictListAdapter(@Nullable com.mohann.covid19.district.DistrictListAdapter MDistrictListAdapter) {
        this.mMDistrictListAdapter = MDistrictListAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.mDistrictListAdapter);
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
        java.lang.String mDistrictViewModelRecovered = null;
        java.lang.String mDistrictViewModelDeaths = null;
        com.mohann.covid19.room.model.StateWiseModel mDistrictViewModel = mMDistrictViewModel;
        java.lang.String mDistrictViewModelActive = null;
        java.lang.String mDistrictViewModelConfirmed = null;
        com.mohann.covid19.district.DistrictListAdapter mDistrictListAdapter = mMDistrictListAdapter;

        if ((dirtyFlags & 0x5L) != 0) {



                if (mDistrictViewModel != null) {
                    // read mDistrictViewModel.recovered
                    mDistrictViewModelRecovered = mDistrictViewModel.getRecovered();
                    // read mDistrictViewModel.deaths
                    mDistrictViewModelDeaths = mDistrictViewModel.getDeaths();
                    // read mDistrictViewModel.active
                    mDistrictViewModelActive = mDistrictViewModel.getActive();
                    // read mDistrictViewModel.confirmed
                    mDistrictViewModelConfirmed = mDistrictViewModel.getConfirmed();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.rvDistrict.setAdapter(mDistrictListAdapter);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvActiveValue, mDistrictViewModelActive);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvConfirmedValue, mDistrictViewModelConfirmed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDeceasedValue, mDistrictViewModelDeaths);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRecoveredValue, mDistrictViewModelRecovered);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvActiveValue, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvActiveValueandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvConfirmedValue, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvConfirmedValueandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvDeceasedValue, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvDeceasedValueandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvRecoveredValue, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvRecoveredValueandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mDistrictViewModel
        flag 1 (0x2L): mDistrictListAdapter
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}