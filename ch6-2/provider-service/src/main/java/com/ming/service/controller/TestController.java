package com.ming.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/getUser",method = RequestMethod.GET)
	public String getUser(@RequestParam("username") String username){
		return "This is real user";
	}
}
