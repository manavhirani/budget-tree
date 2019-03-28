package com.example.myapplication;



import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Expense extends AppCompatActivity {
    ListView lst;
    DatabaseHelper db;
    String[] category={"Transportation", "Life and Entertainment", "Housing", "Shopping", "Food and Drinks", "Others", "See current balance", "See history"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense);

        lst=(ListView)findViewById(R.id.l1);
        ArrayAdapter<String> arrayadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,category);
        lst.setAdapter(arrayadapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tv= (TextView) view;
                Toast.makeText(Expense.this,tv.getText()+"  "+position,Toast.LENGTH_LONG).show();
                Intent intent;
                switch(position) {
                    case 0:
                        intent = new Intent(Expense.this, Transport.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), Entertainment.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), Household.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), Shopping.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), Food.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), Others.class);
                        startActivity(intent);
                        break;

                    case 6:
                        intent = new Intent(getApplicationContext(), seebal.class);
                        startActivity(intent);
                        break;
                    case 7:

                        Cursor res = db.getAllData();
                        if (res.getCount() == 0) {
                            // show message
                            Toast.makeText(Expense.this, "Nothing found", Toast.LENGTH_LONG).show();
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {





                            if(Integer.parseInt(res.getString(1))!=0) {
                                buffer.append("Transport :" + res.getString(1) + "\n");
                            }
                            if(Integer.parseInt(res.getString(2))!=0) {
                                buffer.append("Entertainment :" + res.getString(2) + "\n");
                            }
                            if(Integer.parseInt(res.getString(3))!=0) {
                                buffer.append("Household :" + res.getString(3) + "\n");
                            }
                            if(Integer.parseInt(res.getString(4))!=0) {
                                buffer.append("Shopping :" + res.getString(4) + "\n\n");
                            }
                            if(Integer.parseInt(res.getString(5))!=0) {
                                buffer.append("Food :" + res.getString(5) + "\n");
                            }
                            if(Integer.parseInt(res.getString(6))!=0) {
                                buffer.append("Others :" + res.getString(6) + "\n");
                            }


                        }

                        showMessage("Data",buffer.toString());
                        break;


                }








            }
        });
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}

