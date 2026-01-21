package com.enduser.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    public void processLocationUpdate(String location) {
        this.logger.info("Received location update: " + location);    }
}
