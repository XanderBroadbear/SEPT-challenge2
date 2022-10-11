package com.example.persona.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import com.example.persona.dao.PersonDao;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.persona.model.Person;
@Repository
public class PersonDaoImpl implements PersonDao {

    // define field for entitymanager
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public PersonDaoImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public List<Person> findAll() {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // create a query
        Query theQuery =
                currentSession.createQuery("from Person", Person.class);

        // execute query and get result list
        List persons = theQuery.getResultList();

        // return the results
        return persons;
    }


    @Override
    public Person findById(int theId) {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // get the employee
        Person thePerson =
                currentSession.get(Person.class, theId);

        // return the employee
        return thePerson;
    }


    @Override
    public void save(Person thePerson) {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // save employee
        currentSession.saveOrUpdate(thePerson);
    }


    @Override
    public void deleteById(int theId) {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // delete object with primary key
        Query theQuery =
                currentSession.createQuery(
                        "delete from Person where id=:personId");
        theQuery.setParameter("personId", theId);

        theQuery.executeUpdate();
    }
}