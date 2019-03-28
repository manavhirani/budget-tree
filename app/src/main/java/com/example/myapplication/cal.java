package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class cal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
    }
    public void Add(View v)
    {
        EditText ed1= (EditText) findViewById(R.id.editText);
        EditText ans= (EditText) findViewById(R.id.editText4);
        Double num1=Double.parseDouble(ed1.getText().toString());
        ans.setText(Double.toString(num1));
    }
    public void Sub(View v)
    {
        /* 5% */
        EditText ed1= (EditText) findViewById(R.id.editText);
        EditText ans= (EditText) findViewById(R.id.editText4);
        Double num1=Double.parseDouble(ed1.getText().toString());
        Double answer=num1+(0.05*num1);
        ans.setText(Double.toString(answer));
    }
    public void Mul(View v)
    {
        /* 12% */
        EditText ed1= (EditText) findViewById(R.id.editText);
        EditText ans= (EditText) findViewById(R.id.editText4);
        Double num1=Double.parseDouble(ed1.getText().toString());
        Double answer=num1+(0.12*num1);
        ans.setText(Double.toString(answer));
    }
    public void Div(View v)
    {
        /* 18% */
        EditText ed1= (EditText) findViewById(R.id.editText);
        EditText ans= (EditText) findViewById(R.id.editText4);
        Double num1=Double.parseDouble(ed1.getText().toString());
        Double answer=num1+(0.18*num1);
        ans.setText(Double.toString(answer));
    }
    public void last(View v)
    {
        /* 28% */
        EditText ed1= (EditText) findViewById(R.id.editText);
        EditText ans= (EditText) findViewById(R.id.editText4);
        Double num1=Double.parseDouble(ed1.getText().toString());
        Double answer=num1+(0.28*num1);
        ans.setText(Double.toString(answer));
    }

}
