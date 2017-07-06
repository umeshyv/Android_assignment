package com.example.umesh.batterycharger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private BroadcastReceiver mBatInfoReceiver = new BroadcastReceiver(){
        //When Event is published, onReceive method is called
        public void onReceive(Context c, Intent i) {
            //Get Battery %
            int level = i.getIntExtra("level", 0);
            //Find the progressbar creating in main.xml
            ProgressBar pb = (ProgressBar) findViewById(R.id.progressbar);
            //Set progress level with battery % value
            pb.setProgress(level);
            //Find textview control created in main.xml
            TextView tv = (TextView) findViewById(R.id.textfield);
            //Set TextView with text
            tv.setText("Battery Level: " + Integer.toString(level) + "%");

        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Register the receiver which triggers event
        //when battery charge is changed
        registerReceiver(mBatInfoReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mBatInfoReceiver);
    }
}
