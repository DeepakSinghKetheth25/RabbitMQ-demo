package com.bdo.rabbitmq.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.bdo.rabbitmq.demo.config.MessagingConfig;
import com.bdo.rabbitmq.demo.dto.OrderStatus;

@Component
public class User {

	@RabbitListener(queues = MessagingConfig.QUEUE)
	public void consumeMessageFromQueue(OrderStatus orderStatus){
		System.out.println("Message received from Queue "+ orderStatus);
	}
	
}
