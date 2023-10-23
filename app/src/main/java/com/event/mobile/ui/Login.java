package com.event.mobile.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.event.mobile.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnlogin)
    void login(){
        Intent intent = new Intent(Login.this, Profile.class);
        startActivity(intent);
    }
}