package com.example.person.services;

import java.util.List;

import com.example.person.model.Person;
public interface PersonServices {

    public List<Person> findAll();

    public Person findById(int theId);

    public void save(Person thePerson);

    public void deleteById(int theId);
}