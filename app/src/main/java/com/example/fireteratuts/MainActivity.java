package com.example.fireteratuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.fireteratuts.adapter.CourseAdapter;
import com.example.fireteratuts.adapter.CourseInterface;
import com.example.fireteratuts.model.CourseModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements CourseInterface {

    ArrayList<CourseModel> courseModels = new ArrayList<>();
    RecyclerView recycler_vrariable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initraidenxml();

        //when clickinh the back button

        //method for this books
        setupBooks();


        //recyceler view
        CourseAdapter adapter = new CourseAdapter(MainActivity.this, courseModels, this);
        recycler_vrariable.setAdapter(adapter);
        recycler_vrariable.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }

    private void setupBooks() {
        String[] Title = {"Alamat ng gagamba", "Bible", "Java Programming", "C++ Fundamentals", "C# Basic"};
        String[] Author = {"Bata Reyes", "Michael Esteban", "Bill Gates", "Joe Auria", "Anee Murray"};


        for(int i = 0; i <Title.length; i++ ){
            courseModels.add(new CourseModel(Title[i], Author[i]));
        }

    }


    private void initraidenxml() {
        recycler_vrariable = findViewById(R.id.recycler_books);
    }


    @Override
    public void onItemClick(int position) {
        Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();

    }


}