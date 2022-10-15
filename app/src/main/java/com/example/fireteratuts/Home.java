package com.example.fireteratuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //initialize
        initxml();

        //method for clicking the start button
        startMethod();

    }

    private void startMethod() {
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent variablex = new Intent(Home.this, MainActivity.class);
                startActivity(variablex);

                //backend
            }
        });
    }

    private void initxml() {
        myButton = findViewById(R.id.start);
    }


}