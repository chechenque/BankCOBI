INSERT INTO Sucursal VALUES (1,"Monterrey","Calle de Monterrey","Colonia de Monterrey","07500","Estado deMonterrey");

-- Reclutador

INSERT INTO Reclutador VALUES ("MODA","Alan","Moreno","De la Rosa","SoyAlan",0500); 

INSERT INTO TrabajaReclutador VALUES (1,"MODA");

-- Gerente

INSERT INTO Gerente VALUES ("MACR","Ricardo","Castañeda","Martínez","profe",0600);

INSERT INTO TrabajaGerente VALUES (1,"MACR");

-- Cajero

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
  `Firma` integer
);
-- Cliente
INSERT INTO Cliente VALUES ("LECL","Luis Angel","Leyva","Castillo","SoyLuis",1498);

INSERT INTO TieneDebito VALUES ("LECL",1);

INSERT INTO TieneCredito VALUES ("LECL",1);

INSERT INTO Debito VALUES (1,CURRENT_DATE(),1000);

INSERT INTO Credito VALUES (1,CURRENT_DATE(),10000);