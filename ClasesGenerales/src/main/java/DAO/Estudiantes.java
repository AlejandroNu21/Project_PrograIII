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
import java.util.ArrayList;

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
            
        }
     return listado; 
      
        
    }
}
