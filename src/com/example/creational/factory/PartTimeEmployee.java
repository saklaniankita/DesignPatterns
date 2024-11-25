package com.example.creational.factory;

public class PartTimeEmployee extends Employee {
    private final String name;
    private final double hourlyRate;
    private final int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
