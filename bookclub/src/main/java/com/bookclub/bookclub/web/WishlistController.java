package com.bookclub.bookclub.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;
import com.bookclub.bookclub.model.WishlistItem;
import com.bookclub.bookclub.service.impl.MemWishlistDao;
import javax.validation.Valid;
import java.util.*;


@Controller@RequestMapping("/wishlist")
public class WishlistController {
    @RequestMapping(method = RequestMethod.GET)
    public String showWishlist(Model model){
        MemWishlistDao wishlistDao = new MemWishlistDao();
        List<WishlistItem> wishlist = wishlistDao.list();

        for(WishlistItem wishlistItem : wishlist){
            System.out.println(wishlistItem.toString());
        }

        model.addAttribute("wishlist", wishlist);

        return "wishlist/list";
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/new")
    public String wishlistForm(Model model){
        model.addAttribute("WishlistItem", new WishlistItem());
        return "wishlist/new";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addWishlistItem(@Valid WishlistItem wishlistItem, BindingResult bindingResult) {
        System.out.println(wishlistItem.toString());

        System.out.println(bindingResult.getAllErrors());

        if (bindingResult.hasErrors()) {
            return "wishlist/new";
        }

        return "redirect:/wishlist";
    }


}
