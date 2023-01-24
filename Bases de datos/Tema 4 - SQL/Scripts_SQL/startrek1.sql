DROP DATABASE IF EXISTS startrek;
CREATE DATABASE startrek;
USE startrek;

DROP TABLE IF EXISTS ACTORES;
CREATE TABLE ACTORES(
	codigo INT,
    nombre VARCHAR(50) NOT NULL,
    fecha DATE NOT NULL,
    nacionalidad VARCHAR(20) DEFAULT 'EEUU',
    PRIMARY KEY(codigo)
);

DROP TABLE IF EXISTS PERSONAJES;
CREATE TABLE PERSONAJES(
	codigo INT,
    nombre VARCHAR(50) NOT NULL,
    raza VARCHAR(20) NOT NULL,
    grado VARCHAR(20) NOT NULL, 
    codigoActor INT NOT NULL,
    codigoSuperior INT,
    PRIMARY KEY(codigo),
    FOREIGN KEY (codigoActor) REFERENCES ACTORES(codigo),
	FOREIGN KEY (codigoSuperior) REFERENCES PERSONAJES(codigo)
);

DROP TABLE IF EXISTS PLANETAS;
CREATE TABLE PLANETAS(
	codigo INT,
    galaxia VARCHAR(50),
    nombre VARCHAR(50) NOT NULL,
    PRIMARY KEY(codigo)
);

DROP TABLE IF EXISTS CAPITULOS;
CREATE TABLE CAPITULOS(
	temporada INT,
    orden VARCHAR(3),
    titulo VARCHAR(50) NOT NULL,
    fecha DATE NOT NULL,
    PRIMARY KEY (temporada, orden)
);

DROP TABLE IF EXISTS PELICULAS;
CREATE TABLE PELICULAS(
	codigo INT,
    titulo VARCHAR(50) NOT NULL,
    director VARCHAR(30) NOT NULL,
    anho DATE,
    PRIMARY KEY(codigo)
);

DROP TABLE IF EXISTS PersonajesCapitulos;
CREATE TABLE PersonajesCapitulos(
	codigoPersonaje INT,
    temporada INT NOT NULL,
    orden VARCHAR(3) NOT NULL,
    PRIMARY KEY(codigoPersonaje),
    FOREIGN KEY (temporada, orden) REFERENCES CAPITULOS(temporada, orden)
);

DROP TABLE IF EXISTS PersonajesPeliculas;
CREATE TABLE PersonajesPeliculas(
	codigoPersonaje INT,
    codigoPelicula INT,
    PRIMARY KEY (codigoPersonaje, codigoPelicula)
);

DROP TABLE IF EXISTS NAVES;
CREATE TABLE NAVES(
	codigo INT,
    nTripulantes INT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    PRIMARY KEY(codigo)
);

DROP TABLE IF EXISTS VISITAS;
CREATE TABLE VISITAS(
	codigoNave INT,
    codigoPlaneta INT,
    temporada INT NOT NULL,
    orden VARCHAR(3) NOT NULL,
    PRIMARY KEY (codigoNave, codigoPlaneta, temporada, orden)
);
