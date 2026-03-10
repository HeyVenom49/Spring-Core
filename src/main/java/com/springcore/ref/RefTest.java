package com.springcore.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");

        A temp = (A) context.getBean("aref");

        System.out.println(temp);
        System.out.println("Value of A: " + temp.getX());
        System.out.println("Value of B: " + temp.getObj().getY());

        context.close();
    }
}
