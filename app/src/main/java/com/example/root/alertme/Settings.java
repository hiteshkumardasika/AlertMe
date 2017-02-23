package com.example.root.alertme;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

public class Settings extends Activity {

    Toolbar settingsToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        try {
            initToolBar();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void initToolBar() {
        settingsToolbar = (Toolbar) findViewById(R.id.settingsToolbar);
        settingsToolbar.setTitle("Settings");
//        settingsToolbar.setNavigationIcon(R.drawable.);
        settingsToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Back to Main");
            }
        });

    }
}
