package com.example.michael.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean incident = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        final ImageButton traffic = (ImageButton) findViewById(R.id.trafficjam);
        final ImageButton accident = (ImageButton) findViewById(R.id.accident);
        final ImageButton closedroad = (ImageButton) findViewById(R.id.closedroad);
        final ImageButton globe = (ImageButton) findViewById(R.id.globe);
        final Button envoyer = (Button) findViewById(R.id.envoyer);

        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(incident){
                    startActivity(new Intent(MainActivity.this, ValidationActivity.class));
                }
                else{
                    Toast.makeText(getApplicationContext(),"Veuillez choisir un type d'incident",Toast.LENGTH_SHORT).show();
                }
            }
        });

        traffic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incident = true;
                traffic.setImageResource(R.drawable.ic_traffic_red);
                accident.setImageResource(R.drawable.ic_car_collision);
                closedroad.setImageResource(R.drawable.ic_no_stopping);
            }
        });

        accident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incident = true;
                traffic.setImageResource(R.drawable.ic_traffic);
                accident.setImageResource(R.drawable.ic_car_collision_red);
                closedroad.setImageResource(R.drawable.ic_no_stopping);
            }
        });

        closedroad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incident = true;
                traffic.setImageResource(R.drawable.ic_traffic);
                accident.setImageResource(R.drawable.ic_car_collision);
                closedroad.setImageResource(R.drawable.ic_no_stopping_red);
            }
        });

        globe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
            }
        });
    }


    @Override
    public void onBackPressed() {
        //this is only needed if you have specific things
        //that you want to do when the user presses the back button.
        /* your specific things...*/
        super.onBackPressed();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
