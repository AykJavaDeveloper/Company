package com.example.Company;

import lombok.Data;

@Data
public class Company {

    private double fullSalary;

    public void hire(Operator operator){
        fullSalary += operator.getSalary();
    }

}
