package Conexiones;
// aprobado

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author juanc
 */
public class Conexion {
    
    // metodo para conectar a la base 
    public static Connection getConnection() {
        String URL = "jdbc:sqlserver://localhost:1433;databaseName=TEST;user=sa;password=78201316;encrypt=true;trustServerCertificate=true";
        
        // manejo de excepciones 
        try {
            Connection con = DriverManager.getConnection(URL);
            return con;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.toString());
            return null;
        }
    }
}
