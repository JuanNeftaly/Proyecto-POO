-- SCRIP PARA LA BASE 
CREATE TABLE [JUGADOR] (
  [id] INT IDENTITY(1,1) PRIMARY KEY,
  [nombre] VARCHAR(32),
  [nickname] VARCHAR(32)
)
GO

CREATE TABLE [JUEGO_INDIVIDUAL] (
  [id] INT IDENTITY(1,1) PRIMARY KEY,
  [inicio] VARCHAR(32),
  [fin] VARCHAR(32),
  [tiros_dado] INT,
  [avances] INT,
  [retroceso] INT,
  [id_jugador] INT,
  [id_tablero] INT
)
GO

CREATE TABLE [JUEGO_COMPETITIVO] (
  [id] INT IDENTITY(1,1) PRIMARY KEY,
  [inicio] VARCHAR(32),
  [fin] VARCHAR(32),
  [id_tablero] INT
)
GO

CREATE TABLE [JUEGOXJUGADOR] (
  [id_juego] INT,
  [id_jugador] INT,
  [tiros_dado] INT,
  [avance] INT,
  [retroceso] INT,
  [desembaque] INT,
  [rol] VARCHAR(32),
  PRIMARY KEY ([id_juego], [id_jugador])
)
GO

CREATE TABLE [TABLERO] (
  [id] INT PRIMARY KEY,
  [imagen] VARCHAR(32),
  [num_casillas] INT
)
GO

CREATE TABLE [CASILLA] (
  [id] INT PRIMARY KEY,
  [x_inicio] FLOAT,
  [x_fin] FLOAT,
  [y_inicio] FLOAT,
  [y_fin] FLOAT,
  [id_tablero] INT,
  [id_tipo_casilla] INT
)
GO

CREATE TABLE [TIPO_CASILLA] (
  [id] INT PRIMARY KEY,
  [tipo] VARCHAR(32)
)
GO

ALTER TABLE [JUEGO_INDIVIDUAL] ADD FOREIGN KEY ([id_jugador]) REFERENCES [JUGADOR] ([id])
GO

ALTER TABLE [JUEGOXJUGADOR] ADD FOREIGN KEY ([id_jugador]) REFERENCES [JUGADOR] ([id])
GO

ALTER TABLE [JUEGOXJUGADOR] ADD FOREIGN KEY ([id_juego]) REFERENCES [JUEGO_COMPETITIVO] ([id])
GO

ALTER TABLE [JUEGO_COMPETITIVO] ADD FOREIGN KEY ([id_tablero]) REFERENCES [TABLERO] ([id])
GO

ALTER TABLE [JUEGO_INDIVIDUAL] ADD FOREIGN KEY ([id_tablero]) REFERENCES [TABLERO] ([id])
GO

ALTER TABLE [CASILLA] ADD FOREIGN KEY ([id_tablero]) REFERENCES [TABLERO] ([id])
GO

ALTER TABLE [CASILLA] ADD FOREIGN KEY ([id_tipo_casilla]) REFERENCES [TIPO_CASILLA] ([id])
GO
