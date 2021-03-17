package com.example.mymenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.google.gson.Gson;

public class EnterDetails extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_details);
    }

    public void GoBack(View view) {
        Intent i = new Intent(EnterDetails.this,MainActivity.class);
        startActivity(i);
    }

    public void addDetails(View view) {

        Intent i = new Intent(EnterDetails.this, AddDetails.class);
        startActivity(i);

    }
}