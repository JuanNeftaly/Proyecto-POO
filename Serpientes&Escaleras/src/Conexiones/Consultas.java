package Conexiones;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author juanc
 */
public class Consultas {

    // para consultar jugadores 
    static public void consultarJugadores(int columnas, JTable tabla) {

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        Connection conexion;

        // manejo de excepciones
        try {

            // conexion
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=TEST;user=sa;password=78201316;encrypt=true;trustServerCertificate=true";
            conexion = DriverManager.getConnection(url);

            // Query
            ps = conexion.prepareStatement("""
                                           SELECT J.nombre, J.nickname 
                                           FROM JUGADOR J""");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            // para guardar datos 
            DefaultTableModel model = new DefaultTableModel();
            
            model.addColumn("Nombre");
            model.addColumn("Nickname");
            
            tabla.setModel(model);
            
            String[] fila = new String[2];
            while (rs.next()) {
                
                fila[0] = rs.getString("Nombre");
                fila[1] = rs.getString("Nickname");
                
                model.addRow(fila);
            }
            

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    
    static public void consultarTableros(int columnas, DefaultTableModel tabla) {
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        Connection conexion;

        // manejo de excepciones
        try {
            
            // conexion
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=TEST;user=sa;password=78201316;encrypt=true;trustServerCertificate=true";
            conexion = DriverManager.getConnection(url);

            // Query
            ps = conexion.prepareStatement("""
                                           SELECT T.imagen, TC.tipo, CONCAT(CONCAT(C.x_inicio , ','),y_inicio), CONCAT(CONCAT(C.x_fin , ','),y_fin) 
                                           \t\tFROM TABLERO T
                                           \t\tINNER JOIN CASILLA C
                                           \t\tON T.id = C.id_tablero
                                           \t\tINNER JOIN TIPO_CASILLA TC
                                           \t\tON TC.id = C.id_tipo_casilla;""");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            // para jalar los datos 
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tabla.addRow(fila);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    

    // para consultar los top 3 
    static public void consultarTOP(int columnas, DefaultTableModel tabla) {
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        Connection conexion;

        // manejo de excepciones
        try {

            // conexion
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=TEST;user=sa;password=78201316;encrypt=true;trustServerCertificate=true";
            conexion = DriverManager.getConnection(url);

            // Query
            ps = conexion.prepareStatement("""
                                           SELECT TOP 3 J.nombre, J.nickname,JC.inicio, JC.fin, JJ.tiros_dado
                                           FROM JUGADOR J 
                                           INNER JOIN JUEGOXJUGADOR JJ
                                           	ON J.id = JJ.id_jugador
                                           INNER JOIN JUEGO_COMPETITIVO JC
                                           	ON JC.id = JJ.id_juego
                                           WHERE JJ.rol = 'Ganador'""");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            // para jalar los datos 
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tabla.addRow(fila);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    static public void consultarPVE(String nickname, int columnas, DefaultTableModel tabla) {

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        Connection conexion;

        // manejo de excepciones
        try {

            // conexion
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=TEST;user=sa;password=78201316;encrypt=true;trustServerCertificate=true";
            conexion = DriverManager.getConnection(url);

            // Query
            ps = conexion.prepareStatement("""
                                           SELECT J.nombre, J.nickname, JI.inicio, JI.fin,JI.tiros_dado, JI.avances, JI.retroceso
                                           FROM JUGADOR J
                                           \tINNER JOIN JUEGO_INDIVIDUAL JI
                                           \tON J.id = JI.id_jugador
                                           WHERE nickname = '""" + nickname + "'");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            // para jalar los datos 
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tabla.addRow(fila);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    static public void consultarPVP(String nickname, int columnas, DefaultTableModel tabla) {

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        Connection conexion;

        // manejo de excepciones
        try {

            // conexion
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String url = "jdbc:sqlserver://localhost:1433;databaseName=TEST;user=sa;password=78201316;encrypt=true;trustServerCertificate=true";
            conexion = DriverManager.getConnection(url);

            // Query
            ps = conexion.prepareStatement("""
                                           SELECT J.nombre, J.nickname, JJ.rol, JC.inicio, JC.fin, JJ.tiros_dado, JJ.avance, JJ.retroceso
                                           FROM JUGADOR J 
                                           INNER JOIN JUEGOXJUGADOR JJ
                                           \tON J.id = JJ.id_jugador
                                           INNER JOIN JUEGO_COMPETITIVO JC
                                           \tON JC.id = JJ.id_juego
                                           WHERE nickname = '""" + nickname + "'\n"
                    + "ORDER BY tiros_dado ASC;");

            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            // para jalar los datos 
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                tabla.addRow(fila);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.toString());
        }
    }

}
