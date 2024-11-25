package com.example.creational.factory;

public class FullTimeEmployee extends Employee {
    private final String name;
    private final double baseSalary;

    public FullTimeEmployee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 300000.0;
    }
}