package com.example.customer1;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

@Component
public class sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public String send(String msg)
    {
        System.out.println("Sender:"+"hello rabbitmq:"+msg);
        this.rabbitTemplate.convertAndSend("hello", msg);
        return ("Sender:"+"hello rabbitmq:"+msg);
    }
}
