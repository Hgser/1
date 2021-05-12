package com.example.customer4;


import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
//@RabbitListener(queues="hello")
//详细设置在这里面做就好了。
@RabbitListener(
        bindings=@QueueBinding(
                value=@Queue(value="${customer4.rabbitmq.exchange.queues.name}",autoDelete="false"),
                exchange=@Exchange(value="${customer4.rabbitmq.exchange.name}",type= ExchangeTypes.DIRECT),
                key="${customer4.rabbitmq.exchange.queues.routingKey}"
        )
)
//在配置里面写可能比较方便。

//customer4:
//        rabbitmq:
//        exchange:
//        - name: icao.sale_order
//        type: topic
//        queues:
//        - name: test
//        routingKey: 'jf.*'
//        - name: hello
//        routingKey: JR-ORDER-ROUTING



public class receiver {

        @RabbitHandler
        public String process(String testmessage){
            System.out.println("接受到的消息"+testmessage);
            return testmessage;
        }
}
