package com.hotel_exercise1;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void testSuccessfulCheckIn() throws Exception {
        // Arrange
        Room room = new Room(1, 100, false, false);

        // Act
        boolean checkInResult = room.checkIn();

        // Assert
        assertTrue(checkInResult);
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());

    }

    @org.junit.jupiter.api.Test
    void testSuccessfulCheckOut() {
        Room occupiedRoom = new Room(1, 100, true, false);
        boolean result = occupiedRoom.checkOut();

        assertFalse(occupiedRoom.isOccupied());
        assertTrue(occupiedRoom.isDirty());
        assertTrue(result);



    }


}
