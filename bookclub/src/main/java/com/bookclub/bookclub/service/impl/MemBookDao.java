package com.bookclub.bookclub.service.impl;
import com.bookclub.bookclub.model.book;
import com.bookclub.bookclub.service.dao.BookDao;
import java.util.*;

public class MemBookDao implements BookDao{
    private List<book> books = new ArrayList<book>();

    public MemBookDao(){
        book book = new book("1234567890","The DaVinci Code","A Robert Langdon mystery.",50,"Dan Brown");
        books.add(book);
        book = new book("0987654321","Harry Potter","A book about magic.",467,"JK Rowling");
        books.add(book);
        book = new book("1920478290","The Hunger Games","Fighting for survival.",378,"Suzanne Collins");
        books.add(book);
        book = new book("8829301923","The Fault In Our Stars","A romantic tragedy.",391,"John Green");
        books.add(book);
        book = new book("9203394501","Charlotte's Web","A tale between pig and spider.",467,"E. B. White");
        books.add(book);
    }


    @Override
    public List<book> list() {
        return this.books;
    }

    @Override
    public book find(String key) {
        for(book book : this.books){
            if(book.getIsbn().equals(key)){
                return book;
            }
        }
        return new book();
    }
    
}
