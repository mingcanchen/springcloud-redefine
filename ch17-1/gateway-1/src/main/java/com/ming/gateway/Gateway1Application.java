package com.ming.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author chenmingcan
 */
@SpringBootApplication
public class Gateway1Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway1Application.class, args);
    }

    /**
     * 基本的转发
     * 当访问http://localhost:8080/jd
     * 转发到http://jd.com
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                //basic proxy
                .route(r ->r.path("/jd")
                        .uri("http://jd.com:80/").id("jd_route")
                ).build();
    }

}

