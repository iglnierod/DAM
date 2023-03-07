# FILTROS-ORDER BY
## 1.1
### Mostrar todos los datos de los jugadores del equipo 3 ordenados por apellido
select *
from jugadores
where idEquipo = 3
order by apellido asc;

## 1.2
### Mostrar nombre, apellido e idJugador de los jugadores que juegan cómo ‘pivot ordenados por su identificador
select nombre, apellido, idJugador -- , puesto
from jugadores
where puesto like 'pivot'
order by idJugador;

## 1.3
### Mostrar nombre y apellido de los jugadores que midan más de 2 metros y ganen menos de 100000 euros
select nombre, apellido -- , altura, salario
from jugadores
where altura > 2 and salario < 100000;

## 1.4
### Mostrar todos los datos de los partidos jugados en febrero
select *
from partidos
where fecha like '%-02-%';

## 1.5
### Mostrar todo de los jugadores de los equipos 1 y 2 que ganen más de 80000 euros.
select *
from jugadores
where salario > 80000 and
	  idEquipo in (1,2);

## 1.6
### Mostrar todos los datos de los equipos cuya web termine en ‘.com’ o ‘.net’.
select *
from equipos
where webOficial like '%.net'
	  or webOficial like '%.com';
