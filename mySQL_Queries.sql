delimiter $$

CREATE DATABASE `health_mission` /*!40100 DEFAULT CHARACTER SET latin1 */$$

delimiter $$

CREATE TABLE `hm_address` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address_1` varchar(45) DEFAULT NULL,
  `address_2` varchar(45) DEFAULT NULL,
  `area` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `taluka` varchar(45) DEFAULT NULL,
  `district` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `pin` int(11) DEFAULT NULL,
  `is_active` int(11) DEFAULT '1',
  `created_by` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `modified_by` varchar(45) DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1$$

delimiter $$

CREATE TABLE `hm_immunization` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age_start` int(11) DEFAULT NULL,
  `age_end` int(11) DEFAULT NULL,
  `age_desc` varchar(45) DEFAULT NULL,
  `vaccine_name` varchar(45) DEFAULT NULL,
  `diseases_prevented` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1$$

delimiter $$

CREATE TABLE `hm_people` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `aadhar_id` int(11) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `middle_name` varchar(45) DEFAULT NULL,
  `date_of_birth` datetime NOT NULL,
  `type` varchar(45) NOT NULL,
  `is_active` int(11) DEFAULT '1',
  `created_by` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `modified_by` varchar(45) DEFAULT NULL,
  `modified_date` datetime DEFAULT NULL,
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `aadhar_id_UNIQUE` (`aadhar_id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1$$









