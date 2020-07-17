// Generated by data binding compiler. Do not edit!
package com.mohann.covid19.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.mohann.covid19.R;
import com.mohann.covid19.room.model.StateWiseModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemStateListBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clLIstData;

  @NonNull
  public final ConstraintLayout clStateWise;

  @NonNull
  public final TextView tvActive;

  @NonNull
  public final TextView tvConfirmed;

  @NonNull
  public final TextView tvDeceased;

  @NonNull
  public final TextView tvDummyFive;

  @NonNull
  public final TextView tvDummyFour;

  @NonNull
  public final TextView tvDummyOne;

  @NonNull
  public final TextView tvDummySix;

  @NonNull
  public final TextView tvDummyThree;

  @NonNull
  public final TextView tvDummyTwo;

  @NonNull
  public final TextView tvRecovered;

  @NonNull
  public final TextView tvState;

  @Bindable
  protected StateWiseModel mMStateWise;

  protected ListItemStateListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clLIstData, ConstraintLayout clStateWise, TextView tvActive,
      TextView tvConfirmed, TextView tvDeceased, TextView tvDummyFive, TextView tvDummyFour,
      TextView tvDummyOne, TextView tvDummySix, TextView tvDummyThree, TextView tvDummyTwo,
      TextView tvRecovered, TextView tvState) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clLIstData = clLIstData;
    this.clStateWise = clStateWise;
    this.tvActive = tvActive;
    this.tvConfirmed = tvConfirmed;
    this.tvDeceased = tvDeceased;
    this.tvDummyFive = tvDummyFive;
    this.tvDummyFour = tvDummyFour;
    this.tvDummyOne = tvDummyOne;
    this.tvDummySix = tvDummySix;
    this.tvDummyThree = tvDummyThree;
    this.tvDummyTwo = tvDummyTwo;
    this.tvRecovered = tvRecovered;
    this.tvState = tvState;
  }

  public abstract void setMStateWise(@Nullable StateWiseModel mStateWise);

  @Nullable
  public StateWiseModel getMStateWise() {
    return mMStateWise;
  }

  @NonNull
  public static ListItemStateListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_state_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemStateListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemStateListBinding>inflateInternal(inflater, R.layout.list_item_state_list, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemStateListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_state_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemStateListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemStateListBinding>inflateInternal(inflater, R.layout.list_item_state_list, null, false, component);
  }

  public static ListItemStateListBinding bind(@NonNull View view) {
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
  public static ListItemStateListBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemStateListBinding)bind(component, view, R.layout.list_item_state_list);
  }
}
