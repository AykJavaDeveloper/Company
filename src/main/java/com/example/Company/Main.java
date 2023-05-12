package com.example.Company;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator(20_000.0);

        Operator operatorOne = new Operator(30_000.0);

        Operator operatorTwo = new Operator(40_000.0);


        Company company = new Company();

        company.hire(operator);
        company.hire(operatorOne);
        company.hire(operatorTwo);

        System.out.println(company.getFullSalary());
    }
}