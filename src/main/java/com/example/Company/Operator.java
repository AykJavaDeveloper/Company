package com.example.Company;


import lombok.Data;

@Data
public class Operator implements Employee {
    private double salary;

    public Operator(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
