package com.bookclub.bookclub.service;
import java.util.*;

public interface GenericCrudDao<E , K> {
    List<E> list(); //Return a list of objects of type E.
    E find(K key); //Return an object of type E by type K value.
    void add(E entity);
    void update(E entity);
    Boolean remove(E entity);
}
