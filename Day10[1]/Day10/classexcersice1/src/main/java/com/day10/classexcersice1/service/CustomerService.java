package com.day10.classexcersice1.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.day10.classexcersice1.repository.*;
import com.day10.classexcersice1.model.*;
@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public Customer createCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public List<Customer> getCustomersByCity(String city) {
        return customerRepo.findByCity(city);
    }

    public List<Customer> getAllCustomers() {
        return (List<Customer>) customerRepo.findAll();
    }

    public Customer getCustomerById(int customerId) {
        Optional<Customer> optionalCustomer = customerRepo.findById(customerId);
        return optionalCustomer.orElse(null);
    }

    public Customer updateCustomerPincode(Customer customer) {
        
            return customerRepo.save(customer);
      
    }

    public String deleteCustomer(int customerId) {
        if (customerRepo.existsById(customerId)) {
            customerRepo.deleteById(customerId);
            return "Customer deleted successfully.";
        }
        return "Customer not found.";
    }
}