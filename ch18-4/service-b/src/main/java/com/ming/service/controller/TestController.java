package com.ming.service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmingcan
 */
@RestController
public class TestController {

	@GetMapping("/test")
	public String prefixPath(){
		return "https to Http";
	}

}
