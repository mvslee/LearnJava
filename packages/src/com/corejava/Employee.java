package com.corejava;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Created by mavis on 4/7/16.
 */
public class Employee extends Person implements Comparable<Employee>, Cloneable{
    private double salary;
    private Date hireDay;
    private static int nextID = 1;
    private int id;

    public Employee(String name, double salary, int year, int month, int day)
    {
        super(name);
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        this.hireDay = calendar.getTime();
        this.id = nextID;
        nextID++;
    }


    @Override public boolean equals(Object otherObject)
    {
        if (!super.equals(otherObject)) return false;
        //This is a boolean method, use if.. to test true or false, instead of calling super method directly.
        Employee other = (Employee) otherObject;
        return this.getName().equals(other.getName())
                && this.salary == other.salary
                && this.getHireDay().equals(other.getHireDay());
        //Here comes a series of problems:
        //1. Do not use this.field name == field name for complex object; Use .equals instead.
        //2. Use get field method in equals for complex object, as simple equals method will raise NullPointerException
    }

    @Override public int hashCode()
    {
        return Objects.hash(getName(), salary, hireDay);
        // override hashcode after equal method
        // be sure two equal method get the same hashcode.
    }

    @Override public String toString()
    {
        return super.toString() +
                "[salary = " + getSalary() +
                " hireDay = " + getHireDay() +"]";
    }

    public int getId(){ return id; }

    public double getSalary()
    {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        salary = salary + (salary * byPercent) / 100;
    }


    /**Compare employee by salary
     *
     * @param other another comparable object
     * @return negative value if Employee salary lower than other, 0 if the same, positive otherwise
     */
    public int compareTo(Employee other)
    {
        return Double.compare(getSalary(), other.getSalary());
    }

    public Employee clone() throws CloneNotSupportedException
    {
        Employee cloned = (Employee)super.clone();
        cloned.hireDay = (Date)hireDay.clone();
        return cloned;
    }


}
