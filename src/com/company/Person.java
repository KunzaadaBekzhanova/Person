package com.company;

public class Person {
    private String name;
    private String designation;

    public String toString() {
        System.out.println("His name is "+ name);
        eat();
        walk();
        learn();
        return  "His designation is "+designation;


    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
        System.out.println("------------------***-----------------");
    }

    public void learn(){
        System.out.println(name+" is learning.");
    }
    public void walk(){
        System.out.println(name+" is walking.");
    }
    public void eat(){
        System.out.println(name+" is eating.");
    }
}
