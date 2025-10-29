package com.krishna.careerconnect.service;

import com.krishna.careerconnect.entity.Job;
import com.krishna.careerconnect.entity.User;
import com.krishna.careerconnect.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    // Fetch all jobs
    public List<Job> allJobs() {
        return jobRepository.findAll();
    }

    // 🔍 Search jobs by keyword (title, company, location, skills, description)
    public List<Job> searchJobs(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return jobRepository.findAll();
        } else {
            return jobRepository.searchJobs(keyword.trim());
        }
    }

    // Get a single job by ID
    public Job getJob(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    // 🧑‍💼 Get jobs posted by a specific recruiter
    public List<Job> getJobsByRecruiter(User recruiter) {
        return jobRepository.findByRecruiter(recruiter);
    }

    // Create a new job posting
    public void createJob(Job job, User recruiter) {
        job.setRecruiter(recruiter);
        job.setPostedOn(LocalDate.now());
        jobRepository.save(job);
    }
}
