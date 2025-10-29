package com.krishna.careerconnect.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the skills
	 */
	public String getSkills() {
		return skills;
	}

	/**
	 * @param skills the skills to set
	 */
	public void setSkills(String skills) {
		this.skills = skills;
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	/**
	 * @return the postedOn
	 */
	public LocalDate getPostedOn() {
		return postedOn;
	}

	/**
	 * @param postedOn the postedOn to set
	 */
	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}

	/**
	 * @return the recruiter
	 */
	public User getRecruiter() {
		return recruiter;
	}

	/**
	 * @param recruiter the recruiter to set
	 */
	public void setRecruiter(User recruiter) {
		this.recruiter = recruiter;
	}

	

	public Job(Long id, String title, String company, String location, String description, String skills, Double salary,
			 LocalDate postedOn, User recruiter) {
		super();
		this.id = id;
		this.title = title;
		this.company = company;
		this.location = location;
		this.description = description;
		this.skills = skills;
		this.salary = salary;
		
		this.postedOn = postedOn;
		this.recruiter = recruiter;
	}

	
	

	private String title;
    private String company;
    private String location;

    @Column(length = 2000)
    private String description;

    private String skills; // comma separated										
    private Double salary;
   
    private LocalDate postedOn;	

    @ManyToOne
    @JoinColumn(name = "recruiter_id")
    private User recruiter;
}
