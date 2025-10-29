package com.krishna.careerconnect.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
     
    /**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the job
	 */
	public Job getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(Job job) {
		this.job = job;
	}
	/**
	 * @return the seeker
	 */
	public User getSeeker() {
		return seeker;
	}
	/**
	 * @param seeker the seeker to set
	 */
	public void setSeeker(User seeker) {
		this.seeker = seeker;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the appliedOn
	 */
	public LocalDate getAppliedOn() {
		return appliedOn;
	}
	/**
	 * @param appliedOn the appliedOn to set
	 */
	public void setAppliedOn(LocalDate appliedOn) {
		this.appliedOn = appliedOn;
	}
	public Application(Long id, Job job, User seeker, String status, LocalDate appliedOn) {
		super();
		this.id = id;
		this.job = job;
		this.seeker = seeker;
		this.status = status;
		this.appliedOn = appliedOn;
	}
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	@ManyToOne
    @JoinColumn(name = "seeker_id")
    private User seeker;

    private String status; // APPLIED, ACCEPTED, REJECTED
    private LocalDate appliedOn;
}
