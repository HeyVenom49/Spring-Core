package com.springcore.javaconfig;

import java.util.List;

public class Courses {
    private List<String> course;

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Courses [course=" + course + "]";
    }

}
