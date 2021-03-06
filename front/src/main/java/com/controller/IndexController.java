package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@RequestMapping(value = { "/","/index" },method = RequestMethod.GET)
	public String index() {
	
		return "index";
	}
	@RequestMapping(value = { "/signup" },method = RequestMethod.GET)
	public String signup() {
	
		return "signup";
	}
	@RequestMapping(value = { "/login" },method = RequestMethod.GET)
	public String login() {
	
		return "login";
	}
}