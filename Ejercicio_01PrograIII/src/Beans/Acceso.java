/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Pojos.Estudiante;
import Service.IEstudiante;

/**
 *
 * @author COREI5 10TH GEN
 */
public class Acceso implements IEstudiante{

    @Override
    public int Acess(Estudiante es ) {
       if (es.getUser().equals("Alejandro") && es.getPassword().equals("123456")){
           return 0;
       }else{
        return 1;
    } 
    
       
        
    

   
    
    }
}
