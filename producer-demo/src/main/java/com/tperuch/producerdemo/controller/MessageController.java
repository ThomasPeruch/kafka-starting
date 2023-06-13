package com.tperuch.producerdemo.controller;

import com.tperuch.producerdemo.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/send-message")
    public void sendMessage(@RequestBody String message){
        kafkaService.sendMessage(message);
    }
}
