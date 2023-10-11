package com.cembora.listeviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    final List<Animal> animals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        animals.add(new Animal("Ant",R.drawable.ant));
        animals.add(new Animal("Cat",R.drawable.kedi));
        animals.add(new Animal("Dog",R.drawable.dog));
        animals.add(new Animal("Bear",R.drawable.ant));
        animals.add(new Animal("Snake",R.drawable.ant));
        animals.add(new Animal("Spider",R.drawable.ant));

        final ListView listView = (ListView) findViewById(R.id.listView);
        AnimalAdapter adapter = new AnimalAdapter(this,animals);
        listView.setAdapter(adapter);




    }
}