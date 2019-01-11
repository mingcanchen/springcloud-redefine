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
public class Gateway7Application {

    public static void main(String[] args) {
        SpringApplication.run(Gateway7Application.class, args);
    }

//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("method_route", r -> r.method("GET")
//                        .uri("http://jd.com"))
//                .build();
//    }

//    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("query_route", r -> r.query("foo","baz")
                        .uri("http://baidu.com"))
                .build();
    }
}

