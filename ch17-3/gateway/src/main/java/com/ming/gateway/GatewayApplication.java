package com.ming.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

/**
 * @author chenmingcan
 */
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
// head
//    @Bean
//    public RouteLocator testRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("add_request_header_route", r ->
//                        r.path("/test").filters(f -> f.addRequestHeader("X-Request-Acme", "ValueB"))
//                                .uri("http://localhost:8071/test/head"))
//                .build();
//    }

// 参数
//    @Bean
//    public RouteLocator testRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("add_request_parameter_route", r ->
//                        r.path("/addRequestParameter").filters(f -> f.addRequestParameter("example", "ValueB"))
//                                .uri("http://localhost:8071/test/addRequestParameter"))
//                .build();
//    }

//    rewrite path 重写地址
//    @Bean
//    public RouteLocator testRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("rewritepath_route", r ->
//                        r.path("/foo/**").filters(f -> f.rewritePath("/foo/(?<segment>.*)","/$\\{segment}"))
//                                .uri("http://www.baidu.com"))
//                .build();
//    }

//    添加返回头
//    @Bean
//    public RouteLocator testRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("add_request_header_route", r ->
//                        r.path("/test").filters(f -> f.addResponseHeader("X-Response-Foo", "Bar"))
//                                .uri("http://www.baidu.com"))
//                .build();
//    }

    @Bean
    public RouteLocator retryRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("retry_route", r -> r.path("/test/retry")
                        .filters(f ->f.retry(config -> config.setRetries(2).setStatuses(HttpStatus.INTERNAL_SERVER_ERROR)))
                        .uri("http://localhost:8071/retry?key=abc&count=2"))
                .build();
    }
}

