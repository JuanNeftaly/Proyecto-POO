-- JUGADORES 
-- PARA LA BASE
INSERT INTO JUGADOR (nombre, nickname) VALUES ('Juan', 'Snowboot')
INSERT INTO JUGADOR (nombre, nickname) VALUES ('Pepe', 'Weider')
INSERT INTO JUGADOR (nombre, nickname) VALUES ('Lola', 'Pollita')
INSERT INTO JUGADOR (nombre, nickname) VALUES ('Juan', 'Milf_Hunter777')
INSERT INTO JUGADOR (nombre, nickname) VALUES ('Florence', 'Pepelota')
GO

-- TABLERO
INSERT INTO TABLERO (id, imagen, num_casillas) VALUES (1,'Tablero 1', 30)
INSERT INTO TABLERO (id, imagen, num_casillas) VALUES (2,'Tablero 2', 50)
GO

-- TIPO CASILLAS 
INSERT INTO TIPO_CASILLA (id,tipo) VALUES (1,'Casilla Normal');
INSERT INTO TIPO_CASILLA (id,tipo) VALUES (2,'Escalera');
INSERT INTO TIPO_CASILLA (id,tipo) VALUES (3,'Serpiente');
GO

-- CASILLAS 
-- TABLERO 1
-- PRIMERA FILA
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (1,75,355,75,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (2,215,355,215,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (3,355,355,355,124,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (4,495,355,495,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (5,635,355,635,278,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,775,355,1,1);
-- SEGUNDA FILA
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (7,775,278,775,278,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (8,635,278,635,278,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (9,495,278,495,278,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (10,355,278,355,278,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (11,215,278,215,47,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (12,75,278,75,278,1,1);
-- TERCERA FILA
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (13,75,201,75,201,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (14,215,201,215,201,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (15,355,201,355,201,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (16,495,201,495,201,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (17,635,201,495,355,1,3);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (18,775,201,775,201,1,1);
-- CUARTA FILA 
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (19,775,124,775,278,1,3);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (20,635,124,635,47,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (21,495,124,495,278,1,3);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (22,355,124,355,124,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (23,215,124,215,124,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (24,75,124,75,124,1,1);
-- QUINTA FILA
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (25,75,47,75,47,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (26,215,47,215,47,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (27,355,47,75,355,1,3);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (28,495,47,495,47,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (29,635,47,495,47,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (30,775,47,775,47,1,1);
GO

-- TABLERO 2
-- PRIMERA FILA
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (1,71,363,71,363,2,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (2,215,355,215,355,2,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (3,355,355,355,124,2,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (4,495,355,495,355,2,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (5,635,355,635,278,2,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,775,355,2,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,775,355,2,1);
-- SEGUNDA FILA
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (1,75,355,75,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (2,215,355,215,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (3,355,355,355,124,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (4,495,355,495,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (5,635,355,635,278,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,775,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,775,355,1,1);
-- TERCERA FILA
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (1,75,355,75,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (2,215,355,215,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (3,355,355,355,124,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (4,495,355,495,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (5,635,3545,635,278,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,775,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,475,355,1,1);
-- CUARTA FILA
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (1,75,355,75,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (2,215,355,215,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (3,355,35,355,24,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (4,495,355,495,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (5,635,355,635,278,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,775,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,775,355,1,1);
-- QUINTA FILA
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (1,75,355,75,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (2,215,355,215,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (3,355,55,355,124,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (4,495,355,495,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (5,635,35,655,278,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,775,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,775,355,1,1);
-- SEXTA FILA
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (1,75,355,75,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (2,215,355,215,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (3,355,355,355,124,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (4,495,355,495,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (5,635,355,635,278,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,775,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,775,355,1,1);
-- SEPTIMA FILA
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (1,75,355,75,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (2,215,355,215,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (3,355,355,355,124,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (4,495,355,495,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (5,635,355,635,278,1,2);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,775,355,1,1);
INSERT INTO CASILLA (id,x_inicio,x_fin,y_inicio,y_fin,id_tablero,id_tipo_casilla)
			VALUES (6,775,355,775,355,1,1);

-- JUEGO INDIVIDUAL
INSERT INTO JUEGO_INDIVIDUAL (inicio, fin, tiros_dado, avances, retroceso, id_jugador, id_tablero) 
			VALUES ('2023-06-29 21:03:17.869882300', '2023-06-29 21:04:10.670931800', 10,2,0,1,1)
INSERT INTO JUEGO_INDIVIDUAL (inicio, fin, tiros_dado, avances, retroceso, id_jugador, id_tablero) 
			VALUES ('2023-06-29 21:08:42.968542', '2023-06-29 21:09:29.183157', 10,2,0,2,1)
GO

-- JUEGO COMPETITIVO
INSERT INTO JUEGO_COMPETITIVO (inicio, fin, id_tablero) VALUES ('2023-06-29 21:03:17.869882300', '2023-06-29 21:04:10.670931800', 1)
GO
