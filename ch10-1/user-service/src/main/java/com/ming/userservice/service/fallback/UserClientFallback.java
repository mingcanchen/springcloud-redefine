package com.ming.userservice.service.fallback;


import com.ming.userservice.service.dataservice.DataService;
import org.springframework.stereotype.Component;

/**
 * @author chenmingcan
 */
@Component
public class UserClientFallback implements DataService {
	
	@Override
	public String getDefaultUser() {
		return "get getDefaultUser failed";
	}
	@Override
	public String getContextUserId() {
		return "get getContextUserId failed";
	}
	
}
