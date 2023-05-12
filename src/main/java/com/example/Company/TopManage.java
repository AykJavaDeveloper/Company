package com.example.Company;

import lombok.Data;

@Data
public class TopManage implements Employee {
private double salary;

public TopManage(double salary) {
    this.salary = salary;
}
    @Override
    public double getSalary() {
        return salary;
    }
}
