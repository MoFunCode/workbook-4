package com.hotel_exercise1;

    /*
    Employee

    - Modify the Employee class to add a punchIn and punchOut methods. Each
    time the employee punches in, we track their start time.
   - When they punch out, we calculate how many hours they have worked and add
    that time to their hours worked.
    - To keep the math simple for now, each function will take a double as an input
    argument.

    punchIn(double time)
    punchOut(double time
    *
    *
    * */

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;
    private double checkInTime;


    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

    public void checkIn(double time) {
        if (checkInTime != 0) {
            System.out.println("Already checked in!");
            return;
        }
        checkInTime = time;
    }

    public void checkOut(double time) {
        if (checkInTime == 0) {
            System.out.println("Not checked in!");
            return;
        }

        double hours = time - checkInTime;
        if (hours < 0) {
            hours += 24;
        }

        hoursWorked += hours;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40.0);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40.0);
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * (payRate * 1.5);
        return regularPay + overtimePay;
    }

}