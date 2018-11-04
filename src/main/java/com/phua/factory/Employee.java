package com.phua.factory;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Employee {

    private String name;
    private Integer workingHours;
    private Integer rate;
    private Type type;
    public enum Type {
        FULLTIME,
        CONTRACT
    }
    public Integer calculateMonthlySalary() {
        return getWorkingHours() * getRate() * 25;
    }
    public abstract Integer calculateBonus();
}
