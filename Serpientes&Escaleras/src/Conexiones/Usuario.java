package Conexiones;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author juanc
 */
public class Usuario {

    public ArrayList<String> obtenerUsuarios() {
        // creamos una lista para guardar los nicknmaes 
        ArrayList<String> nicknames = new ArrayList<>();

        // probamos a conectarnos a la base
        try (Connection conn = Conexion.getConnection(); PreparedStatement stmt = conn.prepareStatement("SELECT nickname FROM JUGADOR"); ResultSet rs = stmt.executeQuery()) {

            // recorremos la tabla en busca de los nicknames 
            while (rs.next()) {
                String nombreUsuario = rs.getString("nickname");
                nicknames.add(nombreUsuario);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.toString());
        }

        return nicknames;
    }

    public int obtenerIdUser(String nickname) {

        PreparedStatement ps;
        ResultSet rs;
        Connection conexion;

        int idObtenido = 0;

        try {

            // conexion
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=TEST;user=sa;password=78201316;encrypt=true;trustServerCertificate=true";
            conexion = DriverManager.getConnection(url);

            // Query
            ps = conexion.prepareStatement("SELECT id FROM JUGADOR WHERE nickname = '" + nickname + "'");
            rs = ps.executeQuery();

            // recorremos
            while (rs.next()) {
                idObtenido = rs.getInt("id");
            }
            
            return idObtenido;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR: " + e.toString());
        } 
        return idObtenido;
    }
}
