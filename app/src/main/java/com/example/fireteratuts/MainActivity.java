package com.example.fireteratuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView arrowback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initxml();
        //when clickinh the back button
        back();
    }

    private void back() {
        arrowback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //option 1 bakc
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);


            }
        });
    }


    private void initxml() {
        arrowback = findViewById(R.id.arrowback);
    }
}