package com.java.mvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/harish")
	public ModelAndView harish() {
		return new ModelAndView("harish");
	}
	
	@RequestMapping("/sachin")
	public ModelAndView sachin() {
		return new ModelAndView("sachin");
	}
	
	@RequestMapping("/sunil")
	public ModelAndView sunil() {
		return new ModelAndView("sunil");
	}

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("home");
	}
}
