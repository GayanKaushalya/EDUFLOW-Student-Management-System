-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: student_management
-- ------------------------------------------------------
-- Server version	9.0.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'admin','admin1234'),(2,'admin2','1234');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `id` int NOT NULL,
  `student_id` int NOT NULL,
  `semester` int NOT NULL,
  `module1` varchar(150) NOT NULL,
  `module2` varchar(150) NOT NULL,
  `module3` varchar(150) NOT NULL,
  `module4` varchar(150) NOT NULL,
  `module5` varchar(150) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_idx` (`student_id`),
  CONSTRAINT `id` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,1,1,'Introduction to Computer Science','Mathamatics For Computing','Programming Fundamentals','Digital Logic and Computer Architecture','Object Oriented Programming'),(2,1,1,'Introduction to Computer Science','Introduction to Computer Science','Introduction to Computer Science','Introduction to Computer Science','Introduction to Computer Science'),(3,2,1,'Introduction to Computer Science','Mathamatics For Computing','Programming Fundamentals','Digital Logic and Computer Architecture','Object Oriented Programming'),(4,2,2,'Database Management','GUI Development','Software Engineering','Web Development','Enterprices Application Development'),(5,3,1,'Introduction to Computer Science','Mathamatics For Computing','Programming Fundamentals','Digital Logic and Computer Architecture','Object Oriented Programming'),(6,3,2,'Database Management','GUI Development','Software Engineering','Web Development','Enterprices Application Development');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marks`
--

DROP TABLE IF EXISTS `marks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marks` (
  `id` int NOT NULL,
  `student_id` int NOT NULL,
  `semester` int NOT NULL,
  `module1` varchar(150) NOT NULL,
  `score1` double NOT NULL,
  `module2` varchar(150) NOT NULL,
  `score2` double NOT NULL,
  `module3` varchar(150) NOT NULL,
  `score3` double NOT NULL,
  `module4` varchar(150) NOT NULL,
  `score4` double NOT NULL,
  `module5` varchar(150) NOT NULL,
  `score5` double NOT NULL,
  `average` float NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `student_id` FOREIGN KEY (`id`) REFERENCES `student` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marks`
--

LOCK TABLES `marks` WRITE;
/*!40000 ALTER TABLE `marks` DISABLE KEYS */;
INSERT INTO `marks` VALUES (1,1,1,'Introduction to Computer Science',4,'Mathamatics For Computing',4,'Programming Fundamentals',4,'Digital Logic and Computer Architecture',3.7,'Object Oriented Programming',3.7,3.88);
/*!40000 ALTER TABLE `marks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(150) NOT NULL,
  `date_of_birth` date NOT NULL,
  `gender` varchar(15) NOT NULL,
  `email` varchar(250) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `nic` varchar(15) NOT NULL,
  `mother_name` varchar(150) NOT NULL,
  `father_name` varchar(150) NOT NULL,
  `address` varchar(355) NOT NULL,
  `image_path` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Gihan','2007-12-30','Male','g@gmail.com','07778974625','200430003610','Shayamali Pathirana','Gamini Kulathunga','asfhSHshf','C:\\Users\\gayan\\Downloads\\wallpaperflare.com_wallpaper (2).jpg'),(2,'John Doe','2013-12-29','Male','john.doe@example.com ','0771234567','950123456V','Jane Doe','James Doe','123 Main Street, Colombo','D:\\Wallpapers\\wallpaperflare.com_wallpaper (5).jpg'),(3,'Sarah Smith','1995-12-31','Female','sarah.smith@example.com',' 0772345678','980234567V ','Mary Smith','Robert Smith','456 Park Road, Kandy','C:\\users\\gayan\\OneDrive\\Pictures\\Acer\\Acer_Wallpaper_02_3840x2400.jpg'),(4,'David Brown ','1999-12-26','Male',' david.brown@example.com','0773456789',' 980345678V','Alice Brown',' William Brown','789 Hilltop Lane, Galle ','C:\\users\\gayan\\OneDrive\\Pictures\\Acer\\Acer_Wallpaper_04_3840x2400.jpg');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-02-07 19:48:24
