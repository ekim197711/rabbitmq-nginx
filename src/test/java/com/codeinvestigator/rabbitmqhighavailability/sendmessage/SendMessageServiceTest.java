package com.codeinvestigator.rabbitmqhighavailability.sendmessage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SendMessageServiceTest {

    @Autowired
    SendMessageService sendMessageService;

    @Test
    void sendSomething() throws InterruptedException {
        for (int i = 1; i < 20000; i++) {
            System.out.println("message no " + i);
            sendMessageService.sendSomething("Hello " + i);
            Thread.sleep(500);
        }
    }
}