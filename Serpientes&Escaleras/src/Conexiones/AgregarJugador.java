package Conexiones;
// aprobado

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author juanc
 */
public class AgregarJugador {
    
    static public void agregarUsuario (String name, String nickname) throws SQLException {
        
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
            String consulta = "INSERT INTO JUGADOR VALUES (?,?)";

            sentencia = conexion.prepareStatement(consulta);

            // asignando nombre
            sentencia.setString(1, name);

            // asignando nickname
            sentencia.setString(2, nickname);

            int resultado = sentencia.executeUpdate();

            if (resultado == 0) {
                JOptionPane.showMessageDialog(null, "Fallo al registrar Jugador");
            } else {
                JOptionPane.showMessageDialog(null, "Jugador insertado con exito");
            }

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
