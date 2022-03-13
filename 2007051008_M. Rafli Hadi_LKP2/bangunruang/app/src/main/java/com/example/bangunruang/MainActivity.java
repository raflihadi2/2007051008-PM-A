package com.example.bangunruang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText bilA, bilB;
    private ImageButton persegi, persegipanjang, segitiga, jajargenjang;
    private TextView hasil;
    private Button seacrh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bilA = (EditText) findViewById(R.id.bilanganA);
        bilB = (EditText) findViewById(R.id.bilanganB);
        persegi = (ImageButton) findViewById(R.id.btn_persegi);
        persegipanjang = (ImageButton) findViewById(R.id.btn_persegipanjang);
        segitiga = (ImageButton) findViewById(R.id.btn_segitiga);
        jajargenjang = (ImageButton) findViewById(R.id.btn_jajargenjang);
        hasil = (TextView) findViewById(R.id.hasil);
        seacrh = (Button) findViewById(R.id.btn_search);

        bilA.setOnClickListener(this);
        bilB.setOnClickListener(this);
        persegi.setOnClickListener(this);
        persegipanjang.setOnClickListener(this);
        segitiga.setOnClickListener(this);
        jajargenjang.setOnClickListener(this);
        seacrh.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btn_persegi) {
            String bilanganA = bilA.getText().toString().trim();
            String bilanganB = bilB.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(bilanganA)) {
                isEmptyFields = true;
                bilA.setError("Bagian ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(bilanganB)) {
                isEmptyFields = true;
                bilB.setError("Bagian ini tidak boleh kosong");
            }
            if (!isEmptyFields) {
                Integer a = Integer.parseInt(bilanganA);
                Integer b = Integer.parseInt(bilanganB);
                Integer c = a * b;
                hasil.setText(String.valueOf(c));
                i = new Intent(this, MoveActivity.class);
                i.putExtra("hasil", hasil.getText().toString());
                i.putExtra("ket", "LUAS PERSEGI ADALAH");
                startActivity(i);
            }
        }
        else if (view.getId() == R.id.btn_segitiga) {
            String bilanganA = bilA.getText().toString().trim();
            String bilanganB = bilB.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(bilanganA)) {
                isEmptyFields = true;
                bilA.setError("Bagian ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(bilanganB)) {
                isEmptyFields = true;
                bilB.setError("Bagian ini tidak boleh kosong");
            }
            if (!isEmptyFields) {
                Double a = Double.parseDouble(bilanganA);
                Double b = Double.parseDouble(bilanganB);
                Double c = 0.5 * a * b;
                hasil.setText(String.valueOf(c));
                i = new Intent(this, MoveActivity.class);
                i.putExtra("hasil", hasil.getText().toString());
                i.putExtra("ket", "LUAS PERSEGI PANJANG");
                startActivity(i);
            }
        }
        else if (view.getId() == R.id.btn_segitiga) {
            String bilanganA = bilA.getText().toString().trim();
            String bilanganB = bilB.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(bilanganA)) {
                isEmptyFields = true;
                bilA.setError("Bagian ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(bilanganB)) {
                isEmptyFields = true;
                bilB.setError("Bagian ini tidak boleh kosong");
            }
            if (!isEmptyFields) {
                Integer a = Integer.parseInt(bilanganA);
                Integer b = Integer.parseInt(bilanganB);
                Integer c = a * b;
                hasil.setText(String.valueOf(c));
                i = new Intent(this, MoveActivity.class);
                i.putExtra("hasil", hasil.getText().toString());
                i.putExtra("ket", "LUAS SEGITIGA ADALAH");
                startActivity(i);
            }
        }
        else if (view.getId() == R.id.btn_jajargenjang) {
            String bilanganA = bilA.getText().toString().trim();
            String bilanganB = bilB.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(bilanganA)) {
                isEmptyFields = true;
                bilA.setError("Bagian ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(bilanganB)) {
                isEmptyFields = true;
                bilB.setError("Bagian ini tidak boleh kosong");
            }
            if (!isEmptyFields) {
                Double a = Double.parseDouble(bilanganA);
                Double b = Double.parseDouble(bilanganB);
                Double c = a * b;
                hasil.setText(String.valueOf(c));
                i = new Intent(this, MoveActivity.class);
                i.putExtra("hasil", hasil.getText().toString());
                i.putExtra("ket", "LUAS JAJAR GENJANG ADALAH");
                startActivity(i);
            }
        }

        else {
            i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://accounts.google.com"));
            startActivity(i);
        }

    }
}