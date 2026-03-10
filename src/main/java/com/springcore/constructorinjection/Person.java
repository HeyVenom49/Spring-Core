package com.springcore.constructorinjection;

public class Person {
    private String name;
    private int personId;
    private Courses courses;
    public Person(String name, int personId, Courses courses) {
        this.name = name;
        this.personId = personId;
        this.courses = courses;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", personId=" + personId + ", courses=" + courses + "]";
    }
}
