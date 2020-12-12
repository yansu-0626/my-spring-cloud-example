package com.su.myspringboot.msccommonlog.service;

import com.su.myspringboot.msccommonlog.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName TestServiceTest
 * @Description 测试业务组件
 * WebEnvironment属性设置为NONE，不会启动Web容器，只启动Spring容器
 * @Author yansu
 * @Date 2020/12/13 上午 12:02
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class TestServiceTest {
    @Autowired
    private TestService testService;

    @Test
    public void testHello() {
        String result = testService.hello();
        System.out.println(result);
    }
}