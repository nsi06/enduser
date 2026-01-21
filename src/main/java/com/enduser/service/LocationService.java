package com.enduser.service;

import org.springframework.stereotype.Service;

@Service
public class LocationService {

    public void processLocationUpdate(String location) {
        System.out.println("Received location update: " + location);    }
}
