package com.qiaoyansong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJms
@EnableScheduling
public class SpringbootActivemqProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootActivemqProviderApplication.class, args);
    }

}
