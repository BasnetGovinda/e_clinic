package com.e_clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	
//	@RequestMapping("/test")  
//	public String home2() {
//		return "index";
//	}
	
	
}
