package com.day8.classexcersice1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import com.day8.classexcersice1.model.Person;

public interface PersonRepo extends JpaRepository<Person,Long> {
    @Query(value = "select p from Person p where p.name LIKE ?1%")
    List<Person>findByStartingWithName(String name);
    @Query(value = "select p from Person p where p.name LIke %?1")
    List<Person>findByEndingWithName(String name);
}
