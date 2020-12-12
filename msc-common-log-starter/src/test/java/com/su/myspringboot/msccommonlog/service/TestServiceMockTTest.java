package com.su.myspringboot.msccommonlog.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName TestServiceMockTTest
 * @Description 模拟业务组件
 * 假设上面的HelloService.cs是操作数据库或调用第三方接口，为了不让这些外部不稳定因素影响单元测试的运行结果，
 * 可使用mock来模拟
 * https://www.cnblogs.com/gdjlc/p/11553274.html
 * 某些组件的返回结果。
 * @Author yansu
 * @Date 2020/12/13 上午 12:09
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceMockTTest {

    @Autowired
    Test1Service test1Service;
    @MockBean
    TestService testService;

    @Test
    public void testMain() {
        //通过willReturn可以直接指定打桩的方法的返回值
        BDDMockito.given(this.testService.hello()).willReturn("hello world");
        test1Service.main();
    }
}
