package android.example.proyekmbako;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingActivity extends AppCompatActivity {
    Button btn_lokasi_setting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        btn_lokasi_setting = findViewById(R.id.btn_lokasi_setting);
        btn_lokasi_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btn_lokasi_setting = new Intent(SettingActivity.this, ChooseLoc.class);
                startActivity(btn_lokasi_setting);
            }
        });
    }

}