package com.example.fireteratuts.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fireteratuts.R;
import com.example.fireteratuts.model.CourseModel;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.MyViewHolder> {

    private final CourseInterface courseInterfaces;


    Context context;
    ArrayList<CourseModel> courseModels;

    public CourseAdapter(Context context, ArrayList<CourseModel> courseModels, CourseInterface courseInterfaces){
        this.context = context;
        this.courseModels = courseModels;
        this.courseInterfaces = courseInterfaces;
    }

    @NonNull
    @Override
    public CourseAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType  ) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_books, parent, false);

        return new CourseAdapter.MyViewHolder(view, courseInterfaces);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.MyViewHolder holder, int position) {
        holder.book.setText(courseModels.get(position).getTitleBooks());
        holder.author.setText(courseModels.get(position).getAuthorName());

    }

    @Override
    public int getItemCount() {

        return courseModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView book, author;

        public MyViewHolder(@NonNull View itemView, CourseInterface courseInterfaces) {
            super(itemView);

            book = itemView.findViewById(R.id.book_title);
            author = itemView.findViewById(R.id.author_name);


            itemView.setOnClickListener(view -> {
                if(courseInterfaces != null ){
                    int pos = getAdapterPosition();
                    if(pos!= RecyclerView.NO_POSITION){
                        courseInterfaces.onItemClick(pos);
                    }

                }
            });
        }
    }


}
