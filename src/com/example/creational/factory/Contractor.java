package com.example.creational.factory;

public class Contractor extends Employee {
    private final String name;
    private final double baseSalary;
    

    public Contractor(String name,double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary ;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + 100000.0;
    }
}
