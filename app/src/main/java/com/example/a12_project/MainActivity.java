package com.example.a12_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToBack(View view) {
        Intent i = new Intent(this, BackActivity.class);
        startActivity(i);
    }

    public void goToBMI(View view) {
        Intent i = new Intent(this, BmiCalcuatorActivity.class);
        startActivity(i);
    }
}