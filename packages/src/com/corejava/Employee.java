package com.corejava;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by mavis on 4/7/16.
 */
public class Employee {
    private String name;
    private double salary;
    private Date hireday;

    public Employee(String name, double salary, int year, int month, int day)
    {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        this.hireday = calendar.getTime();
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public Date getHireday() {
        return hireday;
    }

    public void raiseSalary(double byPercent)
    {
        salary = salary + (salary * byPercent) / 100;
    }
}
