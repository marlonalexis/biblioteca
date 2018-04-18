package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Editorial;

/**
 *
 * @author mpluas
 */
public class EditorialDAO {
    public static boolean registrar(Editorial e){
        try {
            String sql = "INSERT INTO EDITORIAL(NIT,NOMBRE,TELEFONO,DIRECCION,EMAIL,SITIOWEB)"
                    + "VALUES (?,?,?,?,?,?);";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, e.getNit());
            st.setString(2, e.getNombre());
            st.setString(3, e.getTelefono());
            st.setString(4, e.getDireccion());
            st.setString(5, e.getEmail());
            st.setString(6, e.getSitioweb());
            if (st.executeUpdate() > 0) {
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static ArrayList<Editorial> listar(){
        try {
            String sql = "SELECT * FROM EDITORIAL;";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet resultado = st.executeQuery();
            ArrayList<Editorial> lista = null;
            Editorial edi;
            while (resultado.next()) {                
                edi = new Editorial();
                edi.setNit(resultado.getString("nit"));
                edi.setNombre(resultado.getString("nombre"));
                edi.setTelefono(resultado.getString("telefono"));
                edi.setDireccion(resultado.getString("direccion"));
                edi.setEmail(resultado.getString("email"));
                edi.setSitioweb(resultado.getString("sitioweb"));
                lista.add(edi);
            }
            return lista;
        } catch (SQLException ex) {
            return null;
        }
    } 
}
