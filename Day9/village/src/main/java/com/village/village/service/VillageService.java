package com.village.village.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.village.village.model.Village;
import com.village.village.repository.VillageRepo;

@Service
public class VillageService {
    @Autowired
    private VillageRepo villageRepo;

    public Village addVillage(Village village) {
        return villageRepo.save(village);
    }

    public Village getVillageByName(String villageName) {
        return villageRepo.findByVillageName(villageName);
    }

    public Village getVillageByPopulation(int villagePopulation) {
        return villageRepo.findByVillagePopulation(villagePopulation);
    }

    public Village getVillageById(int villageId) {
        return villageRepo.findById(villageId).orElse(null);
    }
}
