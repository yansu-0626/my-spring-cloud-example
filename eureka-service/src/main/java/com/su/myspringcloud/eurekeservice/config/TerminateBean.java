package com.su.myspringcloud.eurekeservice.config;

import javax.annotation.PreDestroy;

/**
 * @ClassName TerminateBean
 * @Description TODO
 * @Author yansu
 * @Date 2020/12/17 下午 3:46
 * @Version 1.0
 **/
public class TerminateBean {
    @PreDestroy
    public void preDestroy() {
        System.out.println("TerminalBean is destroyed");
    }
}
