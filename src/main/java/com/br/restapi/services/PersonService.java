package com.br.restapi.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Service;

import com.br.restapi.model.Person;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());


    public Person findById(String id){

        logger.info("Findding id");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Felipe");
        person.setLastName("Cruz");
        person.setAddres("Belo Horizonte");
        person.setGender("Masculo");



        return person;
    }
    
}
