package com.example.mymenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ShowDetails extends AppCompatActivity {

    TextView te1, te2, te3, te4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);
        te1 = findViewById(R.id.t1);
        te2 = findViewById(R.id.t2);
        te3 = findViewById(R.id.t3);
        te4 = findViewById(R.id.t4);
        SharedPreferences getShared = getSharedPreferences("demo", MODE_PRIVATE);
        String value = getShared.getString(, "No User is available");
        Log.d("TAG",value);

    }
}

