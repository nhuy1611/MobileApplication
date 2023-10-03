// Khai báo package cho lớp MainActivity.
package com.example.mobileapplication;

// Import các lớp cần thiết từ AndroidX và Android framework.
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import android.os.Bundle;
import android.view.MenuItem;

// Khai báo lớp MainActivity, nó mở rộng từ AppCompatActivity.
public class MainActivity extends AppCompatActivity {
    // Khai báo các biến drawerLayout và actionBarDrawerToggle
    // Mục đích tham chiếu đến DrawerLayout và ActionBarDrawerToggle.
    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tạo liên kết đến DrawerLayout trong tệp layout
        // Gán đối tượng có id là my_drawer_layout cho drawerLayout
        drawerLayout = findViewById(R.id.my_drawer_layout);

        // Tạo ActionBarDrawerToggle để kết nối DrawerLayout và ActionBar
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        // Thêm DrawerListener vào DrawerLayout để lắng nghe các sự kiện khi trạng thái của DrawerLayout thay đổi.
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        // Đồng bộ hóa trạng thái của ActionBarDrawerToggle. Điều này giúp hiển thị biểu tượng điều hướng trên ActionBar.
        actionBarDrawerToggle.syncState();

        // Hiển thị nút điều hướng trên ActionBar bằng cách gọi setDisplayHomeAsUpEnabled(true).
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    // Ghi đè phương thức onOptionsItemSelected() để xử lý sự kiện khi người dùng nhấp vào các mục trên ActionBar.
    // Gọi actionBarDrawerToggle.onOptionsItemSelected(item) để xử lý sự kiện khi người dùng nhấp vào nút điều hướng trên ActionBar.
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        // Xử lý sự kiện khi người dùng nhấp vào nút điều hướng trên ActionBar
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}