package com.example.customer2;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues="hello")
public class receiver {
    @RabbitHandler
    public String process(String testmessage){
        System.out.println("接受到的消息"+testmessage);
        return testmessage;
    }
}
