USE TEST;

CREATE TABLE test1 (
    id TINYINT ZEROFILL
);

INSERT INTO test1 VALUES(3);
INSERT INTO test1 VALUES(127);
INSERT INTO test1 VALUES(-1);
INSERT INTO test1 VALUES(256);

SELECT 
    *
FROM
    TEST1;

CREATE TABLE test2 (
    id TINYINT(10),
    d DECIMAL(3 , 1 )
);

INSERT INTO test2 (id,d) VALUES (100000000,123.4); 
INSERT INTO test2 (id,d) VALUES (127,123.4);
INSERT INTO test2 (id,d) VALUES (127,13.4);

SELECT 
    id, d
FROM
    test2;
    
CREATE TABLE test3 (
    id INT(3) ZEROFILL,
    id2 INT ZEROFILL
);
    INSERT INTO test3(id,id2) VALUES(22,22);
SELECT 
    *
FROM
    test3;

	CREATE TABLE test4 (
    v CHAR(256)
);-- Error. Tamaño MÁXIMO para la columna 255
	CREATE TABLE test4 (
    v CHAR(255)
);

CREATE TABLE test5 (
    i INT,
    v VARCHAR(4),
    c CHAR(4)
);

insert into test5 values (1,"",'');
insert into test5 values(2,'ab','ab');
insert into test5 values(3,'abcd','abcd');
insert into test5 values(4, 'abcdefgh', 'abcdefgh'); #ERROR. Cadena demasiada larga. Maximo 4 caracteres
insert into test5 values(5,'ABCD ','ABCD ');

SELECT 
    *
FROM
    test5;
    
SELECT 
    *
FROM
    test5
WHERE
    v LIKE 'abcd';
    
-- ------------------
CREATE TABLE test6 (
    v VARCHAR(65535)
);-- Error. Cadena demasiado larga. MAXIMO 21845 caracteres.
CREATE TABLE test6 (
    v VARCHAR(16384)
);-- Error. Cadena demasiado larga. MAXIMO 21845 caracteres (incluyendo un bit adicional para la longitud de cada una de las columnas)
CREATE TABLE test6 (
    v VARCHAR(16383)
);-- Error. Cadena demasiado larga. MAXIMO 21845 caracteres (incluyendo un bit adicional para la longitud de cada una de las columnas)
CREATE TABLE test61 (
    v VARCHAR(21844),
    v1 VARCHAR(1)
);-- Error. Cadena demasiado larga. MAXIMO 21845 caracteres (incluyendo un bit adicional para la longitud de cada una de las columnas).
CREATE TABLE test61 (
    v VARCHAR(16381),
    v1 VARCHAR(1)
);

-- -----------------
CREATE TABLE test7 (
    i INT,
    B BINARY(4)
);

INSERT INTO test7 VALUES (1,'abcd');
INSERT INTO test7 VALUES (2,'ABCD');

SELECT 
    *
FROM
    test7;

SELECT 
    *
FROM
    test7
WHERE
    B LIKE 'abcd';

SELECT 
    *
FROM
    test7
WHERE
    B LIKE 'ABCD';

SELECT 
    *
FROM
    test7
WHERE
    B LIKE 'ABcD';

-- -------------------
CREATE TABLE test8 (
    i INT,
    b BLOB(4),
    t TEXT(4)
);

INSERT INTO test8 VALUES(1, 'abcd','abcd');

SELECT 
    *
FROM
    test8
WHERE
    b LIKE 'abcd';

SELECT 
    *
FROM
    test8
WHERE
    b LIKE 'Abcd';


SELECT 
    *
FROM
    test8
WHERE
    t LIKE 'abcd';

SELECT 
    *
FROM
    test8
WHERE
    t LIKE 'Abcd';

-- ---------------
CREATE TABLE test9 (
    i INT,
    e ENUM('', 'null', 'true', 'false')
);


INSERT INTO test9 (i,e) VALUES (1,'true');
INSERT INTO test9 (i,e) VALUES (2,'folse');
INSERT INTO test9 (i,e) VALUES (3,'');
INSERT INTO test9 (i,e) VALUES (4, NULL);


SELECT 
    i, e
FROM
    test9;

-- ---------------
CREATE TABLE test10 (
    fruta SET('manzana', 'mango', 'pera', 'banana', '')
);

INSERT INTO test10 VALUES ('banana');
INSERT INTO test10 VALUES ('mango');
INSERT INTO test10 VALUES ('pera');

SELECT 
    *
FROM
    test10
ORDER BY fruta DESC;

CREATE TABLE test11 (
    f DATETIME
);

INSERT INTO test11 VALUES ('98-12-31 11:30:45'),
						  ('98.12.31 11+30+45'),
						  (981231113045),
						  ('981231113045'),
						  (now());
                          
INSERT INTO test11 VALUES ('982131119045');SELECT 
    *
FROM
    test11;
-- ---------------
#EJEMPLO 12
CREATE TABLE test12 (
    t TIMESTAMP
);
INSERT INTO test12 VALUES ('98-12-31 11:30:45'),
						  ('98.12.31'),
						  (981231113045),
						  ('681231111045'), -- Error. Año ilegal debe ser igual o mayor a 1970.
						  (date(now()));
                          
SELECT * FROM test12;





















