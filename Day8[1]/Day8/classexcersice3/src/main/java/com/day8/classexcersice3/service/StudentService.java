package com.day8.classexcersice3.service;

import com.day8.classexcersice3.model.*;
import java.util.List;
import com.day8.classexcersice3.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
    @Autowired
    private final StudentRepo sr;

    public StudentService(StudentRepo sr) {
        this.sr = sr;
    }
    public Student create(Student s){
        return sr.save(s);
    }
    public List<Student>findByMarksGreaterThan(int marks){
        return sr.findByMarksGreaterThan(marks);
    }
    public List<Student>findByMarksLessThan(int marks){
        return sr.findByMarksLessThan(marks);
    }

}