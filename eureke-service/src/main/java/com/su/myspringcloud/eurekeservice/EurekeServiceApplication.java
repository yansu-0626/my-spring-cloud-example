package com.su.myspringcloud.eurekeservice;

import com.su.myspringcloud.eurekeservice.Listener.CloseListener;
import com.su.myspringcloud.eurekeservice.Listener.StartListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekeServiceApplication {
    private static Logger logger = LoggerFactory.getLogger(EurekeServiceApplication.class);

    public static void main(String[] args) {
        logger.info("开始启动");
        SpringApplication sa = new SpringApplication(EurekeServiceApplication.class);
        sa.addListeners(new StartListener());
        sa.addListeners(new CloseListener());
        sa.run(args);
//        SpringApplication.run(EurekeServiceApplication.class, args);
    }

}
