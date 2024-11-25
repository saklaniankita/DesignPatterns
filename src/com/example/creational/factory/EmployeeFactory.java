package com.example.creational.factory;

public class EmployeeFactory {

    public Employee createEmployee(String employeeType, String name, double baseSalary, double hourlyRate, int hoursWorked){
        return switch (employeeType.toLowerCase()) {
            case "fulltime" -> new FullTimeEmployee(name, baseSalary);
            case "parttime" -> new PartTimeEmployee(name, hourlyRate, hoursWorked);
            case "contractor" -> new Contractor(name, baseSalary);
            default -> throw new IllegalArgumentException("Unknown Employee Type: " + employeeType);
        };

    }
}
