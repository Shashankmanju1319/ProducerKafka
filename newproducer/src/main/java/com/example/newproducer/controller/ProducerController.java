package com.example.newproducer.controller;

import com.example.newproducer.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private KafkaProducerService producerService;

    @GetMapping("/produce")
    public String produceMessage(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "Message sent to Kafka Topic!";
    }
}