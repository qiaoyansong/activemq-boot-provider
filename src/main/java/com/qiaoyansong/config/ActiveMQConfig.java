package com.qiaoyansong.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2021/6/19 16:44
 * description：
 */
@Configuration
public class ActiveMQConfig {

    @Value("${queueName}")
    private String queueName;

    /**
     * 如果使用Topic的话 需要修改下面的代码 以及配置文件中的部分内容
     */
    @Bean
    public Queue queue(){
        return new ActiveMQQueue(queueName);
    }
}
