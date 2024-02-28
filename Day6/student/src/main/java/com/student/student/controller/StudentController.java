package com.student.student.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.student.model.Student;
import com.student.student.service.StudentService;

@RestController
public class StudentController {
     private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/api/student")
    public ResponseEntity<Student> createChildren(@RequestBody Student student){
        Student s = studentService.postStudentDetails(student);
        if(s!=null){
            return new ResponseEntity<>(s,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(s,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/student/pages")
    public ResponseEntity<List<Student>> getPage(@RequestParam int pageNo, @RequestParam int pagesize){
        List<Student> ch = studentService.studentPagination(pageNo, pagesize);
        if(ch!=null){
            return new ResponseEntity<>(ch,HttpStatus.OK);
        }
        return new ResponseEntity<>(ch,HttpStatus.NOT_FOUND);
    }

    @GetMapping("/student/sortby")
    public ResponseEntity<List<Student>> getSortedPage(@RequestParam int pageNo, @RequestParam int pagesize,@RequestParam String sortby){
        List<Student> ch =studentService.studentSortedPage(pageNo, pagesize,sortby);
        if(ch!=null){
            return new ResponseEntity<>(ch,HttpStatus.OK);
        }
        return new ResponseEntity<>(ch,HttpStatus.NOT_FOUND);
    }

}
