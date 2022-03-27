package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Contact> list;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setTitle("Friend Request");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(ContactData.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CardViewContactAdapter cardViewContactAdapter= new
                CardViewContactAdapter(this);
        cardViewContactAdapter.setContactList(list);
        recyclerView.setAdapter(cardViewContactAdapter);
    }
}