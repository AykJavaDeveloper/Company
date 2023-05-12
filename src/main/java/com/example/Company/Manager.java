package com.example.Company;

import lombok.Data;

@Data
public class Manager implements Employee {

    private double salary;

    public Manager(double salary) {
        this.salary = salary;
    }
    @Override
    public double getSalary() {
        return salary;
    }
}
