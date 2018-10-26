package com.ming.consumer.controller;

import com.ming.consumer.model.User;
import com.ming.consumer.service.UserFeignService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author chenmingcan
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserFeignService userFeignService;

    /**
     * 用于演示Feign的Get请求多参数传递
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@RequestBody @ApiParam(name = "用户", value = "传入json格式", required = true) User user) {
        System.out.println(user.toString());
        return userFeignService.addUser(user);
    }

    /**
     * 用于演示Feign的Post请求多参数传递
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser(@RequestBody @ApiParam(name = "用户", value = "传入json格式", required = true) User user) {
        return userFeignService.updateUser(user);
    }

    @GetMapping("/get")
    public String getUser(@ApiParam(name = "id", required = true) String id) {
        return id;
    }

}
