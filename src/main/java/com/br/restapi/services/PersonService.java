package com.br.restapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import com.br.restapi.data.vo.v1.PersonEntityVo;
import com.br.restapi.exceptionHandlers.CustumizedExceptionEntity;
import com.br.restapi.exceptionHandlers.NotFoundRequest;
import com.br.restapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public PersonEntityVo createPerson(PersonEntityVo person){
        logger.info("Create person");
    
        return personRepository.save(person);
    }


    public PersonEntityVo updatPerson(PersonEntityVo person){
        logger.info("Update person");

        PersonEntityVo person1 = personRepository.findById(person.getId()).orElseThrow(() -> new NotFoundRequest("person not found "));

        person1.setFirstName(person.getFirstName());
        person1.setLastName(person.getLastName());
        person1.setAddres(person.getAddres());

        person1.setGender(person.getGender());

        return personRepository.save(person1);
    }
    public PersonEntityVo findById(Long id){

        logger.info("Findding id");


        return personRepository.findById(id).orElseThrow(() -> new NotFoundRequest("id not found"));
    }
    public List<PersonEntityVo> findAll(){
        logger.info("Find All");

        return personRepository.findAll();

    }
    public void deletePerson(Long id){

        logger.info("Delete person");

        PersonEntityVo person = personRepository.findById(id).orElseThrow(() -> new NotFoundRequest("person not found for deletion"));

        personRepository.delete(person);
    }


    



}
