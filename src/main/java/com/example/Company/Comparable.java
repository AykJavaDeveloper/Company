package com.example.Company;

import java.util.Comparator;

public class Comparable implements Comparator<Operator> {
    @Override
    public int compare(Operator o1, Operator o2) {
        String salaryOne = String.valueOf(o1.getSalary());
        String salaryTwo = String.valueOf(o2.getSalary());
        return -salaryOne.compareTo(salaryTwo);
    }
}
