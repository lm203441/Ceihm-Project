package com.example.michael.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Michael on 04/02/2018.
 */

public class ValidationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        setContentView(R.layout.validation);
        final Button oui = (Button) findViewById(R.id.oui);
        final Button non = (Button) findViewById(R.id.non);

        oui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Incident envoyé",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ValidationActivity.this, MainActivity.class));
            }
        });

        non.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.activity_main);
                onBackPressed();
//                startActivity(new Intent(ValidationActivity.this, MainActivity.class));
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
}
