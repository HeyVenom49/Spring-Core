package com.springcore.constructorinjection;

import java.util.List;

public class Courses {
    private List<String> course;

    public Courses(List<String> course)
    {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Courses [course=" + course + "]";
    }
    
}
