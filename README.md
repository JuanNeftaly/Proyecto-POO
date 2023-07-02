[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/x6RO2a9L)
# Proyecto final Programación Orientada a Objetos

# Serpientes & Escaleras
La aplicación de Serpientes & Escaleras es un programa desarrollado en Java, en el entorno de desarrollo de NetBeans, siguiendo la lógica de programación orientada a objetos. La aplicación ofrece poder jugar al clásico juego de serpientes y escaleras en un ambiente de ventanas de Java, ya sea en modalidad individual o en competencia con otro jugador.

## Primeros pasos
El juego cuenta con su propia base de datos para implementar el funcionamiento necesario de guardado de registros, asi que como primer paso para evitar problemas sugerimos ejecutar los dos archivos de extensión .sql que se encontraran fuera de la carpeta del proyecto de Netbeans, esto con el fin de evitar inconvenientes al momento de guardar datos en la base de datos.

![image](https://github.com/II-CLASS/proyecto-final-grupo-07/assets/116671548/0e469e60-4768-4ba3-ab42-0ae146121136)


## Funcionamiento
Al ejecutar el programa por primera vez, podremos ver la ventana de inicio, la cual es el menu que contiene las principales funcionalidades del programa, el juego individual y competencia, un boton que ofrece todas las consultas necesarias y un boton de salida.

![image](https://github.com/II-CLASS/proyecto-final-grupo-07/assets/116671548/db2d03b2-28e1-45e6-92db-f36f463f5f67)


Al presionar ya sea la modalidad de un jugador o de dos jugadores, esta nos redirigirá  a la ventana de configuración, en la cual, nosotros como usuarios podemos seleccionar el jugador que deseamos utilizar, asi como la ficha que nos representará en el juego, la cual puede ser con el color que se desee en la escala de RGB. 

![image](https://github.com/II-CLASS/proyecto-final-grupo-07/assets/116671548/327fdf44-8527-4ea4-8ba8-39280e45a5f5)


En la ventana de configuracion existe un boton para agregar un nuevo jugador a la base de datos, este boton nos abre una nueva ventana con datos que tendremos que rellenar para que estos se guarden en la base de datos. Para que el nuevo jugador que registramos a la base de datos este en la seleccion de los ComboBox donde podemos elegir a los jugadores, debemos presionar el boton de Actualizar en la ventana configuración, esto traera el Nickname del jugador que deseamos utilizar

![image](https://github.com/II-CLASS/proyecto-final-grupo-07/assets/116671548/d122feae-bb4d-43aa-b49c-5e0b6bb752a9)


Podemos seleccionar dos tableros diferentes, en la ventana configuración podemos previsualizar los dos tableros existentes para los juegos. Cuando estas ventanas se activen ya sea en modo un jugador o modo dos jugadores, se habilitaran botones de dado para los jugadores, los cuales nos ayudarán a mover nuestra ficha dentro del tablero seleccionado. 

![image](https://github.com/II-CLASS/proyecto-final-grupo-07/assets/116671548/71ca3a88-7642-478f-9edd-b5f5b838d13a)

![image](https://github.com/II-CLASS/proyecto-final-grupo-07/assets/116671548/3d1f0dff-6650-4393-8ad9-85125ba11431)


Al finalizar la partida, los datos serán guardados en la base de datos, y saltará una ventana con las estadisticas de el ganador

![image](https://github.com/II-CLASS/proyecto-final-grupo-07/assets/116671548/0568952d-199a-430f-830b-9a7e23004a74)


Volviendo al menu, ahora veremos las funcionalidades de consultas, al presionar el boton se activa una ventana con botones que nos llevan a las diferentes funcionalidades.

![image](https://github.com/II-CLASS/proyecto-final-grupo-07/assets/116671548/5b8ee905-7cb9-4f2c-8616-8246d03e5aa3)


### Lista de Jugadores 
Al presionar el boton de consulta, devuelve a todos los jugadores registrados en la tabla, el nombre del propietario y el nickname con el cual fue registrado 

![image](https://github.com/II-CLASS/proyecto-final-grupo-07/assets/116671548/748322ff-ac16-41f7-b6fb-8fdbb8ef8ef1)


### Juegos PVE 
Al presionar el boton de consulta, devuelve en base al nickname seleccionado, todas las partidas en solitario que realizo dicho jugador

![image](https://github.com/II-CLASS/proyecto-final-grupo-07/assets/116671548/9f3e5cfe-1a74-432c-ac1d-289655fe50ba)


### Juegos PVP
Al presionar el boton de consulta, devuelve en base al nickname seleccionado, todas las partidas en competencia que realizo dicho jugador

![image](https://github.com/II-CLASS/proyecto-final-grupo-07/assets/116671548/d7625ea2-7b2a-4c0b-b9bc-f7021c993998)


### Mejores jugadores 
Al presionar el boton de consulta, devuelve el top 3 de mejores jugadores en competencia

![image](https://github.com/II-CLASS/proyecto-final-grupo-07/assets/116671548/2cc62940-9744-43b5-bcda-87035cb36948)


### Tableros
Al presionar el boton de consulta, se muestran datos referentes a los tableros registrados en la base de datos
![image](https://github.com/II-CLASS/proyecto-final-grupo-07/assets/116671548/88d2ea1b-b13c-4328-895a-94f1fe36bd05)




## Integrantes

|  **Nombre**  | **Carnet** |
|:-------------|:----------:|
| Florence Marcela Cruz Ventura |  00361222 |
| Gustavo Jose Melgar Lopez |  00181918  |
| Juan Neftaly Castellanos Hernández |  00182222  |
