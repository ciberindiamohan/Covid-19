package com.mohann.covid19.databinding;
import com.mohann.covid19.R;
import com.mohann.covid19.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemStateListBindingLandImpl extends ListItemStateListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.clLIstData, 6);
        sViewsWithIds.put(R.id.tvDummyOne, 7);
        sViewsWithIds.put(R.id.tvDummyTwo, 8);
        sViewsWithIds.put(R.id.tvDummyThree, 9);
        sViewsWithIds.put(R.id.tvDummyFour, 10);
        sViewsWithIds.put(R.id.tvDummyFive, 11);
        sViewsWithIds.put(R.id.tvDummySix, 12);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvActiveandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mStateWise.active
            //         is mStateWise.setActive((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvActive);
            // localize variables for thread safety
            // mStateWise != null
            boolean mStateWiseJavaLangObjectNull = false;
            // mStateWise.active
            java.lang.String mStateWiseActive = null;
            // mStateWise
            com.mohann.covid19.room.model.StateWiseModel mStateWise = mMStateWise;



            mStateWiseJavaLangObjectNull = (mStateWise) != (null);
            if (mStateWiseJavaLangObjectNull) {




                mStateWise.setActive(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvConfirmedandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mStateWise.confirmed
            //         is mStateWise.setConfirmed((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvConfirmed);
            // localize variables for thread safety
            // mStateWise != null
            boolean mStateWiseJavaLangObjectNull = false;
            // mStateWise.confirmed
            java.lang.String mStateWiseConfirmed = null;
            // mStateWise
            com.mohann.covid19.room.model.StateWiseModel mStateWise = mMStateWise;



            mStateWiseJavaLangObjectNull = (mStateWise) != (null);
            if (mStateWiseJavaLangObjectNull) {




                mStateWise.setConfirmed(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvDeceasedandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mStateWise.deaths
            //         is mStateWise.setDeaths((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvDeceased);
            // localize variables for thread safety
            // mStateWise != null
            boolean mStateWiseJavaLangObjectNull = false;
            // mStateWise.deaths
            java.lang.String mStateWiseDeaths = null;
            // mStateWise
            com.mohann.covid19.room.model.StateWiseModel mStateWise = mMStateWise;



            mStateWiseJavaLangObjectNull = (mStateWise) != (null);
            if (mStateWiseJavaLangObjectNull) {




                mStateWise.setDeaths(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvRecoveredandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mStateWise.recovered
            //         is mStateWise.setRecovered((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvRecovered);
            // localize variables for thread safety
            // mStateWise != null
            boolean mStateWiseJavaLangObjectNull = false;
            // mStateWise.recovered
            java.lang.String mStateWiseRecovered = null;
            // mStateWise
            com.mohann.covid19.room.model.StateWiseModel mStateWise = mMStateWise;



            mStateWiseJavaLangObjectNull = (mStateWise) != (null);
            if (mStateWiseJavaLangObjectNull) {




                mStateWise.setRecovered(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener tvStateandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mStateWise.state
            //         is mStateWise.setState((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvState);
            // localize variables for thread safety
            // mStateWise != null
            boolean mStateWiseJavaLangObjectNull = false;
            // mStateWise.state
            java.lang.String mStateWiseState = null;
            // mStateWise
            com.mohann.covid19.room.model.StateWiseModel mStateWise = mMStateWise;



            mStateWiseJavaLangObjectNull = (mStateWise) != (null);
            if (mStateWiseJavaLangObjectNull) {




                mStateWise.setState(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ListItemStateListBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ListItemStateListBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.clStateWise.setTag(null);
        this.tvActive.setTag(null);
        this.tvConfirmed.setTag(null);
        this.tvDeceased.setTag(null);
        this.tvRecovered.setTag(null);
        this.tvState.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.mStateWise == variableId) {
            setMStateWise((com.mohann.covid19.room.model.StateWiseModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMStateWise(@Nullable com.mohann.covid19.room.model.StateWiseModel MStateWise) {
        this.mMStateWise = MStateWise;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mStateWise);
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
        java.lang.String mStateWiseRecovered = null;
        java.lang.String mStateWiseActive = null;
        java.lang.String mStateWiseState = null;
        java.lang.String mStateWiseDeaths = null;
        java.lang.String mStateWiseConfirmed = null;
        com.mohann.covid19.room.model.StateWiseModel mStateWise = mMStateWise;

        if ((dirtyFlags & 0x3L) != 0) {



                if (mStateWise != null) {
                    // read mStateWise.recovered
                    mStateWiseRecovered = mStateWise.getRecovered();
                    // read mStateWise.active
                    mStateWiseActive = mStateWise.getActive();
                    // read mStateWise.state
                    mStateWiseState = mStateWise.getState();
                    // read mStateWise.deaths
                    mStateWiseDeaths = mStateWise.getDeaths();
                    // read mStateWise.confirmed
                    mStateWiseConfirmed = mStateWise.getConfirmed();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvActive, mStateWiseActive);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvConfirmed, mStateWiseConfirmed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDeceased, mStateWiseDeaths);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRecovered, mStateWiseRecovered);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvState, mStateWiseState);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvActive, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvActiveandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvConfirmed, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvConfirmedandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvDeceased, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvDeceasedandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvRecovered, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvRecoveredandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvState, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvStateandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mStateWise
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}