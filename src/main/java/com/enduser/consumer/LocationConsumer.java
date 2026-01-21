package com.enduser.consumer;

import com.enduser.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LocationConsumer {

    private final LocationService locationService;

    @KafkaListener(topics = "location-update-topic", groupId = "enduser-group")
    public void consume(String location) {
        locationService.processLocationUpdate(location);
    }
}
