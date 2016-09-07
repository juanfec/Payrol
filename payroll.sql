/*
SQLyog Community Edition- MySQL GUI v8.05 
MySQL - 5.6.32-log : Database - PayRoll
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`PayRoll` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `PayRoll`;

/*Table structure for table `empleados` */

DROP TABLE IF EXISTS `empleados`;

CREATE TABLE `empleados` (
  `ID` int(11) NOT NULL,
  `NOMBRE` varchar(30) NOT NULL,
  `FECHA_NACIMIENTO` varchar(30) NOT NULL,
  `SEGURIDAD_SOCIAL` varchar(20) NOT NULL,
  `HORAS_TRABAJADAS` int(11) NOT NULL,
  `RANGO` varchar(30) NOT NULL,
  `PAGO` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `empleados` */

insert  into `empleados`(`ID`,`NOMBRE`,`FECHA_NACIMIENTO`,`SEGURIDAD_SOCIAL`,`HORAS_TRABAJADAS`,`RANGO`,`PAGO`) values (123,'cesar','enero','saludcoop',12,'antiguo',20000);

/*Table structure for table `pagos` */

DROP TABLE IF EXISTS `pagos`;

CREATE TABLE `pagos` (
  `ID_PAGO` int(10) NOT NULL,
  `PROPINA_DIARIA` float NOT NULL,
  `PROPINA_POR_EMPLEADO` float NOT NULL,
  PRIMARY KEY (`ID_PAGO`),
  CONSTRAINT `FK_pagos` FOREIGN KEY (`ID_PAGO`) REFERENCES `empleados` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pagos` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
