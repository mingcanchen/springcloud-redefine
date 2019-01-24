package com.ming.zuulservice;

import com.ming.zuulservice.extension.MyDiscoveryEnabledAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ZuulServiceApplication {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "zuul");

        new SpringApplicationBuilder(ZuulServiceApplication.class).run(args);
    }

    @Bean
    public MyDiscoveryEnabledAdapter myDiscoveryEnabledAdapter() {
        return new MyDiscoveryEnabledAdapter();
    }

}

