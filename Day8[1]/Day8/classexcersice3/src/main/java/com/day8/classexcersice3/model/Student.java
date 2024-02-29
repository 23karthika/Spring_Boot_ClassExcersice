package com.day8.classexcersice3.model;


import jakarta.persistence.*;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String name;
    private int marks;
    public Student() {
    }
    public Student(long id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
}