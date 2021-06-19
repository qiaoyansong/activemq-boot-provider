package com.qiaoyansong;

import com.qiaoyansong.service.MessageProvider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2021/6/19 16:57
 * description：
 */

@SpringBootTest
public class TestMessageProvider {

    @Autowired
    private MessageProvider provider;

    @Test
    public void testProvide(){
        provider.provideMessage();
    }

}
