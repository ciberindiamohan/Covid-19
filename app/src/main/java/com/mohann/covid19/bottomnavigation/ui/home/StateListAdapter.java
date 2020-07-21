package com.mohann.covid19.bottomnavigation.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.mohann.covid19.BR;
import com.mohann.covid19.R;
import com.mohann.covid19.databinding.ListItemStateListBinding;
import com.mohann.covid19.room.model.StateWiseModel;

import java.util.ArrayList;
import java.util.List;

public class StateListAdapter extends RecyclerView.Adapter<StateListAdapter.ViewHolder> {

    private List<StateWiseModel> stateWiseList = new ArrayList<>();
    private Context context;
    ListItemStateListBinding binding;
    OnItemClickListener onItemClickListener;

    StateListAdapter(List<StateWiseModel> stateWiseList, Context ctx, OnItemClickListener onItemClickListener) {
        this.stateWiseList = stateWiseList;
        this.onItemClickListener = onItemClickListener;
        context = ctx;
    }

    interface OnItemClickListener {
        void onItemClick(int position, StateWiseModel stateWiseModel);
    }


    @NonNull
    @Override
    public StateListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.list_item_state_list, parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull StateListAdapter.ViewHolder holder, int position) {
        StateWiseModel stateWise = stateWiseList.get(position);
        holder.bind(stateWise);
        if (stateWiseList.size() == position + 1) {
            binding.clLIstData.setBackgroundColor(context.getResources().getColor(R.color.grey_background));
        } else {
            if (position % 2 == 0) {
                binding.clLIstData.setBackgroundColor(context.getResources().getColor(R.color.grey_background));
            } else {
                binding.clLIstData.setBackgroundColor(context.getResources().getColor(R.color.white));
            }
        }
        holder.onClick(position, stateWiseList.get(position));
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ListItemStateListBinding binding;
        ConstraintLayout clStateWise;

        public ViewHolder(ListItemStateListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Object obj) {
            binding.setVariable(BR.mStateWise, obj);
            binding.executePendingBindings();
        }

        void onClick(int position, StateWiseModel stateWiseModel) {
            binding.clStateWise.setOnClickListener(view -> onItemClickListener.onItemClick(position, stateWiseModel));
        }
    }


    @Override
    public int getItemCount() {
        return stateWiseList.size();
    }
}
