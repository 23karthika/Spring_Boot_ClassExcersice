package com.patient.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.patient.patient.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Integer>{

    
} 