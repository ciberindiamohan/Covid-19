package com.mohann.covid19;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.mohann.covid19.databinding.ActivityDistrictBindingImpl;
import com.mohann.covid19.databinding.ActivityDistrictBindingLandImpl;
import com.mohann.covid19.databinding.ActivityLoginBindingImpl;
import com.mohann.covid19.databinding.ActivityLoginBindingLandImpl;
import com.mohann.covid19.databinding.ActivityRegistrationBindingImpl;
import com.mohann.covid19.databinding.ActivityRegistrationBindingLandImpl;
import com.mohann.covid19.databinding.FragmentHomeBindingImpl;
import com.mohann.covid19.databinding.FragmentHomeBindingLandImpl;
import com.mohann.covid19.databinding.FragmentWhoBindingImpl;
import com.mohann.covid19.databinding.FragmentWhoBindingLandImpl;
import com.mohann.covid19.databinding.ListItemDistrictListBindingImpl;
import com.mohann.covid19.databinding.ListItemDistrictListBindingLandImpl;
import com.mohann.covid19.databinding.ListItemStateListBindingImpl;
import com.mohann.covid19.databinding.ListItemStateListBindingLandImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDISTRICT = 1;

  private static final int LAYOUT_ACTIVITYLOGIN = 2;

  private static final int LAYOUT_ACTIVITYREGISTRATION = 3;

  private static final int LAYOUT_FRAGMENTHOME = 4;

  private static final int LAYOUT_FRAGMENTWHO = 5;

  private static final int LAYOUT_LISTITEMDISTRICTLIST = 6;

  private static final int LAYOUT_LISTITEMSTATELIST = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mohann.covid19.R.layout.activity_district, LAYOUT_ACTIVITYDISTRICT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mohann.covid19.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mohann.covid19.R.layout.activity_registration, LAYOUT_ACTIVITYREGISTRATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mohann.covid19.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mohann.covid19.R.layout.fragment_who, LAYOUT_FRAGMENTWHO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mohann.covid19.R.layout.list_item_district_list, LAYOUT_LISTITEMDISTRICTLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mohann.covid19.R.layout.list_item_state_list, LAYOUT_LISTITEMSTATELIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDISTRICT: {
          if ("layout-land/activity_district_0".equals(tag)) {
            return new ActivityDistrictBindingLandImpl(component, view);
          }
          if ("layout/activity_district_0".equals(tag)) {
            return new ActivityDistrictBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_district is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout-land/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingLandImpl(component, view);
          }
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREGISTRATION: {
          if ("layout-land/activity_registration_0".equals(tag)) {
            return new ActivityRegistrationBindingLandImpl(component, view);
          }
          if ("layout/activity_registration_0".equals(tag)) {
            return new ActivityRegistrationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_registration is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout-land/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingLandImpl(component, view);
          }
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWHO: {
          if ("layout/fragment_who_0".equals(tag)) {
            return new FragmentWhoBindingImpl(component, view);
          }
          if ("layout-land/fragment_who_0".equals(tag)) {
            return new FragmentWhoBindingLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_who is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMDISTRICTLIST: {
          if ("layout-land/list_item_district_list_0".equals(tag)) {
            return new ListItemDistrictListBindingLandImpl(component, view);
          }
          if ("layout/list_item_district_list_0".equals(tag)) {
            return new ListItemDistrictListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_district_list is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMSTATELIST: {
          if ("layout/list_item_state_list_0".equals(tag)) {
            return new ListItemStateListBindingImpl(component, view);
          }
          if ("layout-land/list_item_state_list_0".equals(tag)) {
            return new ListItemStateListBindingLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_state_list is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(10);

    static {
      sKeys.put(1, "LoginViewModel");
      sKeys.put(2, "RegisterViewModel");
      sKeys.put(0, "_all");
      sKeys.put(3, "mDistrictListAdapter");
      sKeys.put(4, "mDistrictViewModel");
      sKeys.put(5, "mDistrictWise");
      sKeys.put(6, "mHomeDataModel");
      sKeys.put(7, "mStateListAdapter");
      sKeys.put(8, "mStateWise");
      sKeys.put(9, "mWhoViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(14);

    static {
      sKeys.put("layout-land/activity_district_0", com.mohann.covid19.R.layout.activity_district);
      sKeys.put("layout/activity_district_0", com.mohann.covid19.R.layout.activity_district);
      sKeys.put("layout-land/activity_login_0", com.mohann.covid19.R.layout.activity_login);
      sKeys.put("layout/activity_login_0", com.mohann.covid19.R.layout.activity_login);
      sKeys.put("layout-land/activity_registration_0", com.mohann.covid19.R.layout.activity_registration);
      sKeys.put("layout/activity_registration_0", com.mohann.covid19.R.layout.activity_registration);
      sKeys.put("layout-land/fragment_home_0", com.mohann.covid19.R.layout.fragment_home);
      sKeys.put("layout/fragment_home_0", com.mohann.covid19.R.layout.fragment_home);
      sKeys.put("layout/fragment_who_0", com.mohann.covid19.R.layout.fragment_who);
      sKeys.put("layout-land/fragment_who_0", com.mohann.covid19.R.layout.fragment_who);
      sKeys.put("layout-land/list_item_district_list_0", com.mohann.covid19.R.layout.list_item_district_list);
      sKeys.put("layout/list_item_district_list_0", com.mohann.covid19.R.layout.list_item_district_list);
      sKeys.put("layout/list_item_state_list_0", com.mohann.covid19.R.layout.list_item_state_list);
      sKeys.put("layout-land/list_item_state_list_0", com.mohann.covid19.R.layout.list_item_state_list);
    }
  }
}
