package com.jobdetails.jobdetails.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobdetails.jobdetails.controller.JobDetailsController;
import com.jobdetails.jobdetails.model.JobDetails;
import com.jobdetails.jobdetails.repository.JobDetailsRepository;

@Service
public class JobDetailsService {
    
    private JobDetailsRepository jobDetailsRepository;

    public JobDetailsService(JobDetailsRepository jobDetailsRepository) {
        this.jobDetailsRepository = jobDetailsRepository;
    }
    
    public JobDetails createJob(JobDetails jobDetails)
    {
        return jobDetailsRepository.save(jobDetails);
    }
    
    public List<JobDetails> listofJob()
    {
        return jobDetailsRepository.findAll();
    }

    public JobDetails getId(int jobId)
    {
        return jobDetailsRepository.findById(jobId).orElse(null);
    }
}
