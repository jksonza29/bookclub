package com.bookclub.bookclub.model;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;

public class BookOfTheMonth {

    @Id
    private String id;
    private int month;

    @NotEmpty(message = "ISBN is a required field")
    private String isbn;


    public BookOfTheMonth(){

    }

    public BookOfTheMonth(String id, int month, String isbn){
        this.id = id;
        this.month = month;
        this.isbn = isbn;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getId(){
        return this.id;
    }

    public int getMonth(){
        return this.month;
    }

    public String getIsbn(){
        return this.isbn;
    }

    @Override
    public String toString() {
        return String.format("WishlistItem{id=%s, month=%s isbn=%s}", id, month, isbn);
    }
}
