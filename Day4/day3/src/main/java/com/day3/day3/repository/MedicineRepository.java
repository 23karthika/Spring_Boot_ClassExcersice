package com.day3.day3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.day3.day3.model.MedicineDetails;

@Repository
public interface MedicineRepository extends JpaRepository<MedicineDetails,Integer>{
}
