package com.event.mobile.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import com.event.mobile.MainActivity;
import com.event.mobile.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Profile extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(getString(R.string.your) + " " + getString(R.string.profile));
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.event1)
    void event(){
        Intent intent = new Intent(Profile.this, MainActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.event2)
    void event2(){
        Intent intent = new Intent(Profile.this, Register.class);
        startActivity(intent);
    }


}