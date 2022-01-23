package com.android.uraall.taxiapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class LoadingDialog {

    Activity activity;
    AlertDialog dialog;

    LoadingDialog(Activity myActivity){
        activity = myActivity;
    }

    void startloadingDialog(){
        LayoutInflater inflater = activity.getLayoutInflater();
        inflater.inflate(R.layout.activity_splash_screen, null);


    }

}
