package com.android.uraall.taxiapp;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {

                    sleep(4000);

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(
                            SplashScreenActivity.this,
                            ChooseModeActivity.class));
                }
            }
        };

        thread.start();
    }





    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
