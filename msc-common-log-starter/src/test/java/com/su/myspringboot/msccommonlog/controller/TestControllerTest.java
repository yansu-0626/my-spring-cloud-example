package com.su.myspringboot.msccommonlog.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName TestControllerTest
 * @Description 测试Web服务
 * WebEnvironment.RANDOM_PORT会启动一个真实的Web容器，RANDOM_PORT表示随机端口，如果想使用固定端口，可配置为
 * WebEnvironment.DEFINED_PORT，该属性会读取项目配置文件（如application.properties）中的端口（server.port）。
 * 如果没有配置，默认使用8080端口。
 * @Author yansu
 * @Date 2020/12/12 下午 11:49
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testIndex() {
        String result = restTemplate.getForObject("/", String.class);
        Assert.assertEquals("index", result);
    }

    @Test
    public void testHello() {
        String result = restTemplate.getForObject("/hello", String.class);
//        Assert.assertEquals("Hello", result);//这里故意写错
        Assert.assertEquals("hello", result);
    }
}