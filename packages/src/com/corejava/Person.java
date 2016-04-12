package com.corejava;

import java.util.Objects;

/**
 * Created by mavis on 4/8/16.
 */
abstract public class Person{
    private String name;
    public Person(String name)
    {
        this.name = name;
    }

    @Override public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        return true;
    }

    @Override public int hashCode()
    {
        return Objects.hash(name);
    }

    @Override public String toString()
    {
        return getClass().getName() +
                "[name = " + getName() + "]";
    }

    public String getName(){ return name; }

}
