package com.person.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.person.person.model.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Integer> {

    Person findByAge(int age);

}
