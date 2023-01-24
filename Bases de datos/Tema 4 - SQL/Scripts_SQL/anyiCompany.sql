DROP DATABASE IF EXISTS anyiCompany;
CREATE DATABASE anyiCompany;
USE anyiCompany;

DROP TABLE IF EXISTS clientes;
CREATE TABLE clientes(
	nif VARCHAR(10),
    nombre VARCHAR(50) NOT NULL,
    direccion VARCHAR(50),
    PRIMARY KEY(nif)
);

DROP TABLE IF EXISTS pagosPendientes;
CREATE TABLE pagosPendientes(
	codPago INT AUTO_INCREMENT,
	nif VARCHAR(10) ,
	importe DOUBLE UNSIGNED NOT NULL,
    PRIMARY KEY (codPago),
	FOREIGN KEY (nif) REFERENCES clientes(nif) 
    ON UPDATE NO ACTION ON DELETE NO ACTION
);

INSERT INTO clientes (nif, nombre)
VALUES 
('5555672-L', 'Pedro'),
('07896543-A', 'Marta');

INSERT INTO pagosPendientes (nif, importe)
VALUES 
('5555672-L', 20.50),
('5555672-L', 100.02);

SELECT * FROM clientes;
SELECT * FROM pagosPendientes;

# NO SE PUEDE BORAR POR EL NO ACTION/RESTRICTED DE LA FK
# UPDATE clientes
# SET nif = '55555555-L'
# WHERE nif = '5555672-L';

DELETE FROM clientes WHERE nif = '07896543-A';

ALTER TABLE pagosPendientes
DROP FOREIGN KEY pagospendientes_ibfk_1;


ALTER TABLE pagosPendientes
DROP COLUMN nif;

ALTER TABLE pagosPendientes
ADD nif VARCHAR(10);

ALTER TABLE pagosPendientes
ADD CONSTRAINT fk_nif FOREIGN KEY (nif) REFERENCES clientes(nif)
ON DELETE SET NULL
ON UPDATE CASCADE;


UPDATE clientes
SET nif = '55555555-L'
WHERE nif = '5555672-L';

SELECT * FROM clientes;
SELECT * FROM pagosPendientes;