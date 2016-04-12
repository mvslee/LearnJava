package com.corejava;

import java.util.Objects;

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


    @Override public boolean equals(Object otherObject)
    {
        if (!super.equals(otherObject)) return false;
        Manager other = (Manager) otherObject;
        return this.bonus == other.bonus;
    }

    @Override public int hashCode()
    {
        return super.hashCode()+Objects.hash(bonus);
        // name, salary and hireDay are private accesses in father class
        // use get method instead of directly pass variables.
    }

    @Override public String toString()
    {
        return super.toString() +
                "[bonus = " + bonus +"]";
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    @Override public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public Manager clone() throws CloneNotSupportedException
    {
        return (Manager) super.clone();
    }
}
