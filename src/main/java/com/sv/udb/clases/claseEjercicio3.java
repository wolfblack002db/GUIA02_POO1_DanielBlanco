/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class claseEjercicio3 {
    
    String numpin;

    public claseEjercicio3() {
        this.numpin = numpin;
    }
    public void obtener(String pin){
    numpin = pin;
    }
    
    
    public double comparar(){
    double correcto = 0 ;
        try {
            String contra = "2304";
            if (numpin.equals(contra)) {
                correcto = 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error inesperado: "+ e);
        }
    return correcto;
    }
}
