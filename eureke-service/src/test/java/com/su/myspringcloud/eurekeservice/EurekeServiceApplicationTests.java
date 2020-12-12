package com.su.myspringcloud.eurekeservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class EurekeServiceApplicationTests {

    @Autowired
    DiscoveryClient discoveryClient;

    @Test
    void contextLoads() {
        Assert.notNull("","不能为空");
        List<ServiceInstance> instances = discoveryClient.getInstances("MSGCENTERSERVICE");
        System.out.println(instances);
    }

}
