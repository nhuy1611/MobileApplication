package com.example.mobileapplication;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // on below line we are creating a variable.
    private CheckBox checkBox;
    private TextView statusTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // on below line we are initializing our variables.
        checkBox = findViewById(R.id.idCheckBox);
        statusTV = findViewById(R.id.idTVStatus);

        // on below line we are checking
        // the status of check box
        if (checkBox.isChecked()) {
            // on below line we are setting text
            // if check box is checked.
            statusTV.setText("Checkbox is Checked");
        } else {
            // on below line we are setting the text
            // if check box is un checked
            statusTV.setText("Checkbox is UnChecked");
        }

        // on below line we are adding check change listener for our check box.
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // on below line we are checking if
                // checkbox is checked or not.
                if (isChecked) {
                    // on below line we are setting text
                    // if checkbox is checked.
                    statusTV.setText("Checkbox is Checked");
                } else {
                    // on below line we are setting text
                    // if checkbox is unchecked.
                    statusTV.setText("Checkbox is UnChecked");
                }
            }
        });
    }
}