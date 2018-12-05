package com.ming.configclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: zzf
 * @date: 2018/3/16
 * @time: 23:55
 * @description : 配置信息
 */
@Component
@ConfigurationProperties(prefix = "com.ming")
public class ConfigInfoProperties {

    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
