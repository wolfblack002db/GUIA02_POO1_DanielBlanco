/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author Daniel
 */
public class claseEjercicio4 {

    public claseEjercicio4() {
        
    }
    
    public String Calculadora(String memoria1,String memoria2,String Signo){
    double resul=0.0;
    String respuesta;
    
    switch (Signo){
        case "+":
                resul=Double.parseDouble(memoria1)+Double.parseDouble(memoria2);
                break;
        case "-":
                resul=Double.parseDouble(memoria1)-Double.parseDouble(memoria2);
                break;
        case "/":
                resul=Double.parseDouble(memoria1)/Double.parseDouble(memoria2);
                break;
        case "*":
                resul=Double.parseDouble(memoria1)*Double.parseDouble(memoria2);
                break;
    }
    respuesta = String.valueOf(resul);
    return respuesta;
    }
    
    public boolean punto(String cadena){
    boolean resul=false;
    
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i+1).equals(".")) {
                resul=true;
                break;
            }
        }
    return resul;
    }
}
