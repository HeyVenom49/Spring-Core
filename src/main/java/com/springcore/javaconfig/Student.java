package com.springcore.javaconfig;

// import org.springframework.stereotype.Component;

// @Component("student")
public class Student {

    private Courses course;

    public Student() {
        super();
    }

    public Student(Courses course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [course=" + course + "]";
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }
}
