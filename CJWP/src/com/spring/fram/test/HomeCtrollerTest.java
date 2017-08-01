package com.spring.fram.test;

import org.junit.Test;

import com.spring.fram.web.HomeController;


public class HomeCtrollerTest {

	@Test
	public void  testHomePage() throws Exception{
		HomeController hcl = new HomeController();
		
		System.out.println(hcl.home());
	}
}
