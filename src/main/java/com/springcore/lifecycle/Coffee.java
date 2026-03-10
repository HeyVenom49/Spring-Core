package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Coffee {
    private String name;
    private double price;

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coffee [name=" + name + ", price=" + price + "]";
    }

    @PostConstruct
    public void start() {
        System.out.println("Start preparing your coffee");
    }

    @PreDestroy
    public void end() {
        System.out.println("Hope you like our coffee bye bye");
    }
}
