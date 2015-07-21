package com.udacity.rosales.guillermo.portfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private Button btnApp1;
    private Button btnApp2;
    private Button btnApp3;
    private Button btnApp4;
    private Button btnApp5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnApp1 = (Button)findViewById(R.id.btn_app1);
        btnApp2 = (Button)findViewById(R.id.btn_app2);
        btnApp3 = (Button)findViewById(R.id.btn_app3);
        btnApp4 = (Button)findViewById(R.id.btn_app4);
        btnApp5 = (Button)findViewById(R.id.btn_app5);

        btnApp1.setOnClickListener(this);
        btnApp2.setOnClickListener(this);
        btnApp3.setOnClickListener(this);
        btnApp4.setOnClickListener(this);
        btnApp5.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn_app1:
                Toast.makeText(this,R.string.app_1_name,Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_app2:
                Toast.makeText(this,R.string.app_2_name,Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_app3:
                Toast.makeText(this,R.string.app_3_name,Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_app4:
                Toast.makeText(this,R.string.app_4_name,Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_app5:
                Toast.makeText(this,R.string.app_5_name,Toast.LENGTH_SHORT).show();
                break;
            default:
                break;

        }



    }
}
