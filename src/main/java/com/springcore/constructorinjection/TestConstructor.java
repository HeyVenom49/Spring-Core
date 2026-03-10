package com.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorinjection/constructorconfig.xml");

        Person p1 = (Person) context.getBean("p1");

        System.out.println(p1);

        context.close();
    }
}
