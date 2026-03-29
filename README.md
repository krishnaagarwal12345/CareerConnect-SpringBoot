# 💼 Job Connector – Job Portal Application

CareerConnect is a Spring Boot–based web application designed to connect job seekers and recruiters seamlessly.
It allows users to register, log in, browse available jobs, apply to positions, and manage applications efficiently.
Recruiters can post new job listings and view applicants — all in one intuitive platform.

## 🚀 Features
### 👨‍💼 For Job Seekers

Register and log in securely

Browse all available job listings

Apply for jobs directly

View your applications on the My Applications page

### 🏢 For Recruiters

Post new job openings

Manage and view all posted jobs

See applications received for each job

## 🧠 Tech Stack
Layer	Technologies Used
Backend	Spring Boot 3, Spring Security 6, Spring Data JPA
Frontend	Thymeleaf, HTML5, CSS3, Bootstrap
Database	MySQL
Build Tool	Maven
Version Control	Git & GitHub
## 🗂️ Project Structure
CareerConnect/
│
├── src/
│   ├── main/
│   │   ├── java/com/krishna/careerconnect/
│   │   │   ├── controller/        # AuthController, JobController, ApplicationController
│   │   │   ├── entity/            # Job, User, Application entities
│   │   │   ├── repository/        # JPA Repositories
│   │   │   ├── service/           # Business logic layer
│   │   │   └── CareerConnectApplication.java
│   │   └── resources/
│   │       ├── static/            # CSS, JS, Images
│   │       ├── templates/         # Thymeleaf HTML files
│   │       └── application.properties
│   └── test/
│
├── pom.xml
└── README.md

## ⚙️ Setup & Installation

Follow these steps to run the project locally 👇

### 🪜 Step 1: Clone the Repository
git clone https://github.com/krishnaagarwal12345/CareerConnect-SpringBoot.git
cd CareerConnect-SpringBoot

### 🪜 Step 2: Configure the Database

Open the file:
📄 src/main/resources/application.properties

And update your MySQL credentials (if required):

spring.datasource.url=jdbc:mysql://localhost:3306/careerconnect
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


✅ Make sure your MySQL server is running and a database named careerconnect is created.

### 🪜 Step 3: Build and Run the Application

Using Maven or your IDE (Eclipse / IntelliJ):

mvn spring-boot:run


Once the server starts successfully, open your browser and go to:
👉 http://localhost:8080

### 🪜 Step 4: Explore the Application

Visit the Home Page → /jobs

Register or login as a user

Apply for jobs

View your applications in My Applications

(If logged in as recruiter) → Add or manage job posts

✅ Tip: If you make any code change, you can rebuild and restart using:

mvn clean package
java -jar target/careerconnect-0.0.1-SNAPSHOT.jar


## 🏆 Future Enhancements

Add recruiter dashboard with analytics

Enable job filters (by role, location, salary range)

Email notifications for job applications

Resume upload functionality

## 👨‍💻 Author

Krishna Agarwal
B.Tech CSE (2022–2026) | Anand Engineering College, Agra
## 📧 Email: krishnaa1420037@gmail.com

🌐 GitHub: github.com/krishnaagarwal12345

## ⭐ Contribute

If you like this project, please ⭐ the repository — it helps others discover it!
