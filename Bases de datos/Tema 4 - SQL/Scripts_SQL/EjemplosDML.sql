USE pruebas;
DROP TABLE IF EXISTS CLIENTES;
CREATE TABLE CLIENTES (
    codigo INT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    provincia ENUM('Coruña', 'Lugo', 'Ourense', 'Pontevedra') DEFAULT 'Coruña',
    profesion VARCHAR(20),
    fechaAlta TIMESTAMP DEFAULT NOW()
);

INSERT CLIENTES VALUES (1,'Daviz Pérez González','Pontevedra','Técnico','2012/01/12');
INSERT CLIENTES VALUES (2,'Manuel Pérez González','Coruña','','2011/11/11');

INSERT CLIENTES (nombre, codigo, provincia, fechaAlta)
VALUES ('Jesús Pérez González',3,'Lugo','2010/05/21');

INSERT CLIENTES VALUES (4,'Pablo López López',DEFAULT,'Técnico',DEFAULT);
INSERT CLIENTES VALUES (5,'María Villegas Leste','Ourense','Economista',now());

# POSIBLES ERRORES

## DATO MUY LARGO EN NOMBRE
-- INSERT CLIENTES
-- VALUES (5, 'Felipe Juan Pablo Alfonso de Todos los Santos de Borbón y Grecia','Ourense','Rey de España',now());

## DATO NO ESTÁ EN EL ENUM
-- INSERT CLIENTES
-- VALUES (5, 'Felipe IV','Ourensse','Rey de España',now());

## FALTA UN CAMPO
-- INSERT CLIENTES
-- VALUES (5, 'Felipe IV','Ourense','Rey de España');

## PK DUPLICADA^
INSERT CLIENTES
VALUES (6, 'Felipe IV','Ourense','Rey de España', DEFAULT);

# INSERT MULTIPLE
INSERT CLIENTES VALUES 
(7,'María Pérez González','Lugo','Economista','2001/12/26/'),
(8,'David Pérez González','Ourense','',now()),
(9,'Jesús Pérez González',DEFAULT,'Técnico','2003/03/21');

# INSERT ...SET
INSERT CLIENTES SET
	codigo = 10,
    nombre = 'Pablo García',
    provincia = DEFAULT,
    profesion = 'Administrativo',
    fechaAlta = '2012/02/14';
    
# INSERT SELECT
DROP TABLE IF EXISTS ClientesNorteGalicia;
CREATE TABLE ClientesNorteGalicia LIKE CLIENTES;
ALTER TABLE ClientesNorteGalicia DROP nombre, DROP provincia, DROP fechaAlta;

INSERT ClientesNorteGalicia (codigo, profesion)
SELECT codigo, profesion
FROM CLIENTES
WHERE provincia LIKE 'CORUÑA' OR
	  provincia LIKE 'LUGO';

# CARGAR DATOS DE UN ARCHIVO
# SHOW VARIABLES LIKE 'secure_file_
LOAD DATA INFILE "C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\clientes.txt"
INTO TABLE CLIENTES
FIELDS TERMINATED BY '-'
LINES TERMINATED BY '\r\n'
IGNORE 1 LINES
(CODIGO,NOMBRE,PROVINCIA,PROFESION);


# UPDATE 
UPDATE CLIENTES SET PROFESION = 'Ingeniero'
WHERE PROVINCIA LIKE 'Coruña' AND
	  PROFESION LIKE 'Técnico';

UPDATE CLIENTES, CLIENTESNORTEGALICIA SET
									CLIENTES.PROFESION = 'Contable',
                                    CLIENTESNORTEGALICIA.PROFESION = 'Contable'

WHERE CLIENTES.PROFESION LIKE 'Administrativ_' AND
	  CLIENTESNORTEGALICIA.PROFESION LIKE 'Administrativ_';

DELETE FROM CLIENTES
		WHERE PROFESION IS NULL OR PROFESION LIKE '';

DELETE CLIENTES, CLIENTESNORTEGALICIA
FROM CLIENTES, CLIENTESNORTEGALICIA
WHERE (CLIENTES.codigo = CLIENTESNORTEGALICIA.codigo)
AND CLIENTES.codigo = 4;

REPLACE CLIENTES (CODIGO, NOMBRE, PROVINCIA, PROFESION)
VALUES(14,'Jerusa Villergas', 'Coruña', 'Infomática');


REPLACE CLIENTES (CODIGO, NOMBRE, PROVINCIA, PROFESION)
VALUES(14,'Roberto Hidalgo', 'Lugo', 'Infomática');

REPLACE CLIENTES SET CODIGO = 15,
					  NOMBRE = 'Susana Flórez',
                      PROVINCIA = DEFAULT,
                      PROFESION = 'Bióloga';

REPLACE CLIENTESNORTEGALICIA (CODIGO, PROFESION)
SELECT CODIGO, PROFESION FROM CLIENTES WHERE CODIGO = 5;

-- TRUNCATE TABLE CLIENTES;



















