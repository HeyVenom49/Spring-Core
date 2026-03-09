package com.springcore.collections;

import java.util.Map;
import java.util.List;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phoneNumber;
    private Set<String> addresses;
    private Map<String, String> courses;
    public Emp() {
        super();
    }
    public Emp(String name, List<String> phoneNumber, Set<String> addresses, Map<String, String> courses) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.addresses = addresses;
        this.courses = courses;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Set<String> getAddresses() {
        return addresses;
    }
    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }
    public Map<String, String> getCourses() {
        return courses;
    }
    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }
    @Override
    public String toString() {
        return "Emp [name=" + name + ", phoneNumber=" + phoneNumber + ", addresses=" + addresses + ", courses="
                + courses + "]";
    }
}
