package com.ming.democonsumer;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.ming.api.HelloService;

/**
 * @author chenmingcan
 */
//@SpringBootApplication
public class DemoConsumerApplication {

    public static void main(String[] args) {

        ReferenceConfig<HelloService> referenceConfig = new ReferenceConfig<>();
        referenceConfig.setApplication(new ApplicationConfig("hello-service-consumer"));
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        referenceConfig.setRegistry(registryConfig);
        referenceConfig.setInterface(HelloService.class);
        HelloService greetingService = referenceConfig.get();
        System.out.println(greetingService.hello());

//        SpringApplication.run(DemoConsumerApplication.class, args);
    }

}

