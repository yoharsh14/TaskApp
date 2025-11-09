package com.example.task.controller;

import com.example.task.entity.JobDetails;
import com.example.task.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JobController {
    private final JobService jobService;

    // Constructor injection
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addJob(@RequestBody JobDetails jobDetails) {
        boolean saved = jobService.saveJobDetails(jobDetails);
        if (saved) {
            return ResponseEntity.ok("✅ Job details saved successfully!");
        } else {
            return ResponseEntity.ok("❌ Failed to save job details.");
        }
    }

}
