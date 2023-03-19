package com.br.restapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.br.restapi.model.PersonEntity;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public PersonEntity createPerson(PersonEntity person){
        logger.info("Create person");
    
        return person;
    }

    public PersonEntity updatPerson(PersonEntity person){
        logger.info("Create person");

        person.setFirstName("Felipe");
        person.setLastName("Jão");
        person.setGender("Masculino");
        person.setAddres("BH é nois");
        return person;
    }
    public void deletePerson(String id){

        logger.info("Delete person"); 
    }

    public List<PersonEntity> findAll(){
        logger.info("Find All");
        
        
        List<PersonEntity> persons = new ArrayList<>();
        for(int i = 0; i < 8; i++){
            PersonEntity person = mockPerson(i);
            persons.add(person);
        }
        return persons;

    }
    

    public PersonEntity findById(String id){

        logger.info("Findding id");

        PersonEntity person = new PersonEntity();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Felipe");
        person.setLastName("Cruz");
        person.setAddres("Belo Horizonte");
        person.setGender("Masculino");

        return person;
    }
    private PersonEntity mockPerson(int i){
        PersonEntity person = new PersonEntity();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name " + i);
        person.setLastName("Last name" + i);
        person.setAddres("Some Address in Brasil" + i);
        person.setGender("Male");
        return person;
    }
}
