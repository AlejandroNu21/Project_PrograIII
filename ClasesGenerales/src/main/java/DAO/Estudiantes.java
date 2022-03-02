/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entidades.Estudiante;
import com.alejandro.BD.ConexionAMYSQL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author COREI5 10TH GEN
 */
public class Estudiantes {
      ConexionAMYSQL con = new ConexionAMYSQL();
      Connection conexion = con.getConecction();
       
    public ArrayList <Estudiante> ListadoEstudiantes (){
         ArrayList<Estudiante> listado = null;
       
        
        try {
           listado  = new ArrayList<Estudiante>();

           
           CallableStatement cb = conexion.prepareCall("select * from Estudiante");
           ResultSet resultado = cb.executeQuery();
           
           
           while (resultado.next()){
               //Llamar a el objeto de Entidad
               Estudiante es = new Estudiante ();
               es.setNombre(resultado.getString("Nombre"));
               es.setApellido(resultado.getString("Apellido"));
               listado.add(es);
               
           }
           
           
   
        }catch (Exception e){
            System.out.println(e.toString());
        }
        
         return listado; 
      
        
    }
    
    public void AddEstudiantes(Estudiante es){
          try {
              CallableStatement cb = conexion.prepareCall("insert into "
                      + "estudiante (Nombre,Apellido) values('"+es.getNombre()+"','"+es.getApellido()+"')");
              cb.execute();
              
              JOptionPane.showMessageDialog(null, "Persona Agregada","Mensaje sistems",1);
              
          } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error"+ex.toString(),"Mensaje sistems",1);
          }
        
        
    }

    public void AddEstudiante(Estudiante es) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
