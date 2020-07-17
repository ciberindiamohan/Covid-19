// Generated by data binding compiler. Do not edit!
package com.mohann.covid19.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.mohann.covid19.R;
import com.mohann.covid19.bottomnavigation.ui.who.WhoViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentWhoBinding extends ViewDataBinding {
  @NonNull
  public final TextView textWhoInt;

  @NonNull
  public final TextView textWhoIntHeader;

  @NonNull
  public final TextView textWhoRss;

  @NonNull
  public final TextView textWhoRssHeader;

  @Bindable
  protected WhoViewModel mMWhoViewModel;

  protected FragmentWhoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView textWhoInt, TextView textWhoIntHeader, TextView textWhoRss,
      TextView textWhoRssHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.textWhoInt = textWhoInt;
    this.textWhoIntHeader = textWhoIntHeader;
    this.textWhoRss = textWhoRss;
    this.textWhoRssHeader = textWhoRssHeader;
  }

  public abstract void setMWhoViewModel(@Nullable WhoViewModel mWhoViewModel);

  @Nullable
  public WhoViewModel getMWhoViewModel() {
    return mMWhoViewModel;
  }

  @NonNull
  public static FragmentWhoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_who, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWhoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentWhoBinding>inflateInternal(inflater, R.layout.fragment_who, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentWhoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_who, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWhoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentWhoBinding>inflateInternal(inflater, R.layout.fragment_who, null, false, component);
  }

  public static FragmentWhoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentWhoBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentWhoBinding)bind(component, view, R.layout.fragment_who);
  }
}
