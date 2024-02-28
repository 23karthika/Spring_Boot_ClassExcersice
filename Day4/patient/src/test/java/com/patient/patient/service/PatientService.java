package com.patient.patient.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patient.patient.model.Patient;
import com.patient.patient.repository.PatientRepo;

@Service
public class PatientService {
   private PatientRepo patientRepository;

   public PatientService(PatientRepo patientRepo) {
    this.patientRepository = patientRepo;
   }
   
   public Patient saveDetails(Patient patient)
   {
       return patientRepository.save(patient);
   }

   public List<Patient> listofDetails()
   {
       return patientRepository.findAll();
   }

   public Patient getId(int patientId)
   { 
       return patientRepository.findById(patientId).orElse(null);
   }
}
