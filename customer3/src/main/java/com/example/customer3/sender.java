package com.example.customer3;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

@Component
public class sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${customer3.rabbitmq.exchange}")
    private String exchange;
    @Value("${customer3.rabbitmq.exchange.queues.rountingkey}")
    private String routingkey;


    public String send(String msg)
    {
        System.out.println("Sender:"+"hello rabbitmq:"+msg);
        this.rabbitTemplate.convertAndSend(this.exchange,this.routingkey,msg);
        return ("Sender:"+"hello rabbitmq:"+msg);
    }
}
//通过读取特定的url中的destination指定，确定发往哪个服务端？