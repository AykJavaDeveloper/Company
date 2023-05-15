package com.example.Company;

public class Main {
    public static void main(String[] args) {

        TopManage topManagerTwo = new TopManage(110_000, "Gamlet");

        TopManage topManager = new TopManage(100_000, "Stepan");

        Manager managerTwo = new Manager(80_000, "Petya");

        Manager manager = new Manager(70_000, "Oleg");

        Operator operator = new Operator(40_000.0, "Oksana");

        Operator operatorTwo = new Operator(30_000.0, "Ira");

        Operator operatorOne = new Operator(20_000.0, "Vika");

        Company company = new Company();

        company.hire(operator);
        company.hire(operatorOne);
        company.hire(operatorTwo);
        company.hire(manager);
        company.hire(managerTwo);
        company.hire(topManager);
        company.hire(topManagerTwo);

        company.getSortedEmployees();
        company.outEmployees();
//        company.getTopSalaryStaff(4);
    }
}
