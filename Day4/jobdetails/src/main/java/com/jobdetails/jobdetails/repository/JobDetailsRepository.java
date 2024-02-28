package com.jobdetails.jobdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobdetails.jobdetails.model.JobDetails;

public interface JobDetailsRepository extends JpaRepository<JobDetails,Integer> {

    
}