package com.krishna.careerconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.krishna.careerconnect.entity.User;
import com.krishna.careerconnect.repository.UserRepository;

import java.security.Principal;

@ControllerAdvice
public class GlobalController {

    @Autowired
    private UserRepository userRepository;

    @ModelAttribute("loggedInUser")
    public User addLoggedInUserToModel(Principal principal) {
        if (principal != null) {
            // principal.getName() returns the email (from Spring Security)
            return userRepository.findByEmail(principal.getName()).orElse(null);
        }
        return null;
    }
}
