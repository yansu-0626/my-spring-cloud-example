package com.su.myspringcloud.eurekeservice.Listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName SpringListener
 * @Description TODO
 * @Author yansu
 * @Date 2020/12/17 下午 2:50
 * @Version 1.0
 **/
@Component
public class SpringListener implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // args 就是 main 函数的 args
        System.err.println("服务启动完成，args=" + Arrays.toString(args));
    }
}
