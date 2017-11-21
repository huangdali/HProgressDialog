package com.hdl.progress;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hdl.hprogressdialog.HProgressDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HProgressDialog progressDialog = new HProgressDialog.Builder(this)
                .isCanceledOnTouchOutside(true)
                .setCornerRadius(20)
                .setBackgroundWindowColor(Color.parseColor("#22000000"))
                .setStrokeWidth(2)
                .setProgressRimWidth(2)
                .setTextColor(Color.WHITE)
                .build();
        progressDialog.show();
    }
}
