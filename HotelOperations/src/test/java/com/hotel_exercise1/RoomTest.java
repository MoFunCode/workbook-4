package com.hotel_exercise1;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void checkIn() throws Exception {

        Room room1 = new Room(1,150,false, false);
        boolean result_For_Room1 = room1.checkIn();

        assertTrue(room1.isOccupied());
        assertTrue(room1.isDirty());
        assertFalse(result_For_Room1);


    }

    @org.junit.jupiter.api.Test
    void checkOut() {
    }

    @org.junit.jupiter.api.Test
    void cleanRoom() {


    }
}