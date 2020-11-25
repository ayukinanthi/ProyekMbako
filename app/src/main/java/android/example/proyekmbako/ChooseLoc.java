package android.example.proyekmbako;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class ChooseLoc extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner sp_prov;
    Spinner sp_kota;
    Spinner sp_pasar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_loc);
        //mengidentifikasi spinnernya sp_prov
        Spinner sp_prov = findViewById(R.id.sp_prov);
        Spinner sp_kota = findViewById(R.id.sp_kota);
        Spinner sp_pasar = findViewById(R.id.sp_pasar);
        //pas masukin (this); dalam OnItemSelected jangan lupa untuk implements AdapterView.OnItemSelectedListener
        //terus di implement methodsnya
        sp_prov.setOnItemSelectedListener(this);
        sp_kota.setOnItemSelectedListener(this);
        sp_pasar.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}