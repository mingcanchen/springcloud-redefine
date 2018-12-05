package com.ming.userservice.service.impl;


import com.ming.userservice.service.IUserService;
import com.ming.userservice.service.dataservice.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author chenmingcan
 */
@Component
public class UserService implements IUserService {
	
    @Autowired
    private DataService dataService;
    
    @Autowired
    private RestTemplate restTemplate;
    
	@Override
	public String getDefaultUser() {
		return dataService.getDefaultUser();
	}

	@Override
	public String getContextUserId() {
		return dataService.getContextUserId();
	}

	@Override
	public List<String> getProviderData() {
		List<String> result = restTemplate.getForObject("http://sc-data-service/getProviderData", List.class);
		return result;
	}
}
