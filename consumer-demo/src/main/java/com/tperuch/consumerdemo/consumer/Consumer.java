package com.tperuch.consumerdemo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "TEST_TOPIC", groupId = "test-id-group")
    public void consume(String event){
        System.out.println("Received event: " + event);
    }
}
