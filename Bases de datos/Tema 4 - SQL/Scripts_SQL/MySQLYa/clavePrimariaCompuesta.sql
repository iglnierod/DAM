USE MySQLYa;

DROP TABLE IF EXISTS prestamos;
CREATE TABLE prestamos(
	titulo VARCHAR(40) NOT NULL, #default 'test'
    documento CHAR(8) NOT NULL,
    fechaprestamo DATE NOT NULL,
    fechadevolucion DATE,
    devuelto char(1) default 'N',
    PRIMARY KEY(titulo, fechaprestamo)
);

insert into prestamos (titulo,documento,fechaprestamo)
  values('Manual de 1 grado','22333444','2006-07-10'),
  ('Manual de 1 grado','22333444','2006-07-20'),
  ('Manual de 1 grado','23333444','2006-07-15'),
  ('El aleph','22333444','2006-07-10'),
  ('El aleph','30333444','2006-08-10');
  #insert into prestamos (titulo,documento,fechaprestamo)
  #values('Manual de 1 grado','25333444','2006-07-10');

#insert into prestamos (documento, fechaprestamo)
#values('22333444', '2006-07-10');

  DESCRIBE prestamos;
  SELECT * FROM prestamos;