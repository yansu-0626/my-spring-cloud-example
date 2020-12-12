package com.su.myspringboot.msccommonlog.config;

/**
 * @ClassName TestAutoConfiguration
 * @Description TODO
 * @Author yansu
 * @Date 2020/12/12 下午 11:10
 * @Version 1.0
 **/
// 定义 java 配置类

import com.su.myspringboot.msccommonlog.domain.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//引入StringService
@ConditionalOnClass({TestDTO.class})
// 将 application.properties 的相关的属性字段与该类一一对应，并生成 Bean
@EnableConfigurationProperties(TestProperties.class)
public class TestAutoConfiguration {
    // 注入属性类
    @Autowired
    private TestProperties testProperties;

    @Bean
    // 当容器没有这个 Bean 的时候才创建这个 Bean
    @ConditionalOnMissingBean(TestDTO.class)
    public TestDTO helloworldService() {
        TestDTO testDTO = new TestDTO();
        testDTO.setStr1(testProperties.getStr1());
        testDTO.setStr2(testProperties.getStr2());
        return testDTO;
    }


}
