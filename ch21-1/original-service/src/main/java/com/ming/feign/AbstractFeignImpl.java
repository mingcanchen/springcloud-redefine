package com.ming.feign;

import org.springframework.beans.factory.annotation.Autowired;

import com.nepxion.discovery.plugin.framework.adapter.PluginAdapter;

/**
 * @author chenmingcan
 */
public class AbstractFeignImpl {
    @Autowired
    private PluginAdapter pluginAdapter;

    public String doInvoke(String value) {
        String serviceId = pluginAdapter.getServiceId();
        String version = pluginAdapter.getVersion();
        // String host = pluginAdapter.getHost();
        // int port = pluginAdapter.getPort();

        return value + " -> " + serviceId + "[" + version + "]";
    }
}