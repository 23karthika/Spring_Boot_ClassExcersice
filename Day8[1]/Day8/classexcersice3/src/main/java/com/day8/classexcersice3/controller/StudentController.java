package com.day8.classexcersice3.controller;

import com.day8.classexcersice3.model.*;
import com.day8.classexcersice3.service.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private final StudentService sr;

    public StudentController(StudentService sr) {
        this.sr = sr;
    }

    @PostMapping("/student")
    public ResponseEntity<Student> create(@RequestBody Student s) {
        Student c = sr.create(s);
        return new ResponseEntity<>(c, HttpStatus.CREATED);
    }

    @GetMapping("/student/marksGreaterThan/{mark}")
    public ResponseEntity<List<Student>> findByMarksGreaterThan(@PathVariable int mark) {
        List<Student> s = sr.findByMarksGreaterThan(mark);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    @GetMapping("/student/marksLessThan/{mark}")
    public ResponseEntity<List<Student>> findByMarksLessThan(@PathVariable int mark) {
        List<Student> s = sr.findByMarksLessThan(mark);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
}