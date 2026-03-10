package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SoftDrink implements InitializingBean, DisposableBean {
    private String name;
    private double price;

    public SoftDrink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SoftDrink [name=" + name + ", price=" + price + "]";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing SoftDrink bean...");

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("SoftDrink name cannot be empty");
        }

        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }

        System.out.println("SoftDrink ready: " + name + " costs ₹" + price);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying SoftDrink bean...");
        System.out.println("Releasing resources for: " + name);
    }

}
