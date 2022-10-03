package com.bookclub.bookclub.service.impl;

import com.bookclub.bookclub.model.WishlistItem;
import com.bookclub.bookclub.service.dao.WishlistDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("wishlistDao")
public class MongoWishlistDao implements WishlistDao{
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<WishlistItem> list(){
        return mongoTemplate.findAll(WishlistItem.class);
    }

    @Override
    public void add(WishlistItem entity){
        mongoTemplate.save(entity);
    }

    @Override
    public WishlistItem find(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(WishlistItem entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Boolean remove(WishlistItem entity) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
