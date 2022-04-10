package com.example.binding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.binding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initAction();
    }


    private void initAction() {
        binding.btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String keterangan = binding.etKeterangan.getText().toString();
                String harga = binding.etHarga.getText().toString();

                if (keterangan.isEmpty() || harga.isEmpty()){
                    Toast.makeText(MainActivity.this, getString(R.string.error_message_form_empty),
                            Toast.LENGTH_SHORT).show();
                } else {
                    String initHarga = FunctionHelper.rupiahFormat(Integer.parseInt(harga));
                    String messageToast = "Kamu mengeluarkan " + initHarga + " untuk " + keterangan;
                    Toast.makeText(MainActivity.this, messageToast, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}