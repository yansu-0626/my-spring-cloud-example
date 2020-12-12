package com.su.myspringboot.msccommonlog.service;

import com.su.myspringboot.msccommonlog.domain.TestDTO;
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
public class TestService {

    @Autowired
    TestDTO testDTO;

    public TestDTO test() {
        return testDTO;
    }

    public String hello(){
        return "hello";
    }

}
