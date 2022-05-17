CREATE DATABASE  IF NOT EXISTS `my_project_db`;
USE `my_project_db`;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(25) DEFAULT NULL,
  `last_name` varchar(25) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `age` int,
  `course` varchar(45),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


--
-- Data for table `student`
--

INSERT INTO `student` VALUES
	(1, 'Igor', 'Boldicov', 'igor01@gmail.com', 21, 'Flutter Developer'),
    (2, 'Alex', 'Diron', 'alexxela@gmail.com', 22, 'Automation QA Engineer on JavaScript'),
    (3, 'Ilia', 'Matyush', 'iliamatyush04@gmail.com', 17, 'C#(.NET) Developer'),
    (4, 'Tanya', 'Gorudan', 'tanusha1999@gmail.com', 25, 'Business Analyst'),
    (5, 'Nikita', 'Mamatsiuk', 'nikitos123@gmail.com', 20, 'UI/UX Designer'),
    (6, 'Kate', 'Western', 'kittikat@gmail.com', 24, 'C#(.NET) Developer'),
    (7, 'Vlad', 'Cehanovich', 'vladiskos1@gmail.com', 21, 'Automation QA Engineer on Java'),
    (8, 'Kirill', 'Shkironok', 'kirillshkironok@gmail.com', 20, 'Frontend Developer'),
    (9, 'Varvara', 'Mamatsiuk', 'matyush2001@gmail.com', 21, 'Java Developer'),
    (10, 'John', 'Piton', 'jhonny@gmail.com', 18, 'Python Developer');