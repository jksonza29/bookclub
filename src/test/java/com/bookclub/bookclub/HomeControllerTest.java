package com.bookclub.bookclub;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.hamcrest.Matchers.containsString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.assertj.core.api.Assertions.assertThat;


import com.bookclub.bookclub.web.HomeController;

@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    @MockBean
    private HomeController controller;

    @Autowired
	private MockMvc mockMvc;

    @Test
	public void testShowAboutUs() throws Exception{
		when(controller.showAboutUs()).thenReturn("about");

		this.mockMvc.perform(get("/about")).andExpect(status().isOk()).andExpect(content().string(containsString("about")));
	}

	@Test
	public void testShowContact() throws Exception{
		when(controller.showAboutUs()).thenReturn("contact");

		this.mockMvc.perform(get("/contact")).andExpect(status().isOk()).andExpect(content().string(containsString("contact")));
	}

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}
