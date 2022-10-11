package com.example.person.services.impl;
import java.util.List;

import com.example.person.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.person.model.Person;
import com.example.person.dao.PersonDao;

@Service
public class PersonServicesImpl implements PersonServices {

    private PersonDao personDao;

    @Autowired
    public PersonServicesImpl(PersonDao thePersonDao) {
        personDao = thePersonDao;
    }

    @Override
    @Transactional
    public List<Person> findAll() {
        return personDao.findAll();
    }

    @Override
    @Transactional
    public Person findById(int theId) {
        return personDao.findById(theId);
    }

    @Override
    @Transactional
    public void save(Person thePerson) {
        personDao.save(thePerson);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        personDao.deleteById(theId);
    }
}