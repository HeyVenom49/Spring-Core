package com.springcore.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TestJavaConfig {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Student student = context.getBean(Student.class);
        System.out.println(student);
        context.close();
    }
}
