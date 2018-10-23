package com.ming.ch31eurekaserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caibosi on 2018-06-20.
 */
@RestController
@RequestMapping("/query")
public class QueryController {


    private EurekaClientConfigBean eurekaClientConfigBean;

    @Autowired
    public QueryController(EurekaClientConfigBean eurekaClientConfigBean) {
        this.eurekaClientConfigBean = eurekaClientConfigBean;
    }

    @GetMapping("/eureka-server")
    public Object getEurekaServerUrl() {
        return eurekaClientConfigBean.getServiceUrl();
    }
}
