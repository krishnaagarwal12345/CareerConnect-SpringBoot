# 💼 CareerConnect – Job Portal Web Application  

![Java](https://img.shields.io/badge/Java-17-orange?logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-green?logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?logo=mysql)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template%20Engine-brightgreen?logo=thymeleaf)
![License](https://img.shields.io/badge/License-MIT-yellow)

---

## 🧭 Overview  
**CareerConnect** is a full-stack **Job Portal Web Application** built using **Spring Boot** and **Thymeleaf**.  
It allows **job seekers** to explore and apply for jobs, while **recruiters** can post and manage job openings.  

The project demonstrates complete **Spring MVC architecture** with **Spring Security**, **JPA**, **MySQL**, and a clean responsive front-end.  

---

## 🚀 Features  

### 👨‍💼 For Job Seekers  
- Register and log in securely  
- Explore multiple job listings  
- Apply instantly for any job  
- View all applied jobs in **My Applications**

### 🧑‍💻 For Recruiters  
- Post new job openings  
- Manage existing job posts  
- View applications submitted by seekers  

### 🔐 Security  
- Integrated **Spring Security** for authentication and authorization  
- Encrypted passwords using **BCrypt**  
- Role-based access control for recruiters and job seekers  

---

## 🏗️ Tech Stack  

| Layer | Technology |
|-------|-------------|
| **Backend** | Spring Boot, Spring Security, Spring Data JPA |
| **Frontend** | Thymeleaf, HTML5, CSS3, Bootstrap |
| **Database** | MySQL |
| **Build Tool** | Maven |
| **Language** | Java 17 |
| **Tools** | Eclipse, VS Code, Postman, Git, GitHub |

---

## 📁 Project Structure  

CareerConnect/
│
├── src/
│ ├── main/
│ │ ├── java/com/krishna/careerconnect/
│ │ │ ├── controller/ # AuthController, JobController, ApplicationController
│ │ │ ├── entity/ # Job, Application, User entities
│ │ │ ├── repository/ # JPA repositories
│ │ │ ├── security/ # Security configuration
│ │ │ ├── service/ # Business logic services
│ │ │ └── CareerConnectApplication.java
│ │ └── resources/
│ │ ├── templates/ # Thymeleaf templates (HTML)
│ │ ├── static/css/ # Custom styling
│ │ └── application.properties
│ └── test/
│
├── pom.xml
└── README.md

yaml
Copy code

---

## ⚙️ Setup & Installation  

### 1️⃣ Clone the Repository  
```bash
git clone https://github.com/krishnaagarwal12345/CareerConnect-SpringBoot.git
cd CareerConnect-SpringBoot

###2️⃣ Configure Database
Open src/main/resources/application.properties and update credentials:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/careerconnect
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
3️⃣ Run the Application
bash
Copy code
mvn spring-boot:run
Then open in browser:
👉 http://localhost:8080

🖼️ Screenshots
📸 Add your real screenshots in the /screenshots folder
and link them here (for example 👇)

🏠 Home / Job Listings Page

🧾 My Applications Page

🔐 Login / Register Page

🧑‍💻 Post a Job (Recruiter Page)

💡 Future Enhancements
Add recruiter dashboard with application analytics

Implement job search and filters

Resume upload & download for applicants

Email notifications for job updates

REST API support for mobile apps

👤 Author
Krishna Agarwal
🎓 B.Tech CSE, Anand Engineering College (2022–2026)
📧 krishnaa1420037@gmail.com
💼 LinkedIn
💻 GitHub

⭐ Contribute
If you like this project, please ⭐ star the repo and share your feedback!
Pull requests are welcome for future improvements.

🪄 License
This project is open-source and available under the MIT License.
