package com.person.person.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.person.person.model.Person;
import com.person.person.service.PersonService;

import jakarta.annotation.PostConstruct;

@RestController
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/api/person")
    public ResponseEntity<Person> postDetails(@RequestBody Person person)
    {
        Person a=personService.create(person);
        if(a!=null)
        {
            return new ResponseEntity<>(a,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(a,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/person")
    public ResponseEntity<List<Person>> getDetails()
    {
        List<Person> b=personService.listofDetails();
        if(b!=null)
        {
            return new ResponseEntity<>(b,HttpStatus.OK);
        }
        return new ResponseEntity<>(b,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/person/byAge")
    public ResponseEntity<Person> Details(@PathVariable int age,@RequestBody Person person)
    {
        Person c=personService.getAge(age);
        if(c!=null)
        {
            return new ResponseEntity<>(c,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(c,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
