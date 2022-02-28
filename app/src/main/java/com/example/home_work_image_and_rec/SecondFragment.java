package com.example.home_work_image_and_rec;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home_work_image_and_rec.databinding.FragmentMainBinding;
import com.example.home_work_image_and_rec.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements OnClick {
    private @NonNull FragmentSecondBinding binding;
    private OnClick onClick;
    private ArrayList<App> apps;
    private AppAdaptor adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new AppAdaptor(apps , this);
        binding.recicler0ne.setAdapter(adapter);
    }

    private void loadData() {
        apps = new ArrayList<>();
        apps.add(new App("Blanko Space","Taylor Swift","1","2 : 45"));
        apps.add(new App("Watch Me","Silento","2","3 : 00"));
        apps.add(new App("Earned It","The Weekend","3","3:35"));
        apps.add(new App("The Hills","The Weekend","4","5 : 56"));
        apps.add(new App("Writing's On The Wall","Joly","5","1:50"));
        apps.add(new App("Edsheeran","jhsdbjsd","6","0 : 23"));
        apps.add(new App("Edsheeran","jhsdbjsd","7","9 : 00"));
        apps.add(new App("Edsheeran","jhsdbjsd","8","3:44"));
    }

    @Override
    public void onClick(App app) {
        Intent intent = new Intent(requireActivity(),SecondActivity.class);
        intent.putExtra("key",app.getName());
        startActivity(intent);
    }
}
