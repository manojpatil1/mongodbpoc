package com.mongopoc.repository;

import lombok.Data;

import org.springframework.data.annotation.Id;

@Data
public class Employee {

    @Id
    private String emailId;
    private String firstName;
    private String lastName;
    private String city;

    public Employee(String firstName, String lastName, String city, String emailId) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.emailId = emailId;
    }

}
