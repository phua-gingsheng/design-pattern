package com.phua.factory;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, Integer workingHours, Integer rate, Type type) {
        super(name, workingHours, rate, type);
    }
    public Integer calculateBonus() {
        return calculateMonthlySalary() * 3;
    }
}
