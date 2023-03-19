package com.br.restapi.model;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "person")
public class PersonEntity implements Serializable{



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 80)
    private String firstName;
    @Column(name = "last_name",nullable = false,length = 80)
    private String lastName;
    @Column(nullable = false, length = 100)
    private String addres;
    @Column(nullable = false, length = 10)
    private String gender;

    
    public PersonEntity() {
    }

    public PersonEntity(Long id, String firstName, String lastName, String addres, String gender) {
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
