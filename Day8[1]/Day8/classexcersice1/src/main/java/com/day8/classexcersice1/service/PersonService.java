package com.day8.classexcersice1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.day8.classexcersice1.model.Person;
import com.day8.classexcersice1.repository.PersonRepo;

@Service
public class PersonService {
    private PersonRepo personRepo;
    public PersonService(PersonRepo personRepo){
        this.personRepo=personRepo;
    }
    public Person postPerson(Person person){
        return personRepo.save(person);
    }
    public List<Person> getPersonList(String value){
        return personRepo.findByStartingWithName(value);
    }
    public List<Person> getList(String value){
        return personRepo.findByEndingWithName(value);
    }
}
