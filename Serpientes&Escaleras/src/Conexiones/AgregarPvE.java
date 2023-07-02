package Conexiones;
// aprobado

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author juanc
 */
public class AgregarPvE {
    
    static public void agregarDatos_Juego(String inicio, String fin, int tiros_dado, int avances, int retroceso, int jugador, int tablero){
        
        // creacion de las variables 
        Connection conexion = null;
        PreparedStatement sentencia = null;

        // manejo de excepciones 
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // revisar la base de datos 
            String cadenita = "jdbc:sqlserver://localhost:1433;databaseName=TEST;user=sa;password=78201316;encrypt=true;trustServerCertificate=true";

            conexion = DriverManager.getConnection(cadenita);

            // cosas del prepareStatement
            String consulta = "INSERT INTO JUEGO_INDIVIDUAL(inicio, fin, tiros_dado, avances, retroceso, id_jugador, id_tablero) VALUES (?,?,?,?,?,?,?)";

            sentencia = conexion.prepareStatement(consulta);

            // asignando edad
            sentencia.setString(1, inicio);
            sentencia.setString(2, fin);
            sentencia.setInt(3, tiros_dado);
            sentencia.setInt(4, avances);
            sentencia.setInt(5, retroceso);
            sentencia.setInt(6, jugador);
            sentencia.setInt(7, tablero);
            
            sentencia.executeUpdate();
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.toString());
        } finally {

            try {
                conexion.close();
                sentencia.close();
            } catch (SQLException exception) {
                System.out.println("Error al cerrar la Base de Datos");
            }
        }
    }
}
