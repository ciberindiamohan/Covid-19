package com.mohann.covid19.databinding;
import com.mohann.covid19.R;
import com.mohann.covid19.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentWhoBindingLandImpl extends FragmentWhoBinding implements com.mohann.covid19.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textWhoIntHeader, 3);
        sViewsWithIds.put(R.id.textWhoRssHeader, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentWhoBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentWhoBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textWhoInt.setTag(null);
        this.textWhoRss.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.mohann.covid19.generated.callback.OnClickListener(this, 1);
        mCallback8 = new com.mohann.covid19.generated.callback.OnClickListener(this, 2);
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
        if (BR.mWhoViewModel == variableId) {
            setMWhoViewModel((com.mohann.covid19.bottomnavigation.ui.who.WhoViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMWhoViewModel(@Nullable com.mohann.covid19.bottomnavigation.ui.who.WhoViewModel MWhoViewModel) {
        this.mMWhoViewModel = MWhoViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mWhoViewModel);
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
        com.mohann.covid19.bottomnavigation.ui.who.WhoViewModel mWhoViewModel = mMWhoViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.textWhoInt.setOnClickListener(mCallback7);
            this.textWhoRss.setOnClickListener(mCallback8);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // mWhoViewModel != null
                boolean mWhoViewModelJavaLangObjectNull = false;
                // mWhoViewModel
                com.mohann.covid19.bottomnavigation.ui.who.WhoViewModel mWhoViewModel = mMWhoViewModel;



                mWhoViewModelJavaLangObjectNull = (mWhoViewModel) != (null);
                if (mWhoViewModelJavaLangObjectNull) {


                    mWhoViewModel.whoInt();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // mWhoViewModel != null
                boolean mWhoViewModelJavaLangObjectNull = false;
                // mWhoViewModel
                com.mohann.covid19.bottomnavigation.ui.who.WhoViewModel mWhoViewModel = mMWhoViewModel;



                mWhoViewModelJavaLangObjectNull = (mWhoViewModel) != (null);
                if (mWhoViewModelJavaLangObjectNull) {


                    mWhoViewModel.whoRss();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mWhoViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}