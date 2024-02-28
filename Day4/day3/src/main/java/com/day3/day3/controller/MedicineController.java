package com.day3.day3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day3.day3.model.MedicineDetails;
import com.day3.day3.repository.MedicineRepository;
import com.day3.day3.services.MedicineService;

@RestController
public class MedicineController {
    private MedicineService medicineService;

    

    @Autowired
    public MedicineController(MedicineService medicineService)
    {
        this.medicineService=medicineService;
    }

    @PostMapping("/medicine")
    public MedicineDetails medicineDetails(@RequestBody MedicineDetails medicineDetails)
    {
        return medicineService.saveDetails(medicineDetails);
    }

    @GetMapping("/medicines")
    public List<MedicineDetails>getAllDetails(){
       return medicineService.listofMedicine();
    }
    
    @GetMapping("/api/medicine/{medicineId}")
    public MedicineDetails getMedicineById(@PathVariable int medicineId)
    {
        return medicineService.addMedicine(medicineId);
    }

}
