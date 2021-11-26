package day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {
    Courier courier = new Courier();

    @BeforeEach
    void init() {
        courier.addRide(new Ride(1, 1, 12));
        courier.addRide(new Ride(1, 2, 11));
        courier.addRide(new Ride(2, 1, 10));
        courier.addRide(new Ride(4, 1, 19));
        courier.addRide(new Ride(4, 2, 5));

    }

    @Test
    void testAddRide() {
        assertEquals(4, courier.getRides().get(4).getDayOfWeek());

    }

    @Test
    void testAddRideFailed() {
        IllegalArgumentException e=assertThrows(IllegalArgumentException.class,
                ()->courier.addRide(new Ride(4, 1, 2)));
        assertEquals("Invalid ride!",e.getMessage());

    }
}