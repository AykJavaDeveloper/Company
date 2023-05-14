package com.example.Company;

import lombok.Data;

@Data
public class Manager extends Employee {

    private double salary;
    private String name;

    public Manager(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }
    @Override
    public double getSalary() {
        return salary;
    }
}
