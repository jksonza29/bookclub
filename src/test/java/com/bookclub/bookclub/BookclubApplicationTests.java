package com.bookclub.bookclub;

import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultHandler;
import static org.assertj.core.api.Assertions.assertThat;

import com.bookclub.bookclub.model.WishlistItem;
import com.bookclub.bookclub.model.book;
import com.bookclub.bookclub.service.dao.WishlistDao;
import com.bookclub.bookclub.service.impl.MongoWishlistDao;
import com.bookclub.bookclub.web.HomeController;

@WebMvcTest
@SpringBootTest
public class BookclubApplicationTests {

	@Autowired
	private HomeController controller;

	@MockBean
	WishlistDao wishlistDao;


}
