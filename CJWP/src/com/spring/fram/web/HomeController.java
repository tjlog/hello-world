package com.spring.fram.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="/GETR/",method={RequestMethod.GET})
	public String  home() {
		return "home";
	}
}
