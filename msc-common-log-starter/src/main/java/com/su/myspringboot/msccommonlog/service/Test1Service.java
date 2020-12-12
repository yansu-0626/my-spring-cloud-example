package com.su.myspringboot.msccommonlog.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author yansu
 * @Date 2020/12/12 下午 10:52
 * @Version 1.0
 **/
@Component
@Slf4j
public class Test1Service {

    @Autowired
    TestService testService;

    public void main() {
        log.info("{}",Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("调用业务方法");
        String result = testService.hello();
        System.out.println("返回结果：" + result);
    }
}
