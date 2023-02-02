drop database if exists LigaACB;
create database LigaACB;
use LigaACB;

drop table if exists EQUIPOS;
create table EQUIPOS(
	idEquipo int unsigned auto_increment primary key,
    nombreEquipo varchar(30) not null,
    ciudad varchar(30) not null,
    webOficial varchar(120) not null,
    puntos int unsigned not null
);

drop table if exists JUGADORES;
create table JUGADORES(
	idJugador int unsigned auto_increment primary key,
    nombre varchar(30) not null,
    apellido varchar(60) not null,
    puesto set('Escolta','Alero','Pivot','Base') not null,
    idCapitan int unsigned not null,
    fechaAlta DATE not null,
    salario double(7,2) not null,
    idEquipo int unsigned not null,
    altura double(2,2),
    foreign key (idCapitan) references JUGADORES(idJugador)
    on update cascade on delete cascade,
    foreign key (idEquipo) references EQUIPOS(idEquipo)
    on update cascade on delete cascade
);


drop table if exists PARTIDOS;
create table PARTIDOS(
	eLocal int unsigned not null,
    eVisitante int unsigned not null,
    resultado varchar (7) not null,
    fecha date not null,
    arbitro int unsigned not null,
    primary key(eLocal, eVisitante),
    foreign key (eLocal) references EQUIPOS(idEquipo) 
    on update cascade on delete cascade,
    foreign key (eVisitante) references EQUIPOS(idEquipo)
    on update cascade on delete cascade
);

load data infile "C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\equipos.csv"
replace
into table EQUIPOS
FIELDS TERMINATED BY ','
-- LINES TERMINATED BY '\n'
IGNORE 1 LINES
(idEquipo, nombreEquipo, ciudad, webOficial, puntos);

select * from equipos;