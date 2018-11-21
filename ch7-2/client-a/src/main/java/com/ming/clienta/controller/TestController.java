package com.ming.clienta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmingcan
 */
@RestController
public class TestController {

	@GetMapping("/add")
	public Integer add(Integer a, Integer b){
		return a + b;
	}
}
