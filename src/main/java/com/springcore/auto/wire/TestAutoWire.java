package com.springcore.auto.wire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/auto/wire/autoconfig.xml");
        Emp emp1 = context.getBean("emp1", Emp.class);
        System.out.println(emp1);
        context.close();
    }
}
