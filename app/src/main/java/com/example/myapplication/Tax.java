package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tax extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax);

        Button itc = (Button) findViewById(R.id.ITC);

        itc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                startActivity(new Intent(Tax.this, IncomeTaxCalculator.class));
            }
        });

        Button gst = (Button) findViewById(R.id.GST);
        gst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tax.this, MainActivity.class));
            }
        });

        Button fr = (Button) findViewById(R.id.FR);

        fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tax.this, FileReturn.class));
            }
        });
        Button cg = (Button) findViewById(R.id.CG);

        cg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tax.this, CapitalGain.class));
            }
        });
        Button NW = (Button) findViewById(R.id.News);

        NW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tax.this, News.class));
            }
        });
    }

    public void run(View v)
    {

        String url = "https://www.incometaxindia.gov.in/Pages/tax-services/pay-tax-online.aspx";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
