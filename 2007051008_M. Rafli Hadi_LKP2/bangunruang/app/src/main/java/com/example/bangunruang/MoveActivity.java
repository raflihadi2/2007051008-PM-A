package com.example.bangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveActivity extends AppCompatActivity {
    private TextView txtket, txthasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        txthasil = (TextView) findViewById(R.id.txt_hasil);
        txtket = (TextView) findViewById(R.id.txt_ket);
        Bundle b = getIntent().getExtras();
        txtket.setText(b.getString("ket"));
        txthasil.setText(b.getString("hasil"));
    }
}