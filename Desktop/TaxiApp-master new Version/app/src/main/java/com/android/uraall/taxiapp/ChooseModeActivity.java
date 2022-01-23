package com.android.uraall.taxiapp;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.stats.WakeLock;
import com.google.firebase.auth.FirebaseAuth;

public class ChooseModeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_mode);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {

                    sleep(3000);

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(
                            ChooseModeActivity.this,
                            Choose_2_layout.class));
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
