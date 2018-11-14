package com.ming.service.service;

import com.ming.service.service.impl.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "sc-provider-service", fallback = UserServiceFallback.class)
public interface IUserService {
	
	@RequestMapping(value = "/getUser",method = RequestMethod.GET)
    String getUser(@RequestParam("username") String username);
    
}
