package com.example.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Initialize extends AppCompatActivity {
    Button button1;
    public static int cashbalance;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initialize);


        button1 = (Button) findViewById(R.id.button3);
        ed1 = (EditText) findViewById(R.id.editText);





        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                cashbalance=Integer.parseInt(ed1.getText().toString());
                Intent myIntent = new Intent(Initialize.this,
                        Expense.class);
                startActivity(myIntent);
            }
        });

    }
}
