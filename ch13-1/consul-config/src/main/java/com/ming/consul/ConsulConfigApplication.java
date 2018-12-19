package com.ming.consul;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenmingcan
 */
@SpringBootApplication
@RestController
@RefreshScope
public class ConsulConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConfigApplication.class, args);
    }

    // 读取远程配置
    @Value("${foo.bar.name}")
    private String name;

    // 将配置展示在页面
    @GetMapping("/getName")
    public String getName() {
        return name;
    }

}

