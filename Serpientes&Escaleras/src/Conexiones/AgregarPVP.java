package Conexiones;
// aprobado

import java.sql.*;

/**
 * @author juanc
 */
public class AgregarPVP {

    // para consultar el ultimo id 
    static public int consultarID() {
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        Connection conexion;

        int idObtenido = 0;

        // manejo de excepciones
        try {

            // conexion
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=TEST;user=sa;password=78201316;encrypt=true;trustServerCertificate=true";
            conexion = DriverManager.getConnection(url);

            // Query
            ps = conexion.prepareStatement("""
                                           SELECT id 
                                           FROM JUEGO_COMPETITIVO
                                           ORDER BY id ASC;""");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();

            // recorremos
            while (rs.next()) {
                idObtenido = rs.getInt("id");
            }
            
            return idObtenido;

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.toString());
        }
        return idObtenido;
    }

    // para agregar a la tabla Juego competitivo
    static public void agregarJuego_Competitivo(String inicio, String fin, int id_tablero) {

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
            String consulta = "INSERT INTO JUEGO_COMPETITIVO(inicio, fin, id_tablero) VALUES (?,?,?)";

            sentencia = conexion.prepareStatement(consulta);

            // asignando edad
            sentencia.setString(1, inicio);
            sentencia.setString(2, fin);
            sentencia.setInt(3, id_tablero);

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

    // para agregar a la tabla juegoXjugador
    static public void agregarJuegoXJugador(int id_juego, int id_jugador, int tiros_dado, int avance, int retroceso, int desembanque, String rol) {
        // creacion de las variables 
        Connection conexion = null;
        PreparedStatement st = null;

        // manejo de excepciones 
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // revisar la base de datos 
            String cadenita = "jdbc:sqlserver://localhost:1433;databaseName=TEST;user=sa;password=78201316;encrypt=true;trustServerCertificate=true";

            conexion = DriverManager.getConnection(cadenita);

            // cosas del prepareStatement
            String consulta = """
                              INSERT INTO JUEGOXJUGADOR(id_juego, id_jugador, tiros_dado, avance, retroceso, desembaque, rol) 
                              \t\t\t\t\tVALUES (?,?,?,?,?,?,?)""";

            st = conexion.prepareStatement(consulta);

            // asignando edad
            st.setInt(1, id_juego);
            st.setInt(2, id_jugador);
            st.setInt(3, tiros_dado);
            st.setInt(4, avance);
            st.setInt(5, retroceso);
            st.setInt(6, desembanque);
            st.setString(7, rol);

            st.executeUpdate();
  
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.toString());
        } finally {

            try {
                conexion.close();
                st.close();
            } catch (SQLException exception) {
                System.out.println("Error al cerrar la Base de Datos");
            }
        }
    }
}
