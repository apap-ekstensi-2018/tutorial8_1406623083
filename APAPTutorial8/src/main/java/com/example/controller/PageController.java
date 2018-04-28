package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class PageController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
