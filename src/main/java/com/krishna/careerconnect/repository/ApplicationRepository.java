package com.krishna.careerconnect.repository;

import com.krishna.careerconnect.entity.Application;
import com.krishna.careerconnect.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    List<Application> findBySeeker(User seeker);

}
