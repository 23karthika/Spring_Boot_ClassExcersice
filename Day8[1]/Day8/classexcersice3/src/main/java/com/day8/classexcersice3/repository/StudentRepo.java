package com.day8.classexcersice3.repository;


import java.util.List;
import com.day8.classexcersice3.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface StudentRepo extends JpaRepository<Student,Integer>{
    @Query("Select s from Student s where s.marks> :marks")
    List<Student>findByMarksGreaterThan(@Param("marks")int marks);
    @Query("Select s from Student s where s.marks< :marks")
    List<Student>findByMarksLessThan(@Param("marks")int marks);
}