package com.corejava;

/**
 * Created by mavis on 4/7/16.
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day)
    {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public double getSalary()
    {
        double basesalary = super.getSalary();
        return basesalary + bonus;
    }
}
