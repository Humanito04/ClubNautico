DROP DATABASE IF EXISTS clubnautico;
CREATE DATABASE clubnautico;
USE clubnautico;

DESCRIBE persona;
INSERT INTO persona(dni, email, nombre_completo, id_patron, id_socio) VALUES 
	('33646341D', 'manolo@gmail.com', 'Manolo Ruiz Sánchez', 1, 1),
    ('80201555A', 'julian@gmail.com', 'Julian Ramirez Carmona', 2, NULL),
    ('79984148S', 'alfredo@gmail.com', 'Alfredo Vargas Campos', 3, 3),
    ('74538782Z', 'teresa@gmail.com', 'Teresa Peña Burgos', NULL, 4),
    ('26564544G', 'juancarlos@gmail.com', 'Juan Carlos Campos Gutiérrez', 5, 5);
    
SELECT * FROM persona;

DESCRIBE salida;
INSERT INTO salida (destino, fecha_hora_salida, id_patron, persona_id) VALUES
	('Huelva', '2024-05-31 21:30:00', 1, 1),
    ('Barcelona', '2024-06-01 12:00:00', 2, 2),
    ('A Coruña', '2024-07-06 17:15:00', 3, 3),
    ('Lisboa', '2024-07-26 22:45:00', 3, 3),
    ('Cadiz', '2024-08-31 07:55:00', 5, 5);

SELECT * FROM salida;

DESCRIBE barco;
INSERT INTO barco (cuota, id_socio, matricula, nombre, num_amarres, persona_id, salida_id_salida) VALUES
	(19495, 1, '7a-CA-2-230-24', 'Astoria', 3, 1, 1),
    (367956, 3, '9f-BA-2-235-24', 'Santa María', 2, 2, 2),
    (39900, 3, '7a-HU-2-532-24', 'Carabela', 3, 3, 3),
    (21995, 4, '7a-LC-2-453-24', 'Titanic', 3, 3, 4),
    (155000, 5, '7a-LI-2-245-24', 'Pinta' , 2, 5, 5);
    
SELECT * FROM barco;