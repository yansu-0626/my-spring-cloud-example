package com.su.myspringboot.msccommonlog.config;

/**
 * @ClassName TestProperties
 * @Description TODO
 * @Author yansu
 * @Date 2020/12/12 下午 11:08
 * @Version 1.0
 **/
//指定项目在属性文件中配置的前缀为str，即可以在属性文件中通过 str.str1=springboot，就可以改变属性类字段 str1 的值了

import org.springframework.boot.context.properties.ConfigurationProperties;

@SuppressWarnings("ConfigurationProperties")
@ConfigurationProperties(prefix = "str")
public class TestProperties {
    public static final String DEFAULT_STR1 = "I know, you need me";

    public static final String DEFAULT_STR2 = "but I also need you";

    private String str1 = DEFAULT_STR1;

    private String str2 = DEFAULT_STR2;

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
}
