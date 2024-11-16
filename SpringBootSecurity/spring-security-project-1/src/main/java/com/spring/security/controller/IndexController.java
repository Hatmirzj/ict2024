package com.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
@AllowerMethod
	@GetMapping("/product")
	public String productDetails() {
		return "Product DEtails ";
	}
	
	
}