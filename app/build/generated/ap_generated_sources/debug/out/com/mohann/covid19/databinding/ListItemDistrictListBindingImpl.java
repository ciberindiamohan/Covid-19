package com.mohann.covid19.databinding;
import com.mohann.covid19.R;
import com.mohann.covid19.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemDistrictListBindingImpl extends ListItemDistrictListBinding  {

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
    private androidx.databinding.InverseBindingListener tvStateandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mDistrictWise.districtName
            //         is mDistrictWise.setDistrictName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvState);
            // localize variables for thread safety
            // mDistrictWise != null
            boolean mDistrictWiseJavaLangObjectNull = false;
            // mDistrictWise
            com.mohann.covid19.room.model.DistrictWiseModel mDistrictWise = mMDistrictWise;
            // mDistrictWise.districtName
            java.lang.String mDistrictWiseDistrictName = null;



            mDistrictWiseJavaLangObjectNull = (mDistrictWise) != (null);
            if (mDistrictWiseJavaLangObjectNull) {




                mDistrictWise.setDistrictName(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ListItemDistrictListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ListItemDistrictListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
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
        if (BR.mDistrictWise == variableId) {
            setMDistrictWise((com.mohann.covid19.room.model.DistrictWiseModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMDistrictWise(@Nullable com.mohann.covid19.room.model.DistrictWiseModel MDistrictWise) {
        this.mMDistrictWise = MDistrictWise;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mDistrictWise);
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
        int mDistrictWiseActive = 0;
        com.mohann.covid19.room.model.DistrictWiseModel mDistrictWise = mMDistrictWise;
        int mDistrictWiseConfirmed = 0;
        int mDistrictWiseRecovered = 0;
        java.lang.String mDistrictWiseDistrictName = null;
        int mDistrictWiseDeceased = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (mDistrictWise != null) {
                    // read mDistrictWise.active
                    mDistrictWiseActive = mDistrictWise.getActive();
                    // read mDistrictWise.confirmed
                    mDistrictWiseConfirmed = mDistrictWise.getConfirmed();
                    // read mDistrictWise.recovered
                    mDistrictWiseRecovered = mDistrictWise.getRecovered();
                    // read mDistrictWise.districtName
                    mDistrictWiseDistrictName = mDistrictWise.getDistrictName();
                    // read mDistrictWise.deceased
                    mDistrictWiseDeceased = mDistrictWise.getDeceased();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.mohann.covid19.utils.Converter.convertIntToDecimalConversion(this.tvActive, mDistrictWiseActive);
            com.mohann.covid19.utils.Converter.convertIntToDecimalConversion(this.tvConfirmed, mDistrictWiseConfirmed);
            com.mohann.covid19.utils.Converter.convertIntToDecimalConversion(this.tvDeceased, mDistrictWiseDeceased);
            com.mohann.covid19.utils.Converter.convertIntToDecimalConversion(this.tvRecovered, mDistrictWiseRecovered);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvState, mDistrictWiseDistrictName);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvState, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvStateandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mDistrictWise
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}