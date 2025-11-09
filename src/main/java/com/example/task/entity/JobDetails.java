package com.example.task.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "jobDetails")
public class JobDetails {
    @Id
    private String jobId;
    private String company;
    private String jobDescription;
    private String reachMail;
    private String applied;
    private String[] reachOut;
    // getters/setters...

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getReachMail() {
        return reachMail;
    }

    public void setReachMail(String reachMail) {
        this.reachMail = reachMail;
    }

    public String getApplied() {
        return applied;
    }

    public void setApplied(String applied) {
        this.applied = applied;
    }

    public String[] getReachOut() {
        return reachOut;
    }

    public void setReachOut(String[] reachOut) {
        this.reachOut = reachOut;
    }
}
