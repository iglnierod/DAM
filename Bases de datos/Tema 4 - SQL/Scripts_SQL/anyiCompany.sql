DROP DATABASE IF EXISTS anyiCompany;
CREATE DATABASE anyiCompany;
USE anyiCompany;

DROP TABLE IF EXISTS clientes;
CREATE TABLE clientes(
	nif VARCHAR(9),
    nombre VARCHAR(50) NOT NULL,
    direccion VARCHAR(50),
    PRIMARY KEY(nif)
);

DROP TABLE IF EXISTS pagosPendientes;
CREATE TABLE pagosPendientes(
	codPago INT AUTO_INCREMENT,
	nif VARCHAR(9) ,
	importe DOUBLE UNSIGNED NOT NULL,
    PRIMARY KEY (codPago),
	FOREIGN KEY (nif) REFERENCES clientes(nif) 
);