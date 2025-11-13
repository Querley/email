package com.ms.email.configs;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueueStarter implements CommandLineRunner {

private final RabbitTemplate rabbitTemplate;

public QueueStarter(RabbitTemplate rabbitTemplate) {
	this.rabbitTemplate = rabbitTemplate;
}

@Override
public void run(String... args) {
	rabbitTemplate.convertAndSend("", "default.email", "Hello! Queue created!");
	System.out.println("Test message sent, queue should appear now.");
}
}
