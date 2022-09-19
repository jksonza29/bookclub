package com.bookclub.bookclub.model;
import java.util.*;

public class book {
    private String isbn;
    private String title;
    private String description;
    private int numOfPages;
    private String author;

    public book(){

    }

    public book(String isbn, String title, String description, int numOfPages, String author){
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.numOfPages = numOfPages;
        this.author = author;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setNumOfPages(int numOfPages){
        this.numOfPages = numOfPages;
    }

    public int getNumOfPages(){
        return this.numOfPages;
    }

    public void setAuthors(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    @Override
    public String toString(){
        return "Book{isbn=" + this.isbn + ", title=" + this.title + ", description=" + this.description + ", numOfPages=" + this.numOfPages + ", authors=" + this.author + "}";
    }
}
