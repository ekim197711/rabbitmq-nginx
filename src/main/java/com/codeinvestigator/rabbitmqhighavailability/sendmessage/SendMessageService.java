package com.codeinvestigator.rabbitmqhighavailability.sendmessage;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SendMessageService {
    private final RabbitTemplate rabbit;
    private final static String EXCHANGE = "custom.myexchange1";

    public void sendSomething(String message) {
        rabbit.convertAndSend(
                EXCHANGE,
                "doesntmatter"
                , message);
    }
}
