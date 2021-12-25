package com.example.perhitunganberatbadan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etTinggiBadan, etBeratBadan, etIMT, etKeterangan;
    Button btnHitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);s
        setContentView(R.layout.activity_main);
        etTinggiBadan = findViewById(R.id.etTinggiBadan);
        etBeratBadan = findViewById(R.id.etBeratBadan);
        etIMT = findViewById(R.id.etIMT);
        btnHitung = findViewById(R.id.btnHitung);
        etKeterangan = findViewById(R.id.etKeterangan);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tinggiBadan = etTinggiBadan.getText().toString();
                String beratBadan = etBeratBadan.getText().toString();

                double varTinggiBadan = Double.parseDouble(tinggiBadan);
                double varBeratBadan = Double.parseDouble(beratBadan);
                double imt = varTinggiBadan * varTinggiBadan / varBeratBadan;

                etIMT.setText("Berat : " + imt);
                if(imt <= 18.5){
                    etKeterangan.setText("Kekurangan Berat Badan");
                }
                else if(imt >= 18.5 && imt <= 24.9){
                    etKeterangan.setText("Normal");
                }
                else if(imt >= 24.9 && imt <= 29.9){
                    etKeterangan.setText("Kelebihan Berat Badan");
                }else if(imt >= 30){
                    etKeterangan.setText("Obesitas");
                }

            }
        });
    }
}