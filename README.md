# An Airline Employee Management System 👨‍💼

A full-stack web application for managing employee records with secure authentication, built with Spring Boot and Thymeleaf.

![image](https://github.com/user-attachments/assets/8de8935a-20c7-4a62-b4cb-955c000dda71)
![image](https://github.com/user-attachments/assets/7e21e2bd-78c5-4686-a241-1e32da25b949)
![image](https://github.com/user-attachments/assets/7ed028fe-7dd1-40b0-b082-76b281b3cc66)




## Features ✨
- **Role-based access control** (Admin/Manager) using Spring Security
- **CRUD operations** for employee management
- **Search functionality** to filter employees by name
- **Form validation** with client-side and server-side checks
- **Responsive UI** built with Bootstrap 5
- **Data persistence** with MySQL database
- **BCrypt Password Hashing**: All passwords are encrypted using Spring Security's BCrypt algorithm

## Technologies 🛠️
- **Backend**: Java 17, Spring Boot 3.x, Spring Security, Spring Data JPA
- **Frontend**: Thymeleaf, Bootstrap 5, JavaScript
- **Database**: MySQL
- **Tools**: Maven, Git

## Installation & Setup 🚀

### Prerequisites
- Java 17 JDK
- MySQL 8.0+
- Maven 3.8+

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/ananyapawar601/Employee-Management-System.git
2. Configure database in src/main/resources/application.properties:
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
3. Build and run:
   ```bash
   mvn spring-boot:run
4. Access the application at: http://localhost:8080
5. Use these credentials to run and test
   Employee (Only View Access) - username: matt, password - test123
   Manager (View, Create and Edit Access) - username: luke, password - test123
   Admin (View, Create, Edit and Delete Access) - username:john, password - test123

   
