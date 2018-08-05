package com.mongopoc.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import com.mongopoc.commons.Constants;

import lombok.Data;

@Data
public class EmployeeReq {

	@NotNull(message=Constants.CANNOT_BE_NULL)
	private String firstName;
  
    private String lastName;
    
    private String city;
    
    @Email(message=Constants.INVALID_INPUT)
    @NotNull(message=Constants.CANNOT_BE_NULL)
    private String emailId;
}
