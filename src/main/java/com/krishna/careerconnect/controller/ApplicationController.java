package com.krishna.careerconnect.controller;

import com.krishna.careerconnect.entity.Application;
import com.krishna.careerconnect.entity.User;
import com.krishna.careerconnect.repository.UserRepository;
import com.krishna.careerconnect.service.ApplicationService;
import com.krishna.careerconnect.security.CustomUserDetails;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ApplicationController {

    private final ApplicationService applicationService;
    private final UserRepository userRepository;

    public ApplicationController(ApplicationService applicationService, UserRepository userRepository) {
        this.applicationService = applicationService;
        this.userRepository = userRepository;
    }

    @GetMapping("/my-applications")
    public String myApplications(@AuthenticationPrincipal CustomUserDetails userDetails, Model model) {
        User seeker = userRepository.findByEmail(userDetails.getUsername()).orElse(null);
        List<Application> applications = applicationService.getApplicationsBySeeker(seeker);
        model.addAttribute("applications", applications);
        return "my_applications";
    }
}
