package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RideTest {

    @Test
    void testCreate(){
        Ride ride = new Ride(1, 1, 12);
        assertEquals(1, ride.getDayOfWeek());
    }

    @Test
    void testIsBefore() {
        Ride ride = new Ride(1, 2, 1);
        Ride rideFailed = new Ride(1, 1, 1);
        assertFalse(ride.isBefore(rideFailed));
    }

}