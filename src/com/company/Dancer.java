package com.company;

public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dancing(){
        System.out.println("His is dancing in "+groupName+" group.");
    }
}
