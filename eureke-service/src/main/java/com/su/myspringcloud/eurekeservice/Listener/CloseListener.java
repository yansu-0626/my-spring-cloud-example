package com.su.myspringcloud.eurekeservice.Listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

/**
 * @ClassName CloseListener
 * @Description TODO
 * @Author yansu
 * @Date 2020/12/12 下午 9:54
 * @Version 1.0
 **/
public class CloseListener implements ApplicationListener<ContextClosedEvent> {
    private Logger logger = LoggerFactory.getLogger(CloseListener.class);

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        logger.info("程序停止");
    }
}