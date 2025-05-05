package com.hotel_exercise1;

public class MainHotelOperations {

    public static void main(String[] args) {

        System.out.println("Welcome again Mo! Below is your reservation details...");

        Room room1 = new Room(1, 124.0, false, false);
        System.out.println("Room is available: " + room1.isAvailable());


        Reservation reservation = new Reservation("king", 2, true);
        System.out.println("Your Total cost: $" + reservation.getReservationTotal());


    }


}
