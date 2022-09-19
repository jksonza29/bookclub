package com.bookclub.bookclub.service;
import java.util.*;

public interface GenericDao<E , K> {
    List<E> list(); //Return a list of objects of type E.
    E find(K key); //Return an object of type E by type K value.
}
