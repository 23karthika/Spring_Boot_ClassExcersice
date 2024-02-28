package com.day3.day3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day3.day3.model.MedicineDetails;
import com.day3.day3.repository.MedicineRepository;

@Service
public class MedicineService {

    private MedicineRepository medicineRepository;

    @Autowired
    public MedicineService(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }



    public MedicineDetails saveDetails(MedicineDetails medicineDetails) {
       return medicineRepository.save(medicineDetails);
    }
    
    public List<MedicineDetails> listofMedicine()
    {
        return medicineRepository.findAll();
    }
    
    public MedicineDetails addMedicine(int medicineId)
    {
        return medicineRepository.findById(medicineId).orElse(null);
    }
}
