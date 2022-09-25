package com.bookclub.bookclub.service.impl;
import com.bookclub.bookclub.model.WishlistItem;
import com.bookclub.bookclub.service.dao.WishlistDao;
import java.util.*;


public class MemWishlistDao implements WishlistDao {
    private List<WishlistItem> wishlistItems = new ArrayList<WishlistItem>();

    public MemWishlistDao(){
        WishlistItem wishlistItem = new WishlistItem("1234567890","The DaVinci Code");
        wishlistItems.add(wishlistItem);
        wishlistItem = new WishlistItem("0987654321","Harry Potter");
        wishlistItems.add(wishlistItem);
    }


    @Override
    public List<WishlistItem> list() {
        return this.wishlistItems;
    }

    @Override
    public WishlistItem find(String key) {
        for(WishlistItem wishlistItem : this.wishlistItems){
            if((wishlistItem).getIsbn().equals(key)){
                return wishlistItem;
            }
        }
        return new WishlistItem();
    }
}
