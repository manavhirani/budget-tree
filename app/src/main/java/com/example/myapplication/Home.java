package com.example.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Home extends Activity {
    Button hbutton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_home);

        // Locate the button in activity_main.xml
        hbutton = (Button) findViewById(R.id.button);

        // Capture button clicks
        hbutton.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Home.this,
                        Initialize.class);
                startActivity(myIntent);
            }
        });

        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Home.this,
                        Tax.class);
                startActivity(myIntent);
            }
        });
    }

}