CREATE DATABASE IF NOT EXISTS `bankcobi`;
USE `bankcobi`;

CREATE TABLE `Sucursal` (
  `ID` integer PRIMARY KEY,
  `Nombre` varchar(255),
  `Calle` varchar(255),
  `Colonia` varchar(255),
  `CP` varchar(255),
  `Estado` varchar(255)
);

CREATE TABLE `TrabajaReclutador` (
  `IDSucursal` integer,
  `RFC_Reclutador` varchar(255)
);

CREATE TABLE `Reclutador` (
  `RFC` varchar(255) PRIMARY KEY,
  `Nombres` varchar(255),
  `APaterno` varchar(255),
  `AMaterno` varchar(255),
  `Contrasenna` varchar(255),
  `Sueldo` float4,
  `Firma` integer
);

CREATE TABLE `TrabajaGerente` (
  `IDSucursal` integer,
  `RFC_Reclutador` varchar(255)
);

CREATE TABLE `Gerente` (
  `RFC` varchar(255) PRIMARY KEY,
  `Nombres` varchar(255),
  `APaterno` varchar(255),
  `AMaterno` varchar(255),
  `Contrasenna` varchar(255),
  `Sueldo` float4,
  `Firma` integer
);

CREATE TABLE `TrabajaCajero` (
  `IDSucursal` integer,
  `RFC_Reclutador` varchar(255)
);

CREATE TABLE `Cajero` (
  `RFC` varchar(255) PRIMARY KEY,
  `Nombres` varchar(255),
  `APaterno` varchar(255),
  `AMaterno` varchar(255),
  `Contrasenna` varchar(255),
  `Sueldo` float4,
  `Firma` integer
);

CREATE TABLE `TrabajaEjecutivo` (
  `IDSucursal` integer,
  `RFC_Reclutador` varchar(255)
);

CREATE TABLE `Ejecutivo` (
  `RFC` varchar(255) PRIMARY KEY,
  `Nombres` varchar(255),
  `APaterno` varchar(255),
  `AMaterno` varchar(255),
  `Contrasenna` varchar(255),
  `Sueldo` float4,
  `Firma` integer
);

CREATE TABLE `Cliente` (
  `RFC` varchar(255) PRIMARY KEY,
  `Nombres` varchar(255),
  `APaterno` varchar(255),
  `AMaterno` varchar(255),
  `Contrasenna` varchar(255),
  `Firma` integer
);

CREATE TABLE `TieneDebito` (
  `RFC` varchar(255),
  `ID` integer
);

CREATE TABLE `TieneCredito` (
  `RFC` varchar(255),
  `ID` integer
);

CREATE TABLE `Debito` (
  `ID` integer PRIMARY KEY,
  `FechaApertura` date,
  `Saldo` float4
);

CREATE TABLE `Credito` (
  `ID` integer PRIMARY KEY,
  `FechaApertura` date,
  `Credito` float4
);

ALTER TABLE `TrabajaReclutador` ADD FOREIGN KEY (`IDSucursal`) REFERENCES `Sucursal` (`ID`);

ALTER TABLE `TrabajaReclutador` ADD FOREIGN KEY (`RFC_Reclutador`) REFERENCES `Reclutador` (`RFC`);

ALTER TABLE `TrabajaGerente` ADD FOREIGN KEY (`IDSucursal`) REFERENCES `Sucursal` (`ID`);

ALTER TABLE `TrabajaGerente` ADD FOREIGN KEY (`RFC_Reclutador`) REFERENCES `Gerente` (`RFC`);

ALTER TABLE `TrabajaCajero` ADD FOREIGN KEY (`IDSucursal`) REFERENCES `Sucursal` (`ID`);

ALTER TABLE `TrabajaCajero` ADD FOREIGN KEY (`RFC_Reclutador`) REFERENCES `Cajero` (`RFC`);

ALTER TABLE `TrabajaEjecutivo` ADD FOREIGN KEY (`IDSucursal`) REFERENCES `Sucursal` (`ID`);

ALTER TABLE `TrabajaEjecutivo` ADD FOREIGN KEY (`RFC_Reclutador`) REFERENCES `Ejecutivo` (`RFC`);

ALTER TABLE `TieneDebito` ADD FOREIGN KEY (`RFC`) REFERENCES `Cliente` (`RFC`);

ALTER TABLE `TieneDebito` ADD FOREIGN KEY (`ID`) REFERENCES `Debito` (`ID`);

ALTER TABLE `TieneCredito` ADD FOREIGN KEY (`RFC`) REFERENCES `Cliente` (`RFC`);

ALTER TABLE `TieneCredito` ADD FOREIGN KEY (`ID`) REFERENCES `Credito` (`ID`);
