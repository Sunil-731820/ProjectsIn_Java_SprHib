package com.java.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("home")
	public void home() {
		System.out.println("hello welcome to my boot");
	}

}
