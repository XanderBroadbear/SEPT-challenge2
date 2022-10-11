package com.example.persona.services;

import java.util.List;

import com.example.persona.model.Person;
public interface PersonServices {

    public List<Person> findAll();

    public Person findById(int theId);

    public void save(Person thePerson);

    public void deleteById(int theId);
}