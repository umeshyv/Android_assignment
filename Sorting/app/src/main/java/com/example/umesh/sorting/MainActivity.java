package com.example.umesh.sorting;

import android.content.Intent;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.*;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button ascending = null;
    Button descending = null;
    ListView listView = null;
    ArrayAdapter<String> arrayAdapter = null;
    List<String> stringList = null;

    String[] sort_months = {"January", "February","March","April","May","June","July","August","September","October","November", "December"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ascending = (Button)findViewById(R.id.asc_button);
        descending= (Button)findViewById(R.id.desc_button);
        listView =(ListView)findViewById(R.id.name_list);
        stringList = Arrays.asList(sort_months);

        arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1, stringList);
        listView.setAdapter(arrayAdapter);
    }

    @Override
    public void onClick(View view){

        switch(view.getId()){

            case R.id.asc_button:
                Collections.sort(stringList);
                arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,stringList);
                listView.setAdapter(arrayAdapter);
                arrayAdapter.notifyDataSetChanged();
                break;

            case R.id.desc_button:
                Collections.sort(stringList);
                Collections.reverse(stringList);
                arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,stringList);
                listView.setAdapter(arrayAdapter);
                arrayAdapter.notifyDataSetChanged();
                break;

            default:
                Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_LONG).show();
                break;



        }


    }
}
