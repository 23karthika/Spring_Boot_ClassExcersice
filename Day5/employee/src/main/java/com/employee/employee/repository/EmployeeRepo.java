package com.employee.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.employee.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

    
} 