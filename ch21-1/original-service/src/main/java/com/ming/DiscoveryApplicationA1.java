package com.ming;

import com.ming.extension.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DiscoveryApplicationA1 {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "a1");

        new SpringApplicationBuilder(DiscoveryApplicationA1.class).run(args);
    }

    @Bean
    public MyRegisterListener myRegisterListener() {
        return new MyRegisterListener();
    }

    @Bean
    public MyDiscoveryListener myDiscoveryListener() {
        return new MyDiscoveryListener();
    }

    @Bean
    public MyLoadBalanceListener myLoadBalanceListener() {
        return new MyLoadBalanceListener();
    }

    @Bean
    public MySubscriber mySubscriber() {
        return new MySubscriber();
    }

    @Bean
    public MyDiscoveryEnabledAdapter myDiscoveryEnabledAdapter() {
        return new MyDiscoveryEnabledAdapter();
    }
}