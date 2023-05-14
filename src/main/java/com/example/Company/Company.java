package com.example.Company;

import lombok.Data;

import java.util.TreeSet;

@Data
public class Company {

    private double fullSalary;

    private TreeSet<Operator> operators = new TreeSet<>(new Comparable());

    public void hire(Operator operator) {
        operators.add(operator);
        fullSalary += operator.getSalary();
    }

}
