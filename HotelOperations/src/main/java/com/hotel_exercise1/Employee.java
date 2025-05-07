package com.hotel_exercise1;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double checkInTime;


    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
    }

    public void punchIn(double time) {
        this.checkInTime = time;
    }

    public void punchOut(double time) {
        if (checkInTime == 0) {
            System.out.println("Not checked in!");
            return;
        }

        double hours = time - checkInTime;
        if (hours < 0) {
            hours += 24;
        }

        hoursWorked += hours;
        checkInTime = 0;
    }

    public void punchTimeCard(double time) {
        if (checkInTime == 0) {
            punchIn(time);
        } else {
            punchOut(time);
        }
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