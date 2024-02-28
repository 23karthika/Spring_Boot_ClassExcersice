package com.employee.employee.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employee.model.Employee;
import com.employee.employee.service.EmployeeService;

@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/api/employee")
    public ResponseEntity<Employee> postDetails(@RequestBody Employee employee)
    {
        Employee a=employeeService.post(employee);
        if(a!=null)
        {
            return new ResponseEntity<>(a,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(a,HttpStatus.NOT_FOUND);
    }

    @PutMapping("/api/employee/{employeeId}")
    public ResponseEntity<Employee> putDetails(@PathVariable int employeeId,@RequestBody Employee employee)
    {
        Employee b=employeeService.put(employee);
        if(b!=null)
        {
            return new ResponseEntity<>(b,HttpStatus.OK);
        }
        return new ResponseEntity<>(b,HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/api/employee/{employeeId}")
    public void deleteProduct(@PathVariable int employeeId)
    {
        employeeService.delete(employeeId);
    }
    
}
