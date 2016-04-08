package com.corejava;

/**
 * Created by mavis on 4/8/16.
 */
abstract public class Person {
    private String name;
    public Person(String name)
    {
        this.name = name;
    }

    abstract public void getDescription();

//    abstract public boolean equals(Object otherObject); //Unable to write equal method

    public String getName(){ return name; }
}
