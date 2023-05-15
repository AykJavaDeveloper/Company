package com.example.Company;

import lombok.Data;

import java.util.*;

@Data
public class Company {

    private double fullSalary;

    private List<Employee> employees = new ArrayList<>();

    public void hire(Employee employee) {
        employees.add(employee);
        fullSalary += employee.getSalary();
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }
    public void outEmployees () {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void getTopSalaryStaff(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(employees.get(i));
        }
    }

    public void getLowerSalaryStaff(int count) {
        for (int i = employees.size() - 1; i >= count - 1; i--) {
            System.out.println(employees.get(i).getName() + " - " + employees.get(i).getSalary());
        }
    }


    public void getSortedEmployees() {
        Collections.sort(employees, (o1, o2)->-Double.compare(o1.getSalary(), o2.getSalary()));
    }
}
