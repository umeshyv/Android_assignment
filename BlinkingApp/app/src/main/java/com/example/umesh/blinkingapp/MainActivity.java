package com.example.umesh.blinkingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.animation.*;
import android.graphics.Color;
import android.app.Activity;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "AnimationStarter";
    ObjectAnimator textColorAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startBlinkTextButton = (Button) findViewById(R.id.startblinking);
        final TextView blinkText = (TextView) findViewById(R.id.textView);

        startBlinkTextButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                textColorAnim = ObjectAnimator.ofInt(blinkText, "backgroundColor",Color.WHITE, Color.MAGENTA, Color.WHITE);
                textColorAnim.setDuration(1000);
                textColorAnim.setEvaluator(new ArgbEvaluator());
                textColorAnim.setRepeatCount(ValueAnimator.INFINITE);
                textColorAnim.setRepeatMode(ValueAnimator.REVERSE);
                textColorAnim.start();
            }
        });
    }

}
