package com.classexcersice3.classexcersice3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class StudentApi1 {
     private long id;
     private String name;
     
     @JsonIgnore
     private String description;

    public StudentApi1(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
     
     

}
