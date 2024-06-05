USE clubnautico;

INSERT INTO persona(dni,email,nombre_completo,id_patron,id_socio) VALUES 
("50177001V","manoloperezruiz@gmail.com","Manolo Perez Ruiz",1,1);
DESCRIBE barco;
SELECT * FROM persona;

INSERT INTO barco(cuota,id_socio,matricula,nombre,num_amarres)
VALUES(200.12,1,"ESP866KIG","Carabela",3);

