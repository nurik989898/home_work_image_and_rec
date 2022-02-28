package com.example.home_work_image_and_rec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.home_work_image_and_rec.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.container,new MainFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.containerTwo,new SecondFragment()).commit();
    }
}