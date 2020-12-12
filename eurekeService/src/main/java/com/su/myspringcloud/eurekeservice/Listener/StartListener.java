package com.su.myspringcloud.eurekeservice.Listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @ClassName StartListener
 * @Description TODO
 * @Author yansu
 * @Date 2020/12/12 下午 9:54
 * @Version 1.0
 **/
public class StartListener implements ApplicationListener<ContextRefreshedEvent> {
    private Logger logger = LoggerFactory.getLogger(StartListener.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        logger.info("程序启动");
    }
}