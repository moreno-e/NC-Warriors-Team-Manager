CREATE DATABASE  IF NOT EXISTS `player_directory`;
USE `player_directory`;

--
-- Table structure for table `player`
--

DROP TABLE IF EXISTS `player`;

CREATE TABLE `player` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `team` varchar(5) DEFAULT NULL,
  `position` varchar DEFAULT NULL;
  `email` varchar(45) DEFAULT NULL,
  `phone_number varchar(15) DEFAULT NULL,  
  
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `player`
--

INSERT INTO `player` VALUES 
	(1,'Eric','Moreno','lower','center','moreno.eric01@gmail.com','919-614-0424'),
	(2,'Robbie','Walters','lower','left','robbiewalters@test.com','919-999-9999'),

