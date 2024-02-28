package com.person.person.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.person.model.Person;
import com.person.person.service.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
        Person createdPerson = personService.addPerson(person);
        if (createdPerson != null) {
            return new ResponseEntity<>(createdPerson, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/byage/{age}")
    public ResponseEntity<List<Person>> getPersonByAge(@PathVariable int age) {
        List<Person> persons = personService.getPersonByAge(age);
        if (!persons.isEmpty()) {
            return new ResponseEntity<>(persons, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}