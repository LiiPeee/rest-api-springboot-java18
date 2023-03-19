package com.br.restapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.restapi.model.PersonEntity;
import com.br.restapi.services.PersonService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;


    @GetMapping(
    produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PersonEntity> findAll(){
        return personService.findAll();
    }


    @GetMapping(value="/{id}",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonEntity findById(@PathVariable(value = "id")String id) throws Exception{
        return personService.findById(id);
    }


    @PostMapping(
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonEntity createPerson(@RequestBody PersonEntity person){
        return personService.createPerson(person);
    }
    @PutMapping(
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonEntity updatePerson(@RequestBody PersonEntity person){
        return personService.updatPerson(person);
    }
    @DeleteMapping(value = "{id}",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public void deletePerson(@PathVariable (value ="id")String id) throws Exception{
        personService.deletePerson(id);
    }
     



    
}
