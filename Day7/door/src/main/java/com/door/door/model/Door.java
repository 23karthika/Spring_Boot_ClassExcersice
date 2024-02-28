package com.door.door.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Door {
    @Id
    private int doorId;
    private String location;
    private String accessCode;
    private String accessType; 
}
