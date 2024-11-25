package com.example.creational.factory;

public class EmployeeService {

    public static void main(String[] args) {
        Employee employee = new EmployeeFactory().createEmployee("contractor", "Aaron",
                600000, 50, 176);
        System.out.println(employee.calculateSalary());
    }
}
