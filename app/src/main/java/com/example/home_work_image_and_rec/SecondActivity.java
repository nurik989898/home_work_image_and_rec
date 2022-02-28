package com.example.home_work_image_and_rec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.home_work_image_and_rec.databinding.ActivityMainBinding;
import com.example.home_work_image_and_rec.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        String text = getIntent().getStringExtra("key");
        binding.ActivitySecond.setText(text);



    }
}