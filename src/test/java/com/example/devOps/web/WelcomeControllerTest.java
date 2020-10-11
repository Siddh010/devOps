package com.example.devOps.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class WelcomeControllerTest {

	private MockMvc mockmvn;

	@Autowired
	private WebApplicationContext context;

	@Before
	public void setUp() {
		mockmvn = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void testWelcome() throws Exception {
		mockmvn.perform(get("/")).andExpect(status().isOk());
	}

}
