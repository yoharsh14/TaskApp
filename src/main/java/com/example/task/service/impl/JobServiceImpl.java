package com.example.task.service.impl;

import com.example.task.entity.JobDetails;
import com.example.task.repository.JobDetailsRepo;
import com.example.task.service.JobService;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {
    private final JobDetailsRepo jobDetailsRepo;

    public JobServiceImpl(JobDetailsRepo jobDetailsRepo) {
        this.jobDetailsRepo = jobDetailsRepo;
    }

    @Override
    public boolean saveJobDetails(JobDetails jobDetails) {
        try {
            jobDetailsRepo.save(jobDetails);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
