package com.employee.employee.service;

import org.springframework.stereotype.Service;

import com.employee.employee.model.Employee;
import com.employee.employee.repository.EmployeeRepo;

@Service
public class EmployeeService {
    private EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee post(Employee employee)
    {
        return employeeRepo.save(employee);
    }

    public Employee put(Employee employee)
    {
        return employeeRepo.save(employee);
    }

    public void delete(int employeeId)
    {
         employeeRepo.deleteById(employeeId);
    }
}
