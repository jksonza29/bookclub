package com.bookclub.bookclub.model;
import java.util.*;

public class book {
    private String isbn;
    private String title;
    private String description;
    private int numOfPages;
    private String infoUrl;

    public book(){

    }

    public book(String isbn, String title, String description, String infoUrl, int numOfPages){
        this.isbn = isbn;
        this.title = title;
        this.description = description;
        this.numOfPages = numOfPages;
        this.infoUrl = infoUrl;
    }

    public book(String isbn, String title, String infoUrl){
        this.isbn = isbn;
        this.title = title;
        this.infoUrl = infoUrl;
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

    public void setInfoUrl(String infoUrl){
        this.infoUrl = infoUrl;
    }

    public String getInfoUrl(){
        return infoUrl;
    }

    @Override
    public String toString(){
        return "Book{isbn=" + this.isbn + ", title=" + this.title + ", description=" + this.description + ", numOfPages=" + this.numOfPages + "}";
    }
}
