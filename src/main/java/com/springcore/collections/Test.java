package com.springcore.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/collections/collectionconfig.xml");
        Emp emp1 = (Emp) context.getBean("emp1");
        System.out.println(emp1);
        System.out.println(emp1.getName());
        System.out.println(emp1.getAddresses());
        System.out.println(emp1.getCourses().getClass().getName());
        System.out.println(emp1.getPhoneNumber().getClass().getName());
        context.close();
    }
}
