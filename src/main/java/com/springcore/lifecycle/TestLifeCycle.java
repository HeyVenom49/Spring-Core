package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/lifecycle/lifecycleconfig.xml");

        Paneer food = (Paneer) context.getBean("food");
        context.registerShutdownHook();

        System.out.println(food);

        System.out.println("------------------------------++++---------------------------------");

        SoftDrink drink = (SoftDrink) context.getBean("drink");

        System.out.println(drink);

        System.out.println("------------------------------++++---------------------------------");

        Coffee coffee = (Coffee) context.getBean("coffee");

        System.out.println(coffee);

        context.close();
    }
}
