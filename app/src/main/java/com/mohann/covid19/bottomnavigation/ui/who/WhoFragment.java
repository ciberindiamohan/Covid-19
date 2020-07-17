package com.mohann.covid19.bottomnavigation.ui.who;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mohann.covid19.R;
import com.mohann.covid19.databinding.FragmentWhoBinding;
import com.mohann.covid19.who.WhoActivity;

import static com.mohann.covid19.utils.Constants.WHO_URL;

public class WhoFragment extends Fragment {

    private WhoViewModel whoViewModel;
    private FragmentWhoBinding binding;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        whoViewModel = new
                ViewModelProvider(this).get(WhoViewModel.class);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_who,
                container,
                false
        );

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding.setMWhoViewModel(whoViewModel);

        whoViewModel.whoInt.observe(getViewLifecycleOwner(), aBoolean -> {
            Intent intent = new Intent(getActivity(), WhoActivity.class);
            intent.putExtra(WHO_URL, getString(R.string.who_int));
            startActivity(intent);
        });

        whoViewModel.whoRss.observe(getViewLifecycleOwner(), aBoolean -> {
            Intent intent = new Intent(getActivity(), WhoActivity.class);
            intent.putExtra(WHO_URL, getString(R.string.who_rss));
            startActivity(intent);
        });
    }
}
