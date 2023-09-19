package com.example.mobileapplication;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Switch switchView;
    private TextView statusTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchView = findViewById(R.id.idSwitch);
        statusTV = findViewById(R.id.idTVStatus);

        // Nếu Switch được set True thì text của phần tử có id là statusTV sẽ được gán là "Switch is Checked"
        // Ngược lại thì là "Switch is UnChecked"
        if (switchView.isChecked()) {
            statusTV.setText("Switch is Checked");
        } else {
            statusTV.setText("Switch is UnChecked");
        }

        switchView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    statusTV.setText("Switch is Checked");
                } else {
                    statusTV.setText("Switch is UnChecked");
                }
            }
        });
    }
}
