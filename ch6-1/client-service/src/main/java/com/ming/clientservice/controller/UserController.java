package com.ming.clientservice.controller;

import com.ming.clientservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmingcan
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getUser")
    public String getUser(@RequestParam String username) throws Exception{
        return userService.getUser(username);
    }

}
