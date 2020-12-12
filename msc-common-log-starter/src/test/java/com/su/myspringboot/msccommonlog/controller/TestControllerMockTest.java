package com.su.myspringboot.msccommonlog.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.net.URI;

/**
 * @ClassName TestControllerMockTest
 * @Description 模拟Web测试
 * 设置WebEnvironment属性为WebEnvironment.MOCK，启动一个模拟的Web容器。
 * 测试方法中使用Spring的MockMvc进行模拟测试
 * @Author yansu
 * @Date 2020/12/12 下午 11:56
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)//MOCK为默认值，也可不设置
@AutoConfigureMockMvc
public class TestControllerMockTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public  void testIndex() throws Exception{
        ResultActions ra = mvc.perform(MockMvcRequestBuilders.get(new URI("/")));
        MvcResult result = ra.andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }

    @Test
    public  void testHello() throws Exception{
        ResultActions ra = mvc.perform(MockMvcRequestBuilders.get(new URI("/hello")));
        MvcResult result = ra.andReturn();
        System.out.println(result.getResponse().getContentAsString());
    }
}
