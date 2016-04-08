package com.corejava;

/**
 * Created by mavis on 4/8/16.
 */
abstract class Person {
    private String name;
    public Person(String name)
    {
        this.name = name;
    }

    abstract public void getDescription();

    public String getName(){ return name; }
}
