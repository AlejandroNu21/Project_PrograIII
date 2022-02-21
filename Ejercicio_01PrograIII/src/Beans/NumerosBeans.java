/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Pojos.Num;
import Service.INumero;

/**
 *
 * @author COREI5 10TH GEN
 */
public class NumerosBeans implements INumero{
    
    @Override
    public String PositivosYNegativos(Num num){
        
        if (num.getNum1() > 0){
            System.out.println("Elnumero 1 es positivo");
        } else {
            System.out.println("El numero 1 es negativo");
        }
        
        if (num.getNum2() > 0){
            System.out.println("El numero 2 es positivo");
        } else {
            System.out.println("El numero 2 es negativo");
        }
        return null;
        
    }
    
}
