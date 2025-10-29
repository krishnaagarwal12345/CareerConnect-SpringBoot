package com.krishna.careerconnect.controller;

import com.krishna.careerconnect.entity.Job;
import com.krishna.careerconnect.entity.User;
import com.krishna.careerconnect.service.ApplicationService;
import com.krishna.careerconnect.service.JobService;
import com.krishna.careerconnect.repository.UserRepository;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import com.krishna.careerconnect.security.CustomUserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;
    private final UserRepository userRepository;
    private final ApplicationService applicationService;

    public JobController(JobService jobService, UserRepository userRepository, ApplicationService applicationService) {
        this.jobService = jobService;
        this.userRepository = userRepository;
        this.applicationService = applicationService;
    }

    // ✅ List all jobs or search by keyword
    @GetMapping
    public String listJobs(@RequestParam(required = false) String q, Model model) {
        List<Job> jobs = (q == null || q.isBlank())
                ? jobService.allJobs()
                : jobService.searchJobs(q.trim());

        model.addAttribute("jobs", jobs);
        model.addAttribute("query", q); // so you can show the search text in input box
        return "jobs";
    }

    // ✅ Job creation form
    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("job", new Job());
        return "job_form";
    }

    // ✅ Create a new job posting
    @PostMapping("/create")
    public String createJob(@ModelAttribute Job job, @AuthenticationPrincipal CustomUserDetails userDetails) {
        User recruiter = userRepository.findByEmail(userDetails.getUsername()).orElse(null);
        jobService.createJob(job, recruiter);
        return "redirect:/jobs";
    }

    // ✅ View job details
    @GetMapping("/view/{id}")
    public String viewJob(@PathVariable Long id, Model model) {
        Job job = jobService.getJob(id);
        model.addAttribute("job", job);
        return "job_view";
    }

    // ✅ Apply to a job
    @GetMapping("/apply/{id}")
    public String apply(@PathVariable Long id, @AuthenticationPrincipal CustomUserDetails userDetails) {
        Job job = jobService.getJob(id);
        User seeker = userRepository.findByEmail(userDetails.getUsername()).orElse(null);
        applicationService.apply(job, seeker);
        return "redirect:/jobs";
    }
   
}
