package com.classex2.classex2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sdetailsmodel {

    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    public Sdetailsmodel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

}
