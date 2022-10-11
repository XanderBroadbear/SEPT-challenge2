package com.example.person.controller;
import com.example.person.model.Person;
import com.example.person.services.PersonServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private PersonServices personServices;
    @Autowired
    public PersonController(PersonServices thePersonServices) {
        personServices = thePersonServices;
    }

    @GetMapping("/persons")
    public List<Person> findAll() {
        return personServices.findAll();
    }

    @GetMapping("/persons/{personId}")
    public Person getPerson(@PathVariable int personId) {

        Person thePerson = personServices.findById(personId);

        if (thePerson == null) {
            throw new RuntimeException("person id not found - " + personId);
        }

        return thePerson;
    }

    @PostMapping("/persons")
    public Person addPerson(@RequestBody Person thePerson) {

        thePerson.setId(0);

        personServices.save(thePerson);

        return thePerson;
    }

    @PutMapping("/persons")
    public Person updatePerson(@RequestBody Person thePerson) {

        personServices.save(thePerson);

        return thePerson;
    }

    @DeleteMapping("/persons/{personId}")
    public String deletePerson(@PathVariable int personId) {

        Person tempPerson = personServices.findById(personId);

        // throw exception if null

        if (tempPerson == null) {
            throw new RuntimeException("person id not found - " + personId);
        }

        personServices.deleteById(personId);

        return "Deleted person id - " + personId;
    }


}
