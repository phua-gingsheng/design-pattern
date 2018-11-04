package com.phua.factory;

public class ContractTimeEmployee extends Employee {
    public ContractTimeEmployee(String name, Integer workingHours, Integer rate, Type type) {
        super(name, workingHours, rate, type);
    }

    public Integer calculateBonus() {
        return 0;
    }
}
