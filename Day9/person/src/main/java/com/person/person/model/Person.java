package com.person.person.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Person {
    @Id
    private int personId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String email;

}