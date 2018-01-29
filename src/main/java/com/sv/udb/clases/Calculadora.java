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
public class Calculadora {
    String memoria1;
    String memoria2;

    public Calculadora() {
    }

    public Calculadora(String memoria1, String memoria2) {
        this.memoria1 = memoria1;
        this.memoria2 = memoria2;
    }

    public String getMemoria1() {
        return memoria1;
    }

    public void setMemoria1(String memoria1) {
        this.memoria1 = memoria1;
    }

    public String getMemoria2() {
        return memoria2;
    }

    public void setMemoria2(String memoria2) {
        this.memoria2 = memoria2;
    }
    
    
}
