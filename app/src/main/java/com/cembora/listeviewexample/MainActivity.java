package com.cembora.listeviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.cembora.listeviewexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners(){
        binding.arrayAdapter.setOnClickListener(v->{
            Intent intent = new Intent(getApplicationContext(),ArrayAdapterActivity.class);
            startActivity(intent);
        });
        binding.btnCustomAdapter.setOnClickListener(v->{
            Intent intent = new Intent(getApplicationContext(),CustomAdapterActivity.class);
            startActivity(intent);
        });
    }



}