package com.corejava;

import javax.print.attribute.standard.MediaSize;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by mavis on 4/7/16.
 */
public class Employee extends Person{
    private String name;
    private double salary;
    private Date hireday;
    private static int nextID = 1;
    private int id;

    public Employee(String name, double salary, int year, int month, int day)
    {
        super(name);
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        this.hireday = calendar.getTime();
    }

    public void setId()
    {
        this.id = nextID;
        nextID++;
    }

    @Override
    public boolean equals(Object otherObject) {
        Employee other = (Employee) otherObject;
        return this.name == other.getName();
    }

    public int getId(){ return id; }

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

    public void getDescription()
    {
        System.out.println(this.getName() + " is hired on " + this.getHireday());
    }
}
