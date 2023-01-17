DROP DATABASE pruebas;

CREATE DATABASE pruebas;

USE pruebas;

CREATE TABLE empleados(
	codigo INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(40),
    comision INTEGER
	#PRIMARY KEY (codigo) / MANERA DE DECLARAR MAS DE UN CAMPO COMO CLAVE PRIMARIA
);

SHOW TABLES;

DESCRIBE empleados;

INSERT INTO empleados (nombre,comision) VALUES('Pedro',20); # HAY QUE INDICAR CAMPOS PQ NO SABE QUE EL PRIMERO ES AUTOINCREMENTABLE

SELECT * FROM empleados;

CREATE TABLE nuevosEmpleados SELECT * FROM empleados;
DESCRIBE nuevosEmpleados;
SELECT * FROM nuevosEmpleados;

CREATE TABLE nuevosEmpleados1 LIKE empleados;
DESCRIBE nuevosEmpleados1;
SELECT * FROM nuevosEmpleados1;

ALTER TABLE empleados ADD numHijos TINYINT;
DESCRIBE empleados;

ALTER TABLE empleados CHANGE codigo identificador TINYINT;
DESCRIBE empleados;

ALTER TABLE empleados MODIFY identificador INTEGER;
DESCRIBE empleados;

ALTER TABLE nuevosEmpleados1 RENAME TO oldEmpleados;
