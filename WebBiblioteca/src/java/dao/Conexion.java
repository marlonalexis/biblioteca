package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mpluas
 */
public class Conexion {
    public static Connection conectar(){ 
        try {
        //public para acceder de cualquier lado y static para no crear un objeto para llamar conectar
        Class.forName("com.mysql.jdbc.Driver"); //Indicando que driver vamos ah enlazar
        String url = "jdbc:mysql://localhost:3306/biblioteca";
        String user = "root";
        String pass = "";
        return DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            return null;
        } catch (SQLException ex) {
            return null;
        }
    }
    
}
