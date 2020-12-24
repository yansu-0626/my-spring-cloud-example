package com.su.myspringcloud.eurekeservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ShutDownConfig
 * @Description TODO
 * @Author yansu
 * @Date 2020/12/17 下午 3:46
 * @Version 1.0
 **/
@Configuration
public class ShutDownConfig {
    @Bean
    public TerminateBean getTerminateBean() {
        return new TerminateBean();
    }
}
