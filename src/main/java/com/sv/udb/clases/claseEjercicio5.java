/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author Daniel
 */
public class claseEjercicio5 {

    public claseEjercicio5() {
        
    }
    
    public void agregar(String portada, String texto) {
        FileWriter flwriter = null;
        try {
            flwriter = new FileWriter("C:\\Users\\Daniel\\Desktop\\GUIA02_POO1_DanielBlanco\\GUIA02_POO1_DanielBlanco\\src\\main\\resources\\"+ portada +".txt");
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
            bfwriter.write(texto);
            bfwriter.close();
            JOptionPane.showMessageDialog(null, "Archivo Creado.");

        } catch (IOException e) {
                e.printStackTrace();
        } finally {
                if (flwriter != null) {
                        try {
                                flwriter.close();
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
                }
        }
    }
     
      public void eliminar(String documento){
        File file = new File("C:\\Users\\Daniel\\Desktop\\GUIA02_POO1_DanielBlanco\\GUIA02_POO1_DanielBlanco\\src\\main\\resources\\"+ documento);
        try{
            file.delete();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
