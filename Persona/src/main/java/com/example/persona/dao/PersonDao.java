package com.example.persona.dao;

import java.util.List;

import com.example.persona.model.Person;
public interface PersonDao {

    public List findAll();

    public Person findById(int theId);

    public void save(Person thePerson);

    public void deleteById(int theId);

}