package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {
    private List<String> dogsName;
    private Map<String, String> breed;

    public List<String> getDogsName() {
        return dogsName;
    }

    public Map<String, String> getBreed() {
        return breed;
    }

    public void setDogsName(List<String> dogsName) {
        this.dogsName = dogsName;
    }

    public void setBreed(Map<String, String> breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Person [dogsName=" + dogsName + ", breed=" + breed + "]";
    }

}
