package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Categoria;

/**
 *
 * @author mpluas
 */
public class CategoriaDAO {
    public static boolean registrar(Categoria c){
        try {
            String sql = "INSERT INTO CATEGORIA(NOMBRE)"
                    + "VALUES (?);";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, c.getNombre());
            if (st.executeUpdate() > 0) {
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static ArrayList<Categoria> listar(){
        try {
            String sql = "SELECT * FROM CATEGORIA;";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet resultado = st.executeQuery();
            ArrayList<Categoria> lista = null;
            Categoria cat;
            while (resultado.next()) {                
                cat = new Categoria();
                cat.setId(resultado.getInt("id"));
                cat.setNombre(resultado.getString("nombre"));
                lista.add(cat);
            }
            return lista;
        } catch (SQLException ex) {
            return null;
        }
    }
}
