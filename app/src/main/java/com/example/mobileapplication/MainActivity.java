package com.example.mobileapplication;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Khai báo các biến thành viên: Có hai biến thành viên, một CheckBox và một TextView.
    // Chúng được sử dụng để tham chiếu đến các thành phần giao diện người dùng trong layout của ứng dụng.
    private CheckBox checkBox;
    private TextView statusTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.idCheckBox);
        statusTV = findViewById(R.id.idTVStatus);
        // Kiểm tra trạng thái CheckBox:
        // Nếu CheckBox đã được chọn, nó sẽ đặt văn bản của TextView thành “Checkbox is Checked”.
        // Nếu không, nó sẽ đặt văn bản thành “Checkbox is UnChecked”.
        if (checkBox.isChecked()) {
            statusTV.setText("Checkbox is Checked");
        } else {
            statusTV.setText("Checkbox is UnChecked");
        }

        // Thiết lập listener cho CheckBox:
        // Một listener được thiết lập cho CheckBox để theo dõi sự thay đổi trạng thái của nó.
        // Khi trạng thái của CheckBox thay đổi, văn bản của TextView cũng sẽ thay đổi tương ứng.
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    statusTV.setText("Checkbox is Checked");
                } else {
                    statusTV.setText("Checkbox is UnChecked");
                }
            }
        });
    }
}