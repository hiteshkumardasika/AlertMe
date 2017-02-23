package com.example.root.alertme;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class Settings extends AppCompatActivity{

    Toolbar settingsToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        try {
            initToolBar();
            initWidgets();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void initWidgets() {
        Spinner bufferSpinner = (Spinner) findViewById(R.id.bufferSpinner);
        bufferSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                System.out.println("item:: "+item);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        List<String> bufferData = new ArrayList<String>();
        bufferData.add("500");
        bufferData.add("1000");
        bufferData.add("1500");
        bufferData.add("2000");
        bufferData.add("2500");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,bufferData);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bufferSpinner.setAdapter(dataAdapter);
        bufferSpinner.setSelection(0,false);

        Button cancel = (Button) findViewById(R.id.cancelSettings);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
    public void initToolBar() {
        settingsToolbar = (Toolbar) findViewById(R.id.settingsToolbar);
        settingsToolbar.setTitle("Settings");
//        setSupportActionBar(settingsToolbar);

//        settingsToolbar.setNavigationIcon(R.drawable.back);
//        How to add Navigation Icon
        settingsToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Back to Main");
            }
        });

    }

}
