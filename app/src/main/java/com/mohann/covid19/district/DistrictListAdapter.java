package com.mohann.covid19.district;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.mohann.covid19.BR;
import com.mohann.covid19.R;
import com.mohann.covid19.databinding.ListItemDistrictListBinding;
import com.mohann.covid19.room.model.DistrictWiseModel;

import java.util.ArrayList;
import java.util.List;


public class DistrictListAdapter extends RecyclerView.Adapter<DistrictListAdapter.ViewHolder> {

    private List<DistrictWiseModel> districtWiseModelList = new ArrayList<>();
    private Context context;
    ListItemDistrictListBinding binding;

    DistrictListAdapter(List<DistrictWiseModel> districtWiseModelList, Context ctx) {
        this.districtWiseModelList = districtWiseModelList;
        context = ctx;
    }

    @NonNull
    @Override
    public DistrictListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.list_item_district_list, parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DistrictListAdapter.ViewHolder holder, int position) {
        DistrictWiseModel districtWiseModel = districtWiseModelList.get(position);
        holder.bind(districtWiseModel);

        if(districtWiseModelList.size()==position+1){
            binding.clLIstData.setBackgroundColor(context.getResources().getColor(R.color.grey_background));
        } else {
            if (position % 2 == 0) {
                binding.clLIstData.setBackgroundColor(context.getResources().getColor(R.color.grey_background));
            } else {
                binding.clLIstData.setBackgroundColor(context.getResources().getColor(R.color.white));
            }
        }

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ListItemDistrictListBinding binding;

        public ViewHolder(ListItemDistrictListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Object obj) {
            binding.setVariable(BR.mDistrictWise, obj);
            binding.executePendingBindings();
        }
    }

    @Override
    public int getItemCount() {
        return districtWiseModelList.size();
    }
}
