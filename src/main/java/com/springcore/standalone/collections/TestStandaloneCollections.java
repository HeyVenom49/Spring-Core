package com.springcore.standalone.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandaloneCollections {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/standalone/collections/standalonecollectioncollectionconfig.xml");

        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);
        System.out.println(person1.getDogsName().getClass().getName());
        System.out.println(person1.getBreed().getClass().getName());
        context.close();
    }
}
