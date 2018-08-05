package com.mongopoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongopoc.model.EmployeeReq;
import com.mongopoc.repository.Employee;
import com.mongopoc.repository.EmployeeRepository;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepo;

    public List<Employee> searchEmployeeByFirstName(String firstName) throws Exception {
        
        return employeeRepo.findByFirstName(firstName);
    }

    public List<Employee> searchEmployeeByLastName(String lastName) throws Exception {
        
        return employeeRepo.findByLastName(lastName);
    }
    
    public void addEmployee(EmployeeReq request) throws Exception {
    	employeeRepo.save(new Employee(request.getFirstName(), request.getLastName(), request.getCity(), request.getEmailId()));
    }
}
