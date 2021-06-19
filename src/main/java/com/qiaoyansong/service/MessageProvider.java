package com.qiaoyansong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.jms.Queue;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2021/6/19 16:50
 * description：
 */

@Service
public class MessageProvider {

    @Autowired
    private JmsMessagingTemplate template;

    @Autowired
    private Queue queue;

    /**
     * 本方法在测试类中使用
     */
    public void provideMessage(){
        template.convertAndSend(queue,"springboot-provider");
        System.out.println("消息发送完毕");
    }

    /**
     * 每间隔3s 发送一条消息 对于这种定时的 只需要启动主类 就会自动开始定时任务
     */
    @Scheduled(fixedDelay = 3000)
    public void provideMessageScheduled(){
        template.convertAndSend(queue,"springboot-provider");
        System.out.println("定时消息发送完毕");
    }
}
