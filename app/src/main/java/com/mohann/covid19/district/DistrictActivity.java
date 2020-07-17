package com.mohann.covid19.district;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mohann.covid19.R;
import com.mohann.covid19.room.model.DistrictWiseModel;
import com.mohann.covid19.room.model.StateWiseModel;

import java.util.List;

public class DistrictActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.mohann.covid19.databinding.ActivityDistrictBinding activityDistrictBinding = DataBindingUtil.setContentView(this, R.layout.activity_district);
        Toolbar toolbar = findViewById(R.id.toolbar);
        RecyclerView rvDistrict = findViewById(R.id.rvDistrict);
        DistrictViewModel districtViewModel = new ViewModelProvider(this).get(DistrictViewModel.class);

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        rvDistrict.setNestedScrollingEnabled(false);
        Bundle bundle = getIntent().getBundleExtra("bundle");
        if (bundle != null) {
            StateWiseModel stateWiseModel = (StateWiseModel) bundle.getSerializable("stateWiseModel");
            if (stateWiseModel != null) {
                getSupportActionBar().setTitle(stateWiseModel.getState());
                districtViewModel.setData(stateWiseModel);
                activityDistrictBinding.setMDistrictViewModel(stateWiseModel);
                DistrictListAdapter districtWiseAdapter = new DistrictListAdapter(new Gson().fromJson((String) bundle.getSerializable("districtWiseModels"), new TypeToken<List<DistrictWiseModel>>() {
                }.getType()), this);
                activityDistrictBinding.setMDistrictListAdapter(districtWiseAdapter);
                activityDistrictBinding.executePendingBindings();
            }
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}