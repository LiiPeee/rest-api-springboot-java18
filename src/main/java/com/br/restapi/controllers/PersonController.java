package com.br.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.br.restapi.services.PersonService;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;
    
}
