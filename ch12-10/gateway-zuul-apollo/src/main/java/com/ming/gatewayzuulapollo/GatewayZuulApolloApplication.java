package com.ming.gatewayzuulapollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author chenmingcan
 */
@EnableApolloConfig
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GatewayZuulApolloApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulApolloApplication.class, args);
    }

}

