CREATE DATABASE clubnautico;
USE clubnautico;


-- Crear tabla persona
CREATE TABLE persona (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    dni VARCHAR(20) NOT NULL,
    email VARCHAR(255),
    nombre_completo VARCHAR(255),
    id_patron INT,
    id_socio INT,
    UNIQUE (dni)
);

-- Insertar datos en la tabla persona
INSERT INTO persona(dni, email, nombre_completo, id_patron, id_socio) VALUES 
    ('33646341D', 'manolo@gmail.com', 'Manolo Ruiz Sánchez', 1, 1),
    ('80201555A', 'julian@gmail.com', 'Julian Ramirez Carmona', 2, 3),
    ('79984148S', 'alfredo@gmail.com', 'Alfredo Vargas Campos', 5, 3),
    ('74538782Z', 'teresa@gmail.com', 'Teresa Peña Burgos', 3, 4),
    ('26564544G', 'juancarlos@gmail.com', 'Juan Carlos Campos Gutiérrez', 5, 5);

-- Consultar datos de la tabla persona
SELECT * FROM persona;

-- Crear tabla salida
CREATE TABLE salida (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    destino VARCHAR(255),
    fecha_hora_salida DATETIME,
    id_patron INT,
    persona_id INT,
    FOREIGN KEY (persona_id) REFERENCES persona(id)
);

-- Insertar datos en la tabla salida
INSERT INTO salida (destino, fecha_hora_salida, id_patron, persona_id) VALUES
    ('Huelva', '2024-05-31 21:30:00', 1, 1),
    ('Barcelona', '2024-06-01 12:00:00', 2, 2),
    ('A Coruña', '2024-07-06 17:15:00', 3, 3),
    ('Lisboa', '2024-07-26 22:45:00', 3, 3),
    ('Cadiz', '2024-08-31 07:55:00', 5, 5);

-- Consultar datos de la tabla salida
SELECT * FROM salida;

-- Crear tabla barco
CREATE TABLE barco (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    cuota DECIMAL(10, 2),
    id_socio INT,
    matricula VARCHAR(50),
    nombre VARCHAR(255),
    num_amarres INT,
    persona_id INT,
    salida_id INT,
    FOREIGN KEY (persona_id) REFERENCES persona(id),
    FOREIGN KEY (salida_id) REFERENCES salida(id)
);

-- Insertar datos en la tabla barco
INSERT INTO barco (cuota, id_socio, matricula, nombre, num_amarres, persona_id, salida_id) VALUES
    (19495, 1, '7a-CA-2-230-24', 'Astoria', 3, 1, 1),
    (367956, 3, '9f-BA-2-235-24', 'Santa María', 2, 2, 2),
    (39900, 3, '7a-HU-2-532-24', 'Carabela', 3, 3, 3),
    (21995, 4, '7a-LC-2-453-24', 'Titanic', 3, 3, 4),
    (155000, 5, '7a-LI-2-245-24', 'Pinta' , 2, 5, 5);

-- Consultar datos de la tabla barco
SELECT * FROM barco;

