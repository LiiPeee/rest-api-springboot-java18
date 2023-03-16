package com.br.restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExceptionOperation extends RuntimeException{

    public ExceptionOperation(String ex){
        super(ex);
    }

    public static final long serialVersionUID = 1L;
    
}
