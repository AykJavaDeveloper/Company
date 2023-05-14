package com.example.Company;

import lombok.Data;

public abstract class Employee {
    private double salary;
    private String name;


    abstract double getSalary();

    abstract String getName();
}
