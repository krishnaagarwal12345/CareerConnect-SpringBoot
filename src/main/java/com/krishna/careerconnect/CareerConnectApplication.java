package com.krishna.careerconnect;

import com.krishna.careerconnect.entity.Job;
import com.krishna.careerconnect.repository.JobRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CareerConnectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CareerConnectApplication.class, args);
    }

   
}
