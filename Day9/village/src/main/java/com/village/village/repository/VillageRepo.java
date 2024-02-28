package com.village.village.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.village.village.model.Village;

@Repository
public interface VillageRepo extends JpaRepository<Village,Integer> {

    Village findByVillageName(String villageName);

    Village findByVillagePopulation(int villagePopulation);

    
}