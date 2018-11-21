package com.ming.clientb.controller;

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
	
	@GetMapping("/a/add")
	public Integer aadd(Integer a, Integer b){
		return a + b;
	}
	
	@GetMapping("/sub")
	public Integer sub(Integer a, Integer b){
		return a - b;
	}
	
	@GetMapping("/mul")
	public String mul(Integer a, Integer b){
		return "client-b-" + a * b;
	}
	
	@GetMapping("/div")
	public Integer div(Integer a, Integer b){
		return a / b;
	}
}
