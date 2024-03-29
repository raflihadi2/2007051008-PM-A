package com.example.binding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.binding.ProfilActivity;
import com.example.binding.R;
import com.example.binding.SetelanActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.profil){
            startActivity(new Intent(this, ProfilActivity.class));
        } else if (item.getItemId() == R.id.setelan){
            startActivity(new Intent(this, SetelanActivity.class));
        }
        return true;
    }
}