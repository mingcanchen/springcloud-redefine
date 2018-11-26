package com.ming.zuulserver.config;

import com.ming.zuulserver.DynamicZuulRouteLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenmingcan
 */
@Configuration
public class DynamicZuulConfig {

	@Autowired
	private ZuulProperties zuulProperties;
	
	@Autowired
	private ServerProperties serverProperties;
	
	@Bean
	public DynamicZuulRouteLocator routeLocator() {
		DynamicZuulRouteLocator routeLocator = new DynamicZuulRouteLocator(
				serverProperties.getServlet().getServletPrefix(), zuulProperties);
		return routeLocator;
	}
}
