/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class claseEjercicio1 {
    List<Moneda> listMone;
    
    public claseEjercicio1() {
        this.listMone = new ArrayList<>();
    }
    
    public void agregar(int cant, double deno){
        Moneda objeMone = new Moneda(cant, deno);
        this.listMone.add(objeMone);
      //  this.listMone.add(new Moneda(cant, deno));---> lo mismo pero en una lista
    }
    
    public double calcular(){
        double resp=0;
        try{
            for(Moneda temp : this.listMone)
            {
                resp += (temp.getCant() * temp.getDeno());
            }       
        }
        catch(Exception ex)
        {
            System.out.println("Ha ocurrido un error: " + ex);
        }
    return resp;
    }
}
