package com.course.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.course.model.Course;

public interface CourseRepo extends JpaRepository<Course,Integer>{

    Course findByName(String courseName);

    
} 