package com.ming.helloservice.service.impl;


import com.ming.helloservice.service.IHelloService;
import com.ming.helloservice.service.dataservice.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 * @author chenmingcan
 */
@Component
public class HelloService implements IHelloService {
	
    @Autowired
    private ProviderService dataService;

	@Override
	public List<String> getProviderData() {
		return dataService.getProviderData();
	}

}
