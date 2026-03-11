package com.springcore.stereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereotype {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/stereotype/stereotypeconfig.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
        System.out.println(student.getCourses());
        System.out.println(student.getCourses().getClass().getName());
        context.close();
    }
}
