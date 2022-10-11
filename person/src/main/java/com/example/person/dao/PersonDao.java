package com.example.person.dao;

import java.util.List;

import com.example.person.model.Person;
public interface PersonDao {

    public List findAll();

    public Person findById(int theId);

    public void save(Person thePerson);

    public void deleteById(int theId);

}