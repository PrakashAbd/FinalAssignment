package com.mindtree.assign1.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mindtree.assign1.entity.User;

@Controller
public class LoginController {
	@RequestMapping(value = "/index")
	public String method() 
	{
		System.out.println("Hi");
		return "index";
	}

	@ResponseBody
	@PostMapping(value = "/validate.jsp", consumes = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	public void validate(@RequestBody User user) {
		System.out.println("Hi");
		System.out.println(user);
	}
}
