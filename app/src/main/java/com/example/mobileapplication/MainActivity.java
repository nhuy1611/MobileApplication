package com.example.mobileapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] items = {"Nguyen Van A", "Le Thi 8", "Phan Minh C"};
        ListView listView = (ListView) findViewById(R.id.list_view);
        DataAdapter adapter = new DataAdapter(items, null);
        listView.setAdapter(adapter);
    }
}
