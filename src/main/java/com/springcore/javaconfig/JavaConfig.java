package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {

    @Bean
    public Courses getCourse() {
        Courses c1 = new Courses();
        c1.setCourse(List.of("Java", "C++", "Typescript"));
        return c1;
    }

    @Bean
    public Student getStudent() {
        // creating a new object
        Student student = new Student(getCourse());
        return student;
    }
}
