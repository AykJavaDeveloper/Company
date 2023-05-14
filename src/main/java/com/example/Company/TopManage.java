package com.example.Company;

import lombok.Data;

@Data
public class TopManage extends Employee {

    private double salary;
    private String name;

    public TopManage(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
