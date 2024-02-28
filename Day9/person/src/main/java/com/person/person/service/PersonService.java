package com.person.person.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.person.model.Person;
import com.person.person.repository.PersonRepo;

@Service
public class PersonService {

    @Autowired
    private PersonRepo personRepo;

    public Person addPerson(Person person) {
        return personRepo.save(person);
    }

    public List<Person> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
