package com.ming.provider.controller;


import com.ming.provider.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * @author chenmingcan
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUser(User user , HttpServletRequest request){
		String token=request.getHeader("oauthToken");
        System.out.println(token);
		return "hello,"+user.getName();
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateUser( @RequestBody User user){

	    return "hello,"+user.getName();
	}


}
