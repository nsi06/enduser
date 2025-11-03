package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig  {

    @KafkaListener(topics = "location-update-topic", groupId = "enduser-group")
    public void updatedLocation(String location) {
        // store in the database or send email notification whatever you want
        System.out.println("Received location update: " + location);

    }
}
