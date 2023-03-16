package com.br.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.restapi.model.Person;
import com.br.restapi.services.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;



    @GetMapping(value="/{id}",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById(@PathVariable(value = "id")String id) throws Exception{
        return personService.findById(id);
    }
    
     



    
}
