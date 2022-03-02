/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alejandro.BD;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author COREI5 10TH GEN
 */
public class ConexionAMYSQL {
    
    private static Connection ConnectionBD = null;
    public Connection getConecction (){
    try {
        
        String url = "jdbc:mysql://localhost:3306/Clase";
        String user = "Nuñez";
        String password ="Alexxkr2120sv";
        
        ConnectionBD=DriverManager.getConnection(url,user,password);
        System.out.println("Conexion exitosa");
        
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error"+e.toString());
        
    } 
        return ConnectionBD;
    }
    
    
}
