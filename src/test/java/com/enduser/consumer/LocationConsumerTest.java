package com.enduser.consumer;

import com.enduser.service.LocationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class LocationConsumerTest {

    @Mock
    private LocationService locationService;

    @InjectMocks
    private LocationConsumer locationConsumer;

    @Test
    void should_call_service_when_message_is_consumed() {
        // Arrange
        String testLocation = "(12.34, 56.78)";

        // Act - We manually call the method to test the delegation logic
        locationConsumer.consume(testLocation);

        // Assert
        verify(locationService, times(1)).processLocationUpdate(testLocation);
    }
}
