# EduFlow Student Management System

## Project Overview
The **EduFlow Student Management System** is a Java-based application developed in **NetBeans** with **MySQL Workbench** as the database management system. It is designed to efficiently manage student records, course enrollments, and academic performance tracking.

## Features
- **Student Registration**: Add, update, and delete student records.
- **Course Management**: Assign students to courses and manage enrollments.
- **Attendance Tracking**: Monitor student attendance for each class.
- **Grade Management**: Store and retrieve student grades.
- **User Authentication**: Secure login for admins and teachers.
- **Reports Generation**: Export student data and academic reports.

## Technologies Used
- **Programming Language**: Java (JDK 22)
- **IDE**: NetBeans 22+
- **Database**: MySQL Workbench
- **GUI Framework**: Swing
- **Version Control**: Git & GitHub

## Installation & Setup
### Prerequisites
Ensure the following are installed on your system:
- **Java Development Kit (JDK 22 or later)**
- **NetBeans IDE**
- **MySQL Server & MySQL Workbench**
- **Git (for version control, optional)**

### Steps to Set Up the Project
1. **Clone the Repository**
   ```sh
   git clone https://github.com/your-username/EduFlow-StudentManagement.git
   ```
2. **Import Project in NetBeans**
   - Open NetBeans.
   - Click **File → Open Project** and select the cloned project folder.
3. **Configure Database**
   - Open **MySQL Workbench** and create a new database:
     ```sql
     CREATE DATABASE student_management;
     ```
   - Import the provided SQL file (`student_management.sql`) into MySQL Workbench.
4. **Update Database Configuration in Java**
   - Open `DatabaseConnection.java` and update credentials:
     ```java
     private static final String URL = "jdbc:mysql://localhost:3306/eduflow_db";
     private static final String USER = "root";
     private static final String PASSWORD = "yourpassword";
     ```
5. **Run the Application**
   - In NetBeans, click **Run → Run Project**.

## Usage
1. **Admin Login**: Use default credentials (admin/admin123) or create a new user.
2. **Add Students**: Navigate to "Student Management" and enter student details.
3. **Manage Courses**: Assign students to courses and track progress.
4. **Generate Reports**: Export student data for analysis.

## Author
**Gayan Kaushalya Kulathunga**  
**Index No:** KADSE241F-001 
**Email:** gayankaushalya@gmail.com

## License
This project is open-source under the MIT License.

---
**Note**: Ensure MySQL Server is running before launching the application.
