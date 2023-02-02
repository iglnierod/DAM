use jardineria;
INSERT INTO Oficinas VALUES 
('FUE-ES','Fuenlabrada','España','Fuenlabrada','08077','+34 93 3521102','Avenida Pirámide, 33','3A escalera Derecha');

INSERT INTO Empleados VALUES 
(32,'Enrique','Gómez','Perez','3807','enrique@jardineria.es','FUE-ES',NULL,'Representante de ventas');

INSERT INTO Clientes VALUES 
(39,'Gardening Associates','Juan','Miguelez','5557420345','5557420345','Calle del Carmen',NULL,'Miami','Miami','USA','3807',25,6000);

INSERT INTO Pedidos VALUES 
(129,'2009-01-20','2009-01-26',NULL,'Pendiente',NULL,39);

INSERT INTO DetallePedidos VALUES 
(129,'FR-66',10,70,3),
(129,'FR-67',10,60,3);

UPDATE Clientes
SET CodigoCliente = 40
WHERE CodigoCliente = 39;

DELETE FROM Clientes
WHERE CodigoCliente = 39;

ALTER TABLE pedidos DROP FOREIGN KEY Pedidos_Clientes;

ALTER TABLE pedidos
ADD CONSTRAINT Pedidos_Clientes foreign key (CodigoCliente) REFERENCES clientes(CodigoCliente)
ON UPDATE CASCADE;