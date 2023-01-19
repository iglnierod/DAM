CREATE DATABASE IF NOT EXISTS MySQLYa;
USE MySQLYa;
DROP TABLE IF EXISTS libros;
CREATE TABLE libros(
	codigo INTEGER AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(20),
    autor VARCHAR(30),
    editorial VARCHAR(15)
);

DESCRIBE libros;

INSERT INTO libros (titulo, autor, editorial) 
VALUES 
('El aleph','Borges','Planeta'),
('Martin Fierro','Jose Hernandez','Emece'),
('Aprenda PHP','Mario Molina','Emece'),
('El quijote','Borges','Paidos'),
('Matematica estas ahi', 'Paenza', 'Paidos');

SELECT * FROM libros;