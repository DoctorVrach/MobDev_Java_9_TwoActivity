package com.example.twoactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity  implements View.OnClickListener {

    Button btnActTwo;
    Button btnActThree;
    Button btnActOne;
    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);


        btnActOne = (Button) findViewById(R.id.btnActOne);
        btnActOne.setOnClickListener(this);
        btnActTwo = (Button) findViewById(R.id.btnActTwo);
        btnActTwo.setOnClickListener(this);
        btnActThree = (Button) findViewById(R.id.btnActThree);
        btnActThree.setOnClickListener(this);

        Log.d(TAG, "Activity4: onCreate()");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnActTwo:
                Intent intent = new Intent(this, ActivityTwo.class);
                startActivity(intent);
                break;
            case R.id.btnActThree:
                Intent intent3 = new Intent(this, Main3Activity.class);
                startActivity(intent3);
                break;
            case R.id.btnActOne:
                Intent intent1 = new Intent(this, MainActivity.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.menu_one:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.menu_two:
                Intent intent2 = new Intent(this, ActivityTwo.class);
                startActivity(intent2);
                break;
            case R.id.menu_three:
                Intent intent3 = new Intent(this, Main3Activity.class);
                startActivity(intent3);
                break;
            case R.id.menu_four:
                Intent intent4 = new Intent(this, Activity4.class);
                startActivity(intent4);
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity4: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity4: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity4: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity4: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity4: onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Activity4: onRestart()");
    }}
