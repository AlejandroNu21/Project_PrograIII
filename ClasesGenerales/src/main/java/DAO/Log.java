/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.User;
import com.alejandro.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author COREI5 10TH GEN
 */
public class Log {
    
     ConexionAMYSQL con = new ConexionAMYSQL();
      Connection conexion = con.getConecction();
      
    /**
     *
     * @return
     */
    public ArrayList<User> ListadoUsuario() {
        ArrayList<User> listado = null;

        try {
            listado = new ArrayList<User>();

            CallableStatement cb = conexion.prepareCall("{call SP_S_LOGIN()}");
            ResultSet resultado = cb.executeQuery();

            while (resultado.next()) {
                //Llamar a el objeto de entidades.
                User es = new User();
                es.setUsuario(resultado.getString("Usuario"));
                es.setContra(resultado.getString("Contra"));
                listado.add(es);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return listado;
    
}
       
       public void AddUser(User es){
    
        try {
            CallableStatement cb = conexion.prepareCall("{call SP_S_LOGIN(?,?)}");
            cb.setString("PUser", es.getUsuario());
            cb.setString("PPassword", es.getContra());
            cb.execute();
            
            JOptionPane.showMessageDialog(null, "User Agregado","Mensje sistems",1);
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error "+ex.toString(),"Mensjae sistems",1);
        }
}
       
}