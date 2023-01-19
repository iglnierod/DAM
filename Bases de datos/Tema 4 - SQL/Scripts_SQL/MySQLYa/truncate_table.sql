USE MySQLYa;

DROP TABLE IF EXISTS medicamentos;
CREATE TABLE medicamentos(
	codigo INT AUTO_INCREMENT,
    nombre VARCHAR(20),
    laboratorio VARCHAR(20),
    precio FLOAT,
    cantidad INT,
    PRIMARY KEY (codigo)
);

INSERT INTO medicamentos (nombre, laboratorio,precio,cantidad)
VALUES('Sertal','Roche',5.2,100);
INSERT INTO medicamentos (nombre, laboratorio,precio,cantidad)
VALUES('Buscapina','Roche',4.10,200);
INSERT INTO medicamentos (nombre, laboratorio,precio,cantidad)
VALUES('Amoxidal 500','Bayer',15.60,100);
  
DELETE FROM medicamentos;

INSERT INTO medicamentos (nombre, laboratorio,precio,cantidad)
VALUES('Sertal','Roche',5.2,100);
INSERT INTO medicamentos (nombre, laboratorio,precio,cantidad)
VALUES('Amoxidal 500','Bayer',15.60,100);

SELECT * FROM medicamentos;

TRUNCATE TABLE medicamentos;

INSERT INTO medicamentos (nombre, laboratorio, precio, cantidad)
VALUES('Buscapina','Roche',4.10,200);

SELECT * FROM medicamentos;