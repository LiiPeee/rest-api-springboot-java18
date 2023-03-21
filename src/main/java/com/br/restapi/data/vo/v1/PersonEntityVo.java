package com.br.restapi.data.vo.v1;

import jakarta.persistence.*;

import java.io.Serializable;


public class PersonEntityVo implements Serializable{




    private Long id;


    private String firstName;

    private String lastName;

    private String addres;

    private String gender;


    public PersonEntityVo() {
    }

    public PersonEntityVo(Long id, String firstName, String lastName, String addres, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addres = addres;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getAddres() {
        return addres;
    }


    public void setAddres(String addres) {
        this.addres = addres;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    
    
}
