package com.example.mymenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.gson.Gson;

import java.util.ArrayList;

public class AddDetails extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4;
    ArrayList<User> a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_details);
    }

    public void showDetails(View view) {
        User u = new User();
        ed1 = findViewById(R.id.e1);
        ed2 = findViewById(R.id.e2);
        ed3 = findViewById(R.id.e3);
        ed4 = findViewById(R.id.e4);
        u.setFName(ed1.getText().toString());
        u.setLName(ed2.getText().toString());
        String email = ed3.getText().toString();
        u.setEmail(email);
        u.setPassword(ed4.getText().toString());
        a = new ArrayList<>();
        a.add(u);
        Gson g = new Gson();
        String json = g.toJson(a);
        SharedPreferences shrd = getSharedPreferences("demo", MODE_PRIVATE);
        SharedPreferences.Editor editor = shrd.edit();
        editor.putString(email,json);
        editor.apply();

        Intent i = new Intent(AddDetails.this, ShowDetails.class);
        startActivity(i);
    }
}