package com.ming.userservice.service.dataservice;


import com.ming.userservice.service.fallback.UserClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * feign调用数据服务
 * @author zhudeming
 *
 */
@FeignClient(name = "sc-data-service", fallback= UserClientFallback.class)
public interface DataService {
	
	@RequestMapping(value = "/getDefaultUser", method = RequestMethod.GET)
    String getDefaultUser();
    
    @RequestMapping(value = "/getContextUserId", method = RequestMethod.GET)
    String getContextUserId();

}
