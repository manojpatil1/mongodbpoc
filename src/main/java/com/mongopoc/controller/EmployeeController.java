package com.mongopoc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mongopoc.model.EmployeeReq;
import com.mongopoc.repository.Employee;
import com.mongopoc.service.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeSvc;

    @RequestMapping(method=RequestMethod.GET,value="byfirstname")
    @ResponseBody
    @ResponseStatus(code=HttpStatus.OK)
    public List<Employee> searchEmployeeByFirstName(@RequestParam String firstName) throws Exception {
        return employeeSvc.searchEmployeeByFirstName(firstName);
    }
    
    @RequestMapping(method=RequestMethod.GET,value="bylastname")
    @ResponseBody
    @ResponseStatus(code=HttpStatus.OK)
    public List<Employee> searchEmployeeByLastName(@RequestParam String lastName) throws Exception {
        return employeeSvc.searchEmployeeByLastName(lastName);
    }
    
  
    @RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE,value="add")
    @ResponseBody
    @ResponseStatus(code=HttpStatus.OK)
    public void addEmployee(@Valid @RequestBody EmployeeReq request) throws Exception {
        employeeSvc.addEmployee(request);
    }
    
    
}
