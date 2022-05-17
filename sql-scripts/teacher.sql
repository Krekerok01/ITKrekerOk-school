CREATE DATABASE  IF NOT EXISTS `my_project_db`;
USE `my_project_db`;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(25) DEFAULT NULL,
  `last_name` varchar(25) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `experience_time` int,
  `course` varchar(45),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


--
-- Data for table `teacher`
--

INSERT INTO `teacher` VALUES
    (1, 'Sergey', 'Westorn', 'serega89@gmail.com', 4, 'UI/UX Designer'),
    (2, 'Rossi', 'Maley', 'rosachka@mail.ru', 6, 'Java Developer'),
    (3, 'Katty', 'Lorian', 'kittykat@gmail.com', 2, 'Automation QA Engineer on JavaScript'),
    (4, 'Lera', 'Variton', 'lerchik@gmail.com', 3, 'Automation QA Engineer on Java'),
    (5, 'Roman', 'Romanenko', 'romanromanenko@gmail.com', 3, 'Python Developer'),
    (6, 'Nikita', 'Belkin', 'nikitabel@gmail.com', 6, 'C#(.NET) Developer'),
    (7, 'Alla', 'Medvedeva', 'allaalla@gmail.com', 4, 'Business Analyst'),
    (8, 'Milana', 'Vikituk', 'milana93@gmail.com', 7, 'Frontend Developer'),
    (9, 'Dan', 'Rison', 'danCHik87@gmail.com', 5, 'Android Developer'),
    (10, 'Yuliya', 'Krasotiva', 'yuliya89@gmail.com', 6, 'IOS Developer'),
    (11, 'Vladislav', 'Matyush', 'matyush76@gmail.com', 14, 'Project Manager'),
    (12, 'Inna', 'Merkova', 'merInna@gmail.com', 7, 'Flutter Developer'),
    (13, 'Simon', 'Barritt', 'barritsim@gmail.com', 1, 'Unity Developer'),
    (14, 'Thomas', 'Brandon', 'thomasBR@gmail.com', 5, 'Data Scientist'),
    (15, 'Andrew', 'Luton', 'luto1986@gmail.com', 4, 'IT Recruiter');


