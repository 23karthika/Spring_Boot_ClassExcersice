package com.patient.patient.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.patient.patient.model.Patient;
import com.patient.patient.service.PatientService;


@RestController
public class PatientController {
    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    
    @PostMapping("/api/patient")
    public ResponseEntity<Patient>post(@RequestBody Patient patient)
    {
        Patient a=patientService.saveDetails(patient);
        if(a!=null)
        {
            return new ResponseEntity<>(a,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(a,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/api/patient")
    public ResponseEntity<List<Patient>>getDetails()
    {
        List<Patient>b=patientService.listofDetails();
        if(b!=null)
        {
            return new ResponseEntity<>(b,HttpStatus.OK);
        }
        return new ResponseEntity<>(b,HttpStatus.NOT_FOUND);
    }
    @GetMapping("/api/patient/{patientId}")
    public ResponseEntity<Patient>idDetails(@PathVariable int patientId)
    {
        Patient c=patientService.getId(patientId);
        if(c!=null)
        {
            return new ResponseEntity<>(c,HttpStatus.OK);
        }
        return new ResponseEntity<>(c,HttpStatus.NOT_FOUND);
    }
}
