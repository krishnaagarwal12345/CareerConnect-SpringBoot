package com.krishna.careerconnect.service;

import com.krishna.careerconnect.entity.Application;
import com.krishna.careerconnect.entity.Job;
import com.krishna.careerconnect.entity.User;
import com.krishna.careerconnect.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ApplicationService {
    private final ApplicationRepository applicationRepository;

    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Application apply(Job job, User seeker) {
        Application app = new Application();
        app.setJob(job);
        app.setSeeker(seeker);
        app.setStatus("APPLIED");
        app.setAppliedOn(LocalDate.now());
        return applicationRepository.save(app);
    }

    public List<Application> applicationsBySeeker(User seeker) {
        return applicationRepository.findBySeeker(seeker);
    }
    public List<Application> getApplicationsBySeeker(User user) {
        return applicationRepository.findBySeeker(user);
    }
}
