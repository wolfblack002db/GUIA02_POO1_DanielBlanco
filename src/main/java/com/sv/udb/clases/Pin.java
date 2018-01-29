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
public class Pin {
    private int numero;
    
    public Pin() {
    }

    public Pin(int num) {
        this.numero = num;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }    
}
