package com.krishna.careerconnect.repository;

import com.krishna.careerconnect.entity.Job;
import com.krishna.careerconnect.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {

    // Find jobs by recruiter
    List<Job> findByRecruiter(User recruiter);

    // Find jobs by keyword (title, company, location, or skills)
    List<Job> findByTitleContainingIgnoreCaseOrCompanyContainingIgnoreCaseOrLocationContainingIgnoreCaseOrSkillsContainingIgnoreCase(
            String title, String company, String location, String skills);

    // Optional: For more flexible searching using custom JPQL
    @Query("SELECT j FROM Job j WHERE " +
           "LOWER(j.title) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(j.company) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(j.location) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(j.skills) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(j.description) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Job> searchJobs(String keyword);
}
