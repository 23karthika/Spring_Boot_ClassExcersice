package com.classex2.classex2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.classex2.classex2.model.Sdetailsmodel;

@RestController
public class DetailsController {
    @PostMapping("/post")
    public Sdetailsmodel postdetails(@RequestBody Sdetailsmodel student)
    {
        System.out.println(student.getName());
        System.out.println(student.getAge());
        return student;
    }
}
