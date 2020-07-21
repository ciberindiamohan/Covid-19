package com.mohann.covid19.bottomnavigation.ui.home;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;
import com.mohann.covid19.R;
import com.mohann.covid19.databinding.FragmentHomeBinding;
import com.mohann.covid19.district.DistrictActivity;
import com.mohann.covid19.model.TravelHistory;
import com.mohann.covid19.room.model.DistrictWiseModel;
import com.mohann.covid19.room.model.StateWiseModel;
import com.mohann.covid19.utils.Constants;
import com.mohann.covid19.utils.PreferenceConnector;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    private HomeDataModel homeDataModel = new HomeDataModel("", "", "", "", "");
    private ProgressBar iv_progress_view_centre;
    private RecyclerView rvState;
    private ConstraintLayout clFragmentHome;
    private final CompositeDisposable mDisposable = new CompositeDisposable();

    MapView mMapView;
    private GoogleMap googleMap;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_home,
                container,
                false
        );

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        iv_progress_view_centre = requireActivity().findViewById(R.id.iv_progress_view_centre);

        mMapView = (MapView) requireActivity().findViewById(R.id.mapView);
        mMapView.onCreate(savedInstanceState);
        mMapView.onResume(); // needed to get the map to display immediately

        try {
            MapsInitializer.initialize(getActivity().getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }

        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap mMap) {
                googleMap = mMap;

                if (getActivity() != null) {
                    if (isConnected(getActivity())) {
                        mDisposable.add(homeViewModel.deleteStateListData()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(() -> {
                            homeViewModel.init();
                            homeViewModel.getTravelHistory().observe(getViewLifecycleOwner(), travelHistoryResponse -> {
                                List<TravelHistory> travelHistoryModels = new ArrayList<>();
                                for (int i = 0; i < travelHistoryResponse.travel_history.size(); i++) {
                                    /*
                                    stateWiseModels.add(new StateWiseModel(
                                        covidResponse.getStatewise().get(i).getActive(), covidResponse.getStatewise().get(i).getConfirmed(),
                                        covidResponse.getStatewise().get(i).getDeaths(), covidResponse.getStatewise().get(i).getDeltaconfirmed(),
                                        covidResponse.getStatewise().get(i).getDeltadeaths(), covidResponse.getStatewise().get(i).getDeltarecovered(),
                                        covidResponse.getStatewise().get(i).getLastupdatedtime(), covidResponse.getStatewise().get(i).getMigratedother(),
                                        covidResponse.getStatewise().get(i).getRecovered(), covidResponse.getStatewise().get(i).getState(),
                                        covidResponse.getStatewise().get(i).getStatecode(), covidResponse.getStatewise().get(i).getStatenotes()));
                                     */

                                    String latlog = travelHistoryResponse.travel_history.get(i).latlong;
                                    if(latlog.length()!=0) {
                                        String[] parts = latlog.split(",");
                                        Double lat = Double.parseDouble(parts[0]);
                                        Double log = Double.parseDouble(parts[1]);

                                        // For showing a move to my location button
                                        // mMap.setMyLocationEnabled(true);

                                        // Add a marker
                                        LatLng india = new LatLng(lat,log);
                                        String address = travelHistoryResponse.travel_history.get(i).address;
                                        if(address.length()!=0) {
                                            mMap.addMarker(new MarkerOptions().position(india).title("Case found").snippet(address));
                                        }
                                        mMap.moveCamera(CameraUpdateFactory.newLatLng(india));
                                        mMap.animateCamera(CameraUpdateFactory.newLatLng(india));
                                        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                                        mMap.getUiSettings().setZoomGesturesEnabled(true);
                                        mMap.getUiSettings().setScrollGesturesEnabled(true);
                                        mMap.getUiSettings().setScrollGesturesEnabledDuringRotateOrZoom(true);
                                        mMap.getUiSettings().setZoomControlsEnabled(true);
                                    }
                                }
                            });
                        }));
                    }
                }
            }
        });

        rvState = requireActivity().findViewById(R.id.rvState);
        clFragmentHome = requireActivity().findViewById(R.id.clFragmentHome);
        if (getActivity() != null) {
            if (isConnected(getActivity())) {
                mDisposable.add(homeViewModel.deleteStateListData()
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(() -> {
                            homeViewModel.init();
                            homeViewModel.getHomeRepository().observe(getViewLifecycleOwner(), covidResponse -> {
                                List<StateWiseModel> stateWiseModels = new ArrayList<>();
                                for (int i = 0; i < covidResponse.getStatewise().size(); i++) {
                                    stateWiseModels.add(new StateWiseModel(
                                            covidResponse.getStatewise().get(i).getActive(), covidResponse.getStatewise().get(i).getConfirmed(),
                                            covidResponse.getStatewise().get(i).getDeaths(), covidResponse.getStatewise().get(i).getDeltaconfirmed(),
                                            covidResponse.getStatewise().get(i).getDeltadeaths(), covidResponse.getStatewise().get(i).getDeltarecovered(),
                                            covidResponse.getStatewise().get(i).getLastupdatedtime(), covidResponse.getStatewise().get(i).getMigratedother(),
                                            covidResponse.getStatewise().get(i).getRecovered(), covidResponse.getStatewise().get(i).getState(),
                                            covidResponse.getStatewise().get(i).getStatecode(), covidResponse.getStatewise().get(i).getStatenotes()));
                                }
                                mDisposable.add(homeViewModel.saveStateListData(stateWiseModels)
                                        .subscribeOn(Schedulers.io())
                                        .observeOn(AndroidSchedulers.mainThread())
                                        .subscribe(() -> {
                                            mDisposable.add(homeViewModel.deleteDistrictListData()
                                                    .subscribeOn(Schedulers.io())
                                                    .observeOn(AndroidSchedulers.mainThread())
                                                    .subscribe(() -> {
                                                                List<DistrictWiseModel> districtWiseModels = new ArrayList<>();
                                                                homeViewModel.getStateWiseCovidResults().observe(getViewLifecycleOwner(), districtWiseDataModels -> {
                                                                    for (int i = 0; i < districtWiseDataModels.size(); i++) {
                                                                        districtWiseModels.add(new DistrictWiseModel(
                                                                                districtWiseDataModels.get(i).getStateName(),
                                                                                districtWiseDataModels.get(i).getStateCode(),
                                                                                districtWiseDataModels.get(i).getDistrictName(),
                                                                                districtWiseDataModels.get(i).getActive(),
                                                                                districtWiseDataModels.get(i).getConfirmed(),
                                                                                districtWiseDataModels.get(i).getDeceased(),
                                                                                districtWiseDataModels.get(i).getRecovered(),
                                                                                districtWiseDataModels.get(i).getDeltaConfirmed(),
                                                                                districtWiseDataModels.get(i).getDeltaDeceased(),
                                                                                districtWiseDataModels.get(i).getDeltaRecovered()
                                                                        ));
                                                                    }
                                                                    mDisposable.add(homeViewModel.saveDistrictListData(districtWiseModels)
                                                                            .subscribeOn(Schedulers.io())
                                                                            .observeOn(AndroidSchedulers.mainThread())
                                                                            .subscribe(() -> {
                                                                                PreferenceConnector.writeBoolean(getActivity(), Constants.LIST_OFFLINE_PREF, true);
                                                                                retrieveListData();
                                                                            }, throwable -> {
                                                                                Toast.makeText(getActivity(), R.string.something_went_wrong, Toast.LENGTH_SHORT).show();
                                                                            }));
                                                                });
                                                            },
                                                            throwable -> {
                                                                Toast.makeText(getActivity(), R.string.something_went_wrong, Toast.LENGTH_SHORT).show();
                                                            }));
                                        }, throwable -> {
                                            Toast.makeText(getActivity(), R.string.something_went_wrong, Toast.LENGTH_SHORT).show();
                                        }));
                            });


                        }, throwable -> {
                            Toast.makeText(getActivity(), R.string.something_went_wrong, Toast.LENGTH_SHORT).show();
                        }));

            } else {
                if (!PreferenceConnector.readBoolean(getActivity(), Constants.LIST_OFFLINE_PREF, false)) {
                    iv_progress_view_centre.setVisibility(View.GONE);
                    Toast.makeText(getActivity(), R.string.check_internet_connectivity, Toast.LENGTH_SHORT).show();
                } else {
                    retrieveListData();
                }
            }

        } else {
            iv_progress_view_centre.setVisibility(View.GONE);
            Toast.makeText(getActivity(), R.string.something_went_wrong, Toast.LENGTH_SHORT).show();
        }

    }

    private void retrieveListData() {
        mDisposable.add(homeViewModel.getStateWiseModels()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(stateWiseModelList -> {
                            Collections.sort(stateWiseModelList, StateWiseModel.stateWiseModelComparator);
                            StateWiseModel stateWiseModelObj = stateWiseModelList.get(0);
                            stateWiseModelList.remove(stateWiseModelObj);
                            stateWiseModelList.add(stateWiseModelObj);
                            homeDataModel.setConfirmed(stateWiseModelList.get(stateWiseModelList.size() - 1).getConfirmed());
                            homeDataModel.setActive(stateWiseModelList.get(stateWiseModelList.size() - 1).getActive());
                            homeDataModel.setRecovered(stateWiseModelList.get(stateWiseModelList.size() - 1).getRecovered());
                            homeDataModel.setDeceased(stateWiseModelList.get(stateWiseModelList.size() - 1).getDeaths());
                            homeDataModel.setDate(dateWithTImeZone());
                            homeViewModel.setData(homeDataModel);
                            binding.setMHomeDataModel(homeDataModel);
                            rvState.setNestedScrollingEnabled(false);
                            StateListAdapter stateListAdapter = new StateListAdapter(stateWiseModelList, getActivity(), (position, stateWiseModel) -> {
                                mDisposable.add(homeViewModel.getDistrictWiseModels(stateWiseModel.getStatecode())
                                        .subscribeOn(Schedulers.io())
                                        .observeOn(AndroidSchedulers.mainThread())
                                        .subscribe(districtWiseModels -> {
                                            if (districtWiseModels.size() != 0) {
                                                Collections.sort(districtWiseModels, DistrictWiseModel.districtWiseModelComparator);
                                                districtWiseModels.add(new DistrictWiseModel("Total","Total",
                                                        "Total",Integer.parseInt(stateWiseModel.getActive().replace(",","")),
                                                        Integer.parseInt(stateWiseModel.getConfirmed().replace(",","")),
                                                        Integer.parseInt(stateWiseModel.getDeaths().replace(",","")),
                                                        Integer.parseInt(stateWiseModel.getRecovered().replace(",","")),
                                                        0,0,0));
                                                Intent intent = new Intent(getActivity(), DistrictActivity.class);
                                                Bundle bundle = new Bundle();
                                                bundle.putSerializable("stateWiseModel", stateWiseModel);
                                                bundle.putSerializable("districtWiseModels", new Gson().toJson(districtWiseModels));
                                                intent.putExtra("bundle", bundle);
                                                startActivity(intent);
                                            }
                                        }, throwable -> {
                                            Toast.makeText(getActivity(), R.string.something_went_wrong, Toast.LENGTH_SHORT).show();
                                        }));

                            });
                            binding.setMStateListAdapter(stateListAdapter);
                            binding.executePendingBindings();
                            iv_progress_view_centre.setVisibility(View.GONE);
                            clFragmentHome.setVisibility(View.VISIBLE);
                        },
                        throwable -> {
                            Toast.makeText(getActivity(), R.string.something_went_wrong, Toast.LENGTH_SHORT).show();
                        }));
    }

    private String dateWithTImeZone() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM, HH:mm aa", Locale.ENGLISH);
        StringBuilder initials = new StringBuilder();
        for (String s : TimeZone.getDefault().getDisplayName().split(" ")) {
            initials.append(s.charAt(0));
        }
        return sdf.format(cal.getTime()) + " " + initials;
    }

    private static boolean isConnected(Context context) {
        ConnectivityManager connectivityManager = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        assert connectivityManager != null;
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }



}
