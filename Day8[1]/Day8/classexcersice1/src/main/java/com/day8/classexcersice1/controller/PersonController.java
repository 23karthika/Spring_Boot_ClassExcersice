package com.day8.classexcersice1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.day8.classexcersice1.model.Person;
import com.day8.classexcersice1.service.PersonService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class PersonController{
    private PersonService personService;
    public PersonController(PersonService personService){
        this.personService=personService;
    }
    @PostMapping("/person")
    public ResponseEntity<Person> postPersonDetail(@RequestBody Person person) {
        Person person1=personService.postPerson(person);
        if(person1!=null){
            return new ResponseEntity<>(person1,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(person1,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/person/startsWithName/{value}")
    public ResponseEntity<List<Person>> getListOfPersons(@PathVariable("value") String value) {
        List<Person> list=personService.getPersonList(value);
        if(list!=null){
            return new ResponseEntity<>(list,HttpStatus.OK);
        }
        return new ResponseEntity<>(list,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/person/endsWithName/{value}")
    public ResponseEntity<List<Person>> getMethodName(@PathVariable("value") String value) {
        List<Person> list1=personService.getList(value);
        if(list1!=null){
            return new ResponseEntity<>(list1,HttpStatus.OK);
        }
        return new ResponseEntity<>(list1,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    
    
}