package com.br.restapi.exceptionHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundRequest extends RuntimeException{

    public static final long serialVersionUID = 1L;

    public NotFoundRequest(String ex){
        super(ex);
    }

}
