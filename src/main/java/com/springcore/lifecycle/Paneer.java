package com.springcore.lifecycle;

public class Paneer {
    private String name;

    public Paneer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Paneer [name=" + name + "]";
    }

    public void init()
    {
        System.out.println("Food has been start to prepare");
    }

    public void destroy()
    {
        System.out.println("Hope you like the food bye bye");
    }
}
