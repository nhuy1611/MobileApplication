package com.example.mobileapplication;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Switch switchView;
    private TextView statusTV;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Tham chiếu đến các đối tượng Switch và TextView bằng phương thức findViewById
        // switchView được gán tham chiếu đến đối tượng Switch có id là idSwitch
        // statusTV được gán tham chiếu đến đối tượng TextView có id là idTVStatus
        switchView = findViewById(R.id.idSwitch);
        statusTV = findViewById(R.id.idTVStatus);

        // Sử dụng phương thức isChecked để kiểm tra trạng thái của Switch
        // Nếu Switch được set True thì text của phần tử có id là statusTV sẽ được gán là "Switch is Checked", màu xanh
        // Ngược lại thì là "Switch is UnChecked", màu đỏ
        if (switchView.isChecked()) {
            statusTV.setText("Switch is Checked");
            statusTV.setTextColor(Color.GREEN);
        } else {
            statusTV.setText("Switch is UnChecked");
            statusTV.setTextColor(Color.RED);
        }

        // Sử dụng phương thức setOnCheckedChangeListener
        // => Lắng nghe các thay đổi trong trạng thái của một Switch và cập nhật văn bản của TextView tương ứng.
        switchView.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    statusTV.setText("Switch is Checked");
                    statusTV.setTextColor(Color.GREEN);
                } else {
                    statusTV.setText("Switch is UnChecked");
                    statusTV.setTextColor(Color.RED);
                }
            }
        });
    }
}
