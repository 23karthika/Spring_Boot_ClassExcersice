package com.village.village.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Village {
    @Id
    private int villageId;
    private String villageName;
    private int numOfMen;
    private int numOfWomen;
    private int villagePopulation;
    private int numOfSchools;

}
