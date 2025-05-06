package com.hotel_exercise1;

/*
 * Room Class Modifications:
 * --------------------------
 * Add the following methods to the Room class:
 *   - checkIn()
 *   - checkOut()
 *   - cleanRoom()
 *
 * Behavior:
 *   - When a room is checked in:
 *       -> It becomes occupied
 *       -> It is marked as dirty
 *   - When a guest checks out:
 *       -> The room must be cleaned before another guest can check in
 *
 *
 * Employee Class Modifications:
 * ------------------------------
 * Add the following methods to the Employee class:
 *   - punchIn(double time)
 *   - punchOut(double time)
 *
 * Behavior:
 *   - punchIn(double time):
 *       -> Tracks the start time of the employee
 *   - punchOut(double time):
 *       -> Calculates the hours worked based on start time
 *       -> Adds the worked hours to total hours worked
 *
 * Time Format:
 *   - Use double values to represent time (e.g., 10:00 am => 10.0, 12:30 pm => 12.5, 2:45 pm => 14.75)
 *
 *
 * Bonus Enhancement:
 * -------------------
 * Instead of two separate methods (punchIn and punchOut),
 * implement a single method called:
 *   - punchTimeCard(double time)
 * This method should handle both punching in and out depending on the employee's current state.
 */


public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;


    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }


    public void checkIn() throws Exception {
        if (isAvailable()) {
            this.occupied = true;
            this.dirty = true;
        } else {
            throw new Exception("Cannot check in...room is either occupied or dirty.");
        }
    }

    public void checkOut() {

    }

    public void cleanRoom() {

    }
}




