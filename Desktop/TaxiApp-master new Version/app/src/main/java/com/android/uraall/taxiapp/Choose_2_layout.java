package com.android.uraall.taxiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Choose_2_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose2_layout);

    }


    public void goToPassengerSignIn(View view) {
        startActivity(new Intent(
                Choose_2_layout.this,
                PassengerSignInActivity.class
        ));
    }

    public void goToDriverSignIn(View view) {
        startActivity(new Intent(
                Choose_2_layout.this,
                DriverSignInActivity.class
        ));
    }



}