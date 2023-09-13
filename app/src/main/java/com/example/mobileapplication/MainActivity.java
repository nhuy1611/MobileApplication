package com.example.mobileapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button showProgressBtn;
    private ProgressBar loadingPB;
    boolean isProgressVisible = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showProgressBtn = findViewById(R.id.idBtnDisplayProgress);
        loadingPB = findViewById(R.id.idPBLoading);
        showProgressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isProgressVisible){
                    showProgressBtn.setText("Show Progress Bar");
                    loadingPB.setVisibility(View.GONE);
                    isProgressVisible = false;
                } else {
                    isProgressVisible = true;
                    showProgressBtn.setText("Hide Progress Bar");
                    loadingPB.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}

