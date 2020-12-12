package com.su.myspringboot.msccommonlog.domain;

import java.io.Serializable;

/**
 * @ClassName TestDTO
 * @Description TODO
 * @Author yansu
 * @Date 2020/12/12 下午 11:03
 * @Version 1.0
 **/
public class TestDTO implements Serializable {

    private static final long serialVersionUID = 8458659784094723387L;
    private String str1;

    private String str2;

    private String default_str;


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

    public String getDefault_str() {
        return default_str;
    }

    public void setDefault_str(String default_str) {
        this.default_str = default_str;
    }

    @Override
    public String toString() {
        return "TestDTO{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                ", default_str='" + default_str + '\'' +
                '}';
    }

    public String addStr(){
        if(str1 != null){
            if(str2 != null){
                return str1 + "，" + str2;
            }
            return str1;
        }
        return default_str;
    }
}
