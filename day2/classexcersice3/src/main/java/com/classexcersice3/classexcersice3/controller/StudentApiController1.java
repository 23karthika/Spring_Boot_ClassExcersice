package com.classexcersice3.classexcersice3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classexcersice3.classexcersice3.model.StudentApi1;


@RestController
public class StudentApiController1 {
    @GetMapping("/studentdetails")
    public StudentApi1 getdetails()
    {
        StudentApi1 s=new StudentApi1(1, "John Doe", "This is a student Description");
        return s;
    }
}
