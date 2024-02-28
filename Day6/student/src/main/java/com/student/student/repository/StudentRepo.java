package com.student.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.student.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

    
}