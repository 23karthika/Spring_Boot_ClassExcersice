package com.jobdetails.jobdetails.controller;

import java.util.List;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jobdetails.jobdetails.model.JobDetails;
import com.jobdetails.jobdetails.service.JobDetailsService;

@RestController
public class JobDetailsController {
    private final JobDetailsService jobDetailsService;

   
    public JobDetailsController(JobDetailsService jobDetailsService) {
        this.jobDetailsService = jobDetailsService;
    }

    @PostMapping("/api/job")
    public ResponseEntity<JobDetails>createJob(@RequestBody JobDetails jobDetails){
        JobDetails createdJob=jobDetailsService.createJob(jobDetails);
        if(createdJob!=null)
        {
            return new ResponseEntity<>(createdJob,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(createdJob,HttpStatus.NOT_FOUND);
    }

    @GetMapping("/api/job")
    public ResponseEntity<List<JobDetails>>getAllJob(){
        List<JobDetails> getJob=jobDetailsService.listofJob();
        if(getJob!=null)
        {
            return new ResponseEntity<>(getJob,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(getJob,HttpStatus.NOT_FOUND);
    }

    @GetMapping("/api/job/{jobId}")
    public ResponseEntity<JobDetails>getJobById(@PathVariable int jobId){
        JobDetails getJobId=jobDetailsService.getId(jobId);
        if(getJobId!=null)
        {
            return new ResponseEntity<>(getJobId,HttpStatus.CREATED);
        }
        return new ResponseEntity<>(getJobId,HttpStatus.NOT_FOUND);
    }

    
}
