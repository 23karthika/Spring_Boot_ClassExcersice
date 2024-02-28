package com.student.student.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.student.student.model.Student;
import com.student.student.repository.StudentRepo;

@Service
public class StudentService {
    private StudentRepo studentRepo;
    public StudentService(StudentRepo studentRepo){
        this.studentRepo = studentRepo;
    }

    public Student postStudentDetails(Student student){
        if(student!=null){
            return studentRepo.save(student);
        }
        else{
            throw new IllegalArgumentException("student object cannot be null");
        }
    }

    public List<Student> studentPagination(int pageNo, int pagesize){
       Page<Student> page = studentRepo.findAll(PageRequest.of(pageNo, pagesize));
        return page.getContent();
    }
   
    public List<Student> studentSortedPage(int pageNo, int pagesize, String sortBy){
        PageRequest page = PageRequest.of(pageNo, pagesize, Sort.by(sortBy));
        Page<Student> pageStudent = studentRepo.findAll(page);
        return pageStudent.getContent();
     }
}
