package com.example.task.repository;

import com.example.task.entity.JobDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobDetailsRepo extends MongoRepository<JobDetails,String> {

}
