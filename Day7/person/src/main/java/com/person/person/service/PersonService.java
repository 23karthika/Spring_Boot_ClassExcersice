package com.person.person.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.person.person.model.Person;
import com.person.person.repository.PersonRepo;

@Service
public class PersonService {
    private PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public Person create(Person person)
    {
        return personRepo.save(person);
    }
    public List<Person> listofDetails()
    {
        return personRepo.findAll();
    }
    public Person getAge(int age)
    {
        return personRepo.findByAge(age);
    }
}
