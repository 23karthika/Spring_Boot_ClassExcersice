package com.village.village.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.village.village.model.Village;
import com.village.village.service.VillageService;

@RestController
@RequestMapping("/api/village")
public class VillageController {
    @Autowired
    private VillageService villageService;

    @PostMapping
    public ResponseEntity<Village> addVillage(@RequestBody Village village) {
        Village createdVillage = villageService.addVillage(village);
        if (createdVillage != null) {
            return new ResponseEntity<>(createdVillage, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/byname/{villageName}")
    public ResponseEntity<Village> getVillageByName(@PathVariable String villageName) {
        Village village = villageService.getVillageByName(villageName);
        if (village != null) {
            return new ResponseEntity<>(village, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/bypopulation/{villagePopulation}")
    public ResponseEntity<Village> getVillageByPopulation(@PathVariable int villagePopulation) {
        Village village = villageService.getVillageByPopulation(villagePopulation);
        if (village != null) {
            return new ResponseEntity<>(village, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{villageId}")
    public ResponseEntity<Village> getVillageById(@PathVariable int villageId) {
        Village village = villageService.getVillageById(villageId);
        if (village != null) {
            return new ResponseEntity<>(village, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}