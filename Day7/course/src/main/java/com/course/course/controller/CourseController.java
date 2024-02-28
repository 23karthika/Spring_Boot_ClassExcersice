package com.course.course.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.course.course.model.Course;
import com.course.course.service.CourseService;

@RestController
public class CourseController {
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/api/course")
    public ResponseEntity<Course> postDetails(@RequestBody Course course)
    {
        Course a=courseService.create(course);
        if(a!=null)
        {
            return new ResponseEntity<>(a,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(a,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/course")
    public ResponseEntity<List<Course>> getDetails()
    {
        List<Course> b=courseService.listofDetails();
        if(b!=null)
        {
            return new ResponseEntity<>(b,HttpStatus.OK);
        }
        return new ResponseEntity<>(b,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/course/courseName")
    public ResponseEntity<Course> Details(@PathVariable String courseName,@RequestBody Course course)
    {
        Course c=courseService.getName(courseName);
        if(c!=null)
        {
            return new ResponseEntity<>(c,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(c,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
