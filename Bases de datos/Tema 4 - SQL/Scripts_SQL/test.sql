DROP DATABASE IF EXISTS lunnaris;
CREATE DATABASE lunnaris;
USE lunnaris;
CREATE TABLE lunna(
    codigo INT unsigned AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20),
    apellidos VARCHAR(50)
);

INSERT INTO lunna ( nombre,apellidos ) VALUES
    ('Anna','Gimenez Cabrales'),
    ('Rodrigo','Iglesias Nieto'),
    ("Juan", "Pérez"),
    ("María", "Gómez"),
    ("Pedro", "Rodríguez"),
    ("Ana", "Martínez"),
    ("José", "García"),
    ("Isabel", "Hernández"),
    ("Luis", "López"),
    ("Laura", "González"),
    ("Francisco", "Sánchez"),
    ("Marta", "Ruiz");

SELECT * FROM lunna;
