USE MySQLYa;

DROP TABLE IF EXISTS autos;

CREATE TABLE autos(
	patente CHAR(6),
    marca VARCHAR(20),
    modelo CHAR(4),
    precio FLOAT UNSIGNED,
    PRIMARY KEY(patente)
);

 insert into autos (patente,marca,modelo,precio)
  values('ACD123','Fiat 128','1970',15000);
 insert into autos (patente,marca,modelo,precio)
  values('ACG234','Renault 11','1990',40000);
 insert into autos (patente,marca,modelo,precio)
  values('BCD333','Peugeot 505','1990',80000);
 insert into autos (patente,marca,modelo,precio)
  values('GCD123','Renault Clio','1990',70000);
 insert into autos (patente,marca,modelo,precio)
  values('BCC333','Renault Megane','1998',95000);
 insert into autos (patente,marca,modelo,precio)
  values('BVF543','Fiat 128','1975',20000);
  
  SELECT * FROM autos WHERE modelo = 1990;
  
  SELECT * FROM autos WHERE precio > 50000;