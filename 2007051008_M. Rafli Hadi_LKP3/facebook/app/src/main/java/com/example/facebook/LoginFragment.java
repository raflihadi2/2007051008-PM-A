package com.example.facebook;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class LoginFragment extends Fragment {

    EditText edtUsername, edtPassword;
    ImageButton btn_fb;
    Button btnLogin, btnRegister;
    CallbackFragment callbackFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        edtUsername = view.findViewById(R.id.edt_username);
        edtPassword = view.findViewById(R.id.edt_password);
        btn_fb = view.findViewById(R.id.btn_facebook);
        btnLogin = view.findViewById(R.id.btn_login);
        btnRegister = view.findViewById(R.id.btn_register);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Login", Toast.LENGTH_LONG).show();


            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (callbackFragment != null){
                    callbackFragment.ChangeFragment();
                }

            }
        });

        return view;
    }

    public void setCallbackFragment (CallbackFragment callbackFragment) {
        this.callbackFragment = callbackFragment;
    }
}