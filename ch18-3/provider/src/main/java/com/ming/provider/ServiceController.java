package com.ming.provider;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmingcan
 */
@RestController
public class ServiceController {

	@GetMapping(value = "/v1")
	public String v1() {
		return "v1";
	}

	@GetMapping(value = "/v2")
	public String v2() {
		return "v2";
	}
}
