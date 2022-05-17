DROP DATABASE  IF EXISTS `my_project_security_db`;

CREATE DATABASE  IF NOT EXISTS `my_project_security_db`;
USE `my_project_security_db`;


--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` char(68) NOT NULL,
  `enabled` tinyint(1) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--
-- NOTE: The passwords are encrypted using BCrypt
--


INSERT INTO `users` 
VALUES 
('kate','{bcrypt}$2a$10$77eq/N4L6s2RpG8kQynCf.zRwI1oxU4sW7FEsB8wVPzunGnXhe04S',1),
('nikita','{bcrypt}$2a$10$6LQrDQZHahhQKDd9rmksxuKuC4XSflHhuSmk7g7SrA199t.e45nou',1),
('olga','{bcrypt}$2a$10$lcZ/xoHpZ9T8ewH.gblt7upo9BAck4zp77P3rT6513wo65TFjSWPa',1);
('roman','{bcrypt}$2a$10$i1oaCfTQjzZ1xTCZ/0Ff6.rO5IiJ/PG4iSQql0z42fPblZ87ex1H2',1);
('student','{bcrypt}$2a$10$GIg83KqXFZI2FE2fyWHggudf9dxTAegqWWz7X8m.1SGMPa69sJ4Fa',1);
('tutor','{bcrypt}$2a$10$dZTx7xzVDH.UOG9uVPJb5.wqy67x0RcNgEoT3J4yFV0iw2IT9IcOO',1);


--
-- Table structure for table `authorities`
--

DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  UNIQUE KEY `authorities_idx_1` (`username`,`authority`),
  CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `authorities`
--

INSERT INTO `authorities` 
VALUES 
('kate','ROLE_MANAGER'),
('nikita','ROLE_ADMIN'),
('olga','ROLE_MANAGER'),
('roman','ROLE_MANAGER'),
('student','ROLE_STUDENT'),
('tutor','ROLE_TEACHER');


