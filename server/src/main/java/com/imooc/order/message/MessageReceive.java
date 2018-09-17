package com.imooc.order.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class MessageReceive {
    private final Logger log = LoggerFactory.getLogger(MessageReceive.class);

    @RabbitListener(queuesToDeclare = @Queue("productMessage"))
    public void testReceiveMessage(String message){
        log.info("product_server_message:"+message);
    }
}
