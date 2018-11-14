package com.ming.provider.controller;


import com.ming.feign.model.User;
import com.ming.feign.service.UserService;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author chenmingcan
 */
@RestController
public class UserController implements UserService {

    @Override
    public String addUser(User user) {
        return "hello," + user.getName();
    }

    @Override
    public String updateUser(User user) {
        return "hello," + user.getName();
    }


}
