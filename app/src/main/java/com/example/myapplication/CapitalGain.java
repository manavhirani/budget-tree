package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CapitalGain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital_gain);
    }
    public void imm(View v){
            TextView ans = (TextView) findViewById(R.id.result);
            EditText ed1 = (EditText) findViewById(R.id.editText);
            EditText ed2 = (EditText) findViewById(R.id.ac);
            EditText ed3 = (EditText) findViewById(R.id.imp);
            EditText ed4 = (EditText) findViewById(R.id.years);
            EditText ed5 = (EditText) findViewById(R.id.exp);

            Double answer;
            Double num1 = Double.parseDouble(ed1.getText().toString());
            Double num2 = Double.parseDouble(ed2.getText().toString());
            Double num3 = Double.parseDouble(ed3.getText().toString());
            Double num5 = Double.parseDouble(ed5.getText().toString());
            Integer num4 = Integer.parseInt(ed4.getText().toString());
            if (num4 < 24) {
                answer = num1 - num2 - num3 - num5;

            } else {
                answer = num1 - (num2 * 0.206) - (num3 * 0.206) - num5;

            }
            ans.setText(Double.toString(answer));

        }

        public void mov(View v){
            TextView ans = (TextView) findViewById(R.id.result);
            EditText ed1 = (EditText) findViewById(R.id.editText);
            EditText ed2 = (EditText) findViewById(R.id.ac);
            EditText ed3 = (EditText) findViewById(R.id.imp);
            EditText ed4 = (EditText) findViewById(R.id.years);
            EditText ed5 = (EditText) findViewById(R.id.exp);

            Double answer;
            Double num1 = Double.parseDouble(ed1.getText().toString());
            Double num2 = Double.parseDouble(ed2.getText().toString());
            Double num3 = Double.parseDouble(ed3.getText().toString());
            Double num5 = Double.parseDouble(ed5.getText().toString());
            Integer num4 = Integer.parseInt(ed4.getText().toString());
            if (num4 < 36) {
                answer = num1 - num2 - num3 - num5;
            } else {
                answer = num1 - (num2 * 0.206) - (num3 * 0.206) - num5;

            }
            ans.setText(Double.toString(answer));

        }

        public void lis(View v){
            TextView ans = (TextView) findViewById(R.id.result);
            EditText ed1 = (EditText) findViewById(R.id.editText);
            EditText ed2 = (EditText) findViewById(R.id.ac);
            EditText ed3 = (EditText) findViewById(R.id.imp);
            EditText ed4 = (EditText) findViewById(R.id.years);
            EditText ed5 = (EditText) findViewById(R.id.exp);

            Double answer;
            Double num1 = Double.parseDouble(ed1.getText().toString());
            Double num2 = Double.parseDouble(ed2.getText().toString());
            Double num3 = Double.parseDouble(ed3.getText().toString());
            Double num5 = Double.parseDouble(ed5.getText().toString());
            Integer num4 = Integer.parseInt(ed4.getText().toString());
            if (num4 < 12) {
                answer = num1 - (num2 * 0.1545) - (num3 * 0.1545) - num5;

            } else {
                answer = num1 - num2 - num3 - num5;

            }
            ans.setText(Double.toString(answer));

        }

        public void eq(View v){
            TextView ans = (TextView) findViewById(R.id.result);

            EditText ed1 = (EditText) findViewById(R.id.editText);
            EditText ed2 = (EditText) findViewById(R.id.ac);
            EditText ed3 = (EditText) findViewById(R.id.imp);
            EditText ed4 = (EditText) findViewById(R.id.years);
            EditText ed5 = (EditText) findViewById(R.id.exp);

            Double answer;
            Double num1 = Double.parseDouble(ed1.getText().toString());
            Double num2 = Double.parseDouble(ed2.getText().toString());
            Double num3 = Double.parseDouble(ed3.getText().toString());
            Double num5 = Double.parseDouble(ed5.getText().toString());
            Integer num4 = Integer.parseInt(ed4.getText().toString());
            if (num4 < 12) {
                answer = num1 - (num2 * 0.1545) - (num3 * 0.1545) - num5;
            } else {
                answer = num1 - num2 - num3 - num5;

            }
            ans.setText(Double.toString(answer));

        }

        public void deb(View v){
            TextView ans = (TextView) findViewById(R.id.result);

            EditText ed1 = (EditText) findViewById(R.id.editText);
            EditText ed2 = (EditText) findViewById(R.id.ac);
            EditText ed3 = (EditText) findViewById(R.id.imp);
            EditText ed4 = (EditText) findViewById(R.id.years);
            EditText ed5 = (EditText) findViewById(R.id.exp);

            Double answer;
            Double num1 = Double.parseDouble(ed1.getText().toString());
            Double num2 = Double.parseDouble(ed2.getText().toString());
            Double num3 = Double.parseDouble(ed3.getText().toString());
            Double num5 = Double.parseDouble(ed5.getText().toString());
            Integer num4 = Integer.parseInt(ed4.getText().toString());
            if (num4 < 12) {
                answer = num1 - (num2 * 0.1545) - (num3 * 0.1545) - num5;

            } else {
                answer = num1 - num2 - num3 - num5;

            }
            ans.setText(Double.toString(answer));

        }

    }
