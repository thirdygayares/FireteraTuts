package com.example.fireteratuts.model;

public class CourseModel {
    String TitleBooks;
    String AuthorName;


    public CourseModel(String titleBooks, String authorName) {
        TitleBooks = titleBooks;
        AuthorName = authorName;
    }


    public String getTitleBooks() {
        return TitleBooks;
    }

    public String getAuthorName() {
        return AuthorName;
    }
}