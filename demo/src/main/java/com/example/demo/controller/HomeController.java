package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	// 커밋
	@RequestMapping(value = "/home")
	public String home() {
		System.out.println("test");
		return "home";
	}
	
}
