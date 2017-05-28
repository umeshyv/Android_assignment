package com.example.umesh.loginscreen;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    //RelativeLayout lLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View view = findViewById(R.layout.activity_main);
       // View view = (RelativeLayout)findViewById(R.layout.activity_main);
        //lLayout = (RelativeLayout)findViewById(R.layout.activity_main);
        //view.setVisibility(View.GONE);

        //view.setVisibility(View.VISIBLE);
       // view.setBackgroundColor(Color.parseColor("#0cefdc"));
        //view.setBackgroundColor(0xFFEE3333);
       // lLayout.setBackgroundColor(Color.MAGENTA);
    }
}
