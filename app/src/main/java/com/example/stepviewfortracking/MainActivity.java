package com.example.stepviewfortracking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;

import java.text.AttributedCharacterIterator;

import params.com.stepview.StatusView;

public class MainActivity extends AppCompatActivity {
    private StatusView statusView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        statusView=findViewById(R.id.statusView);
        statusView.setCurrentCount(1);
//        statusView=new StatusView(this,null,R.id.statusView);
//        statusView.setStepCount(5);
//        statusView.setCurrentCount(3);
//        statusView.setCurrentStatusZoom(0.1f);
//        System.out.println(statusView.getCurrentCount());
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                statusView.setCurrentCount(2);
//            }
//        },3000);

    }
}