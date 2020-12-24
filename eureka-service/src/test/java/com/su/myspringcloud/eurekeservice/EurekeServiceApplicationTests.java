package com.su.myspringcloud.eurekeservice;

import com.su.myspringboot.msccommonlog.domain.TestDTO;
import com.su.myspringboot.msccommonlog.service.Test1Service;
import com.su.myspringboot.msccommonlog.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;
@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
class EurekeServiceApplicationTests {

    @Autowired
    DiscoveryClient discoveryClient;
    @Autowired
    TestDTO testDTO;
    @Resource
    Test1Service test1Service;
    @Resource
    TestService testService;

    @Test
    void contextLoads() {
        Assert.notNull("", "不能为空");
        List<ServiceInstance> instances = discoveryClient.getInstances("MSGCENTERSERVICE");
        System.out.println(instances);
    }

    @Test
    void testDTO() {
        Assert.notNull(testDTO, "不能为空");
        log.info("{}", testDTO);
    }

    @Test
    void testDTO1() {
        log.info("{}", testService.hello());
        Assert.notNull(test1Service, "不能为空");
        test1Service.main();
    }

}
