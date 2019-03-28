package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void DomCalc(View v)
    {
        EditText ed1 = (EditText) findViewById(R.id.editText4);
        TextView tv1 = (TextView) findViewById(R.id.textView6);
        TextView tv11 = (TextView) findViewById(R.id.textView11);
        int gross_t = Integer.parseInt(ed1.getText().toString());
        int temp = 0,rate = 0;
        float ans;
        if(gross_t<=250) {
            temp = gross_t;
            ans = (float) (temp * 0.25);
            rate = 25;
        }
        else {
            temp = gross_t-250;
            ans = (float) (temp * 0.3 + 62.5);
            rate = 30;
        }
        tv1.setText(Float.toString(ans));
        tv11.setText(Integer.toString(rate)+" %");
    }
}
