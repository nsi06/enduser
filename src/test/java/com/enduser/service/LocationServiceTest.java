package com.enduser.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LocationServiceTest {
    @InjectMocks
    private LocationService locationService;

    @Test
    void shouldProcessLocation() {
        locationService.processLocationUpdate("(10, 20)");
    }
}
