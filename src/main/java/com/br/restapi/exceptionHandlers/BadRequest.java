package com.br.restapi.exceptionHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequest extends RuntimeException{

    public BadRequest(String ex){
        super(ex);
    }

    public static final long serialVersionUID = 1L;
    
}
