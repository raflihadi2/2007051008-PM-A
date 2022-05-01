package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView tvData ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvData = findViewById(R.id.tv_data);

        // retrofit builder
        Retrofit retrofit  = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //instace for interface
        Api api  = retrofit.create(Api.class);

        Call<List<Getdata>> call  =  api.getPost();

        call.enqueue(new Callback<List<Getdata>>() {
            @Override
            public void onResponse(Call<List<Getdata>> call, Response<List<Getdata>> response) {

                if(response.isSuccessful()){

                    List<Getdata> posts = response.body();

                    for (Getdata data : posts){
                        String isidata = " ";
                        isidata += "Id : "+ data.getId()+ "\n";
                        isidata += "UserId : "+ data.getUserid()+ "\n";
                        isidata += "Title : "+ data.getTitle()+ "\n";
                        isidata += "Description : "+ data.getText()+ "\n";

                        tvData.append(isidata);
                    }
                    return;
                }

            }

            @Override
            public void onFailure(Call<List<Getdata>> call, Throwable t) {
                tvData.setText(t.getMessage());

            }
        });
    }
}