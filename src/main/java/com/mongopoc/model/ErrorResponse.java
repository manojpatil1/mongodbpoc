package com.mongopoc.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class ErrorResponse implements Serializable {

    private static final long serialVersionUID = -6612735233257987330L;

    private String code;
    private String message;

}
