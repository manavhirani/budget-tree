package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    public void Calc (View v) {
        EditText ed1 = (EditText) findViewById(R.id.editText);
        TextView tv1 = (TextView) findViewById(R.id.textView4);
        TextView tv2 = (TextView) findViewById(R.id.textView5);
        TextView tv7 = (TextView) findViewById(R.id.textView7);
        TextView tv8 = (TextView) findViewById(R.id.textView8);
        TextView tv12 = (TextView) findViewById(R.id.textView12);
        TextView tv13 = (TextView) findViewById(R.id.textView13);
        EditText ed2 = (EditText) findViewById(R.id.editText2);
        int age = Integer.parseInt(ed2.getText().toString());

        int Income = Integer.parseInt(ed1.getText().toString());
        int perc = 0, hecp = 0, temp = 0, surp = 0;
        float ans, hec = 0, surcharge = 0;
        if (age <= 60) {
            if(Income <= 250000){
                ans=0;
            }
            else if (Income <= 500000) {
                temp = Income;
                temp = temp - 25000 - 19200 - 15000;
                ans = (float) ((temp * 0.1 + 12500));
                perc = 20;
            } else if (Income <= 1000000) {
                temp = Income;
                temp = temp - 25000 - 19200 - 15000;
                ans = (float) ((temp * 0.1 + 12500));
                perc = 20;
            } else if (Income >= 5000000 && Income < 10000000) {
                temp = Income;
                temp = temp - 25000 - 19200 - 15000;
                ans = (float) (temp * 0.3 + 12500 + 100000);
                perc = 30;
                surp = 10;
                surcharge = (float) (ans * 0.1);
            } else {
                temp = Income;
                temp = temp - 25000 - 19200 - 15000;
                ;
                ans = (float) (temp * 0.3 + 12500 + 100000);
                perc = 30;
                surp = 15;
                surcharge = (float) (ans * 0.15);
            }

            if (ans > 0) {
                hec = (float) (ans * 0.04);
                hecp = 4;
            }

            tv1.setText(Float.toString(ans));
            tv2.setText(Float.toString(hec));
            tv13.setText(Float.toString(surcharge));
            tv7.setText(Integer.toString(perc) + " %");
            tv8.setText(Integer.toString(hecp) + " %");
            tv12.setText(Integer.toString(surp) + " %");
        }
        else if (age > 60 && age <= 80) {
            if(Income <= 300000){
                ans=0;
            }
            else if (Income <= 500000) {
                temp = Income;
                temp = temp - 25000 - 19200 - 15000;
                ans = (float) ((temp * 0.1 + 12500));
                perc = 20;
            } else if (Income <= 1000000) {
                temp = Income;
                temp = temp - 25000 - 19200 - 15000;
                ans = (float) ((temp * 0.1 + 12500));
                perc = 20;
            } else if (Income >= 5000000 && Income < 10000000) {
                temp = Income;
                temp = temp - 25000 - 19200 - 15000;
                ans = (float) (temp * 0.3 + 12500 + 100000);
                perc = 30;
                surp = 10;
                surcharge = (float) (ans * 0.1);
            } else {
                temp = Income;
                temp = temp - 25000 - 19200 - 15000;
                ;
                ans = (float) (temp * 0.3 + 12500 + 100000);
                perc = 30;
                surp = 15;
                surcharge = (float) (ans * 0.15);
            }

            if (ans > 0) {
                hec = (float) (ans * 0.04);
                hecp = 4;
            }

            tv1.setText(Float.toString(ans));
            tv2.setText(Float.toString(hec));
            tv13.setText(Float.toString(surcharge));
            tv7.setText(Integer.toString(perc) + " %");
            tv8.setText(Integer.toString(hecp) + " %");
            tv12.setText(Integer.toString(surp) + " %");
        }
        if (age > 80) {
            if (Income <= 500000) {
                ans = 0;
            } else if (Income <= 1000000) {
                temp = Income;
                temp = temp - 25000 - 19200 - 15000;
                ans = (float) ((temp * 0.1 + 12500));
                perc = 20;
            } else if (Income >= 5000000 && Income < 10000000) {
                temp = Income;
                temp = temp - 25000 - 19200 - 15000;
                ans = (float) (temp * 0.3 + 12500 + 100000);
                perc = 30;
                surp = 10;
                surcharge = (float) (ans * 0.1);
            } else {
                temp = Income;
                temp = temp - 25000 - 19200 - 15000;
                ans = (float) (temp * 0.3 + 12500 + 100000);
                perc = 30;
                surp = 15;
                surcharge = (float) (ans * 0.15);
            }

            if (ans > 0) {
                hec = (float) (ans * 0.04);
                hecp = 4;
            }
            tv1.setText(Float.toString(ans));
            tv2.setText(Float.toString(hec));
            tv13.setText(Float.toString(surcharge));
            tv7.setText(Integer.toString(perc) + " %");
            tv8.setText(Integer.toString(hecp) + " %");
            tv12.setText(Integer.toString(surp) + " %");
        }
    }
}
