package com.bookclub.bookclub.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bookclub.bookclub.model.BookOfTheMonth;
import com.bookclub.bookclub.model.book;
import com.bookclub.bookclub.service.dao.BookOfTheMonthDao;
import com.bookclub.bookclub.service.impl.MongoBookOfTheMonthDao;
import com.bookclub.bookclub.service.impl.RestBookDao;
import java.util.*;

@Controller
@RequestMapping("/")
public class HomeController {
    BookOfTheMonthDao bookOfTheMonthDao = new MongoBookOfTheMonthDao();

    @Autowired
    public void setBookOfTheMonthDao(BookOfTheMonthDao bookOfTheMonthDao) {
        this.bookOfTheMonthDao = bookOfTheMonthDao;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showHome(Model model) {

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int calMonth = cal.get(Calendar.MONTH) + 1;

        RestBookDao bookDao = new RestBookDao();
        List<BookOfTheMonth> monthlyBooks = bookOfTheMonthDao.list(Integer.toString(calMonth));

        StringBuilder isbnBuilder = new StringBuilder();
        isbnBuilder.append("ISBN:");

        for (BookOfTheMonth monthlyBook : monthlyBooks) {
            isbnBuilder.append(monthlyBook.getIsbn()).append(",");
        }

        String isbnString = isbnBuilder.toString().substring(0, isbnBuilder.toString().length() - 1);

        System.out.println("isbnString is: " + isbnString);

        List<book> books = bookDao.list(isbnString);

        if (books.isEmpty()){
            System.out.println("books is empty");
        }

        model.addAttribute("books", books);

        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public String getMonthlyBook(@PathVariable("id") String id, Model model) {
        RestBookDao bookDao = new RestBookDao();

        book book = bookDao.find(id);

        model.addAttribute("book", book);

        return "monthly-books/view";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/about")
    public String showAboutUs()
    {
        return "about";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/contact")
    public String showContactUs()
    {
        return "contact";
    }
}
