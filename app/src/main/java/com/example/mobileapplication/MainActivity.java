package com.example.mobileapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] items = {"Nguyen Van A", "Le Thi B", "Phan Minh C"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.item_name, items);

        ListView listView = (ListView) findViewById(R.id.course_list);
        listView.setAdapter(adapter);
    }
}





