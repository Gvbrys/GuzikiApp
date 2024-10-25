package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tekst;
    private int rozmiarTekstu = 16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tekst = findViewById(R.id.textView);
        Button guzikZmienKolor = findViewById(R.id.guzikZmienKolor);
        Button guzikZmienTekst = findViewById(R.id.guzikZmienTekst);
        Button guzikUkryjTextView = findViewById(R.id.guzikUkryjTextView);
        Button guzikOtworzNowaAktywnosc = findViewById(R.id.guzikOtworzNowaAktywnosc);
        Button guzikPowiekszRozmiarTekstu = findViewById(R.id.guzikPowiekszRozmiarTekstu);

        guzikZmienKolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tekst.setTextColor(Color.GREEN);
            }
        });

        guzikZmienTekst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tekst.setText("Nowy tekst");
            }
        });

        guzikUkryjTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tekst.getVisibility() == View.VISIBLE) {
                    tekst.setVisibility(View.GONE);
                } else {
                    tekst.setVisibility(View.VISIBLE);
                }
            }
        });

        guzikOtworzNowaAktywnosc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent);
            }
        });

        guzikPowiekszRozmiarTekstu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rozmiarTekstu += 2;
                tekst.setTextSize(rozmiarTekstu);
            }
        });
    }
}
