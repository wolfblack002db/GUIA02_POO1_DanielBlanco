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
public class claseEjercicio2 {
    
    public void cubos() {
        for (int i = 0; i < 4; i++) {

            for (int a = 0; a < 3; a++) {
                for (int b = 0; b < 4; b++) {
                    for (int x = 0; x < 3; x++) {
                        System.out.print("  ");
                    }
                    for (int y = 0; y < 3; y++) {
                        System.out.print("*");
                    }
                    if (b == 3) {
                        System.out.println();
                    }
                }

            }

            for (int i2 = 0; i2 < 3; i2++) {
                for (int a2 = 0; a2 < 4; a2++) {
                    for (int x = 0; x < 3; x++) {
                        System.out.print("*");
                    }
                    for (int y = 0; y < 3; y++) {
                        System.out.print("  ");
                    }
                    if (a2 == 3) {
                        System.out.println();
                    }
                }

            }
        }
    }
    
    public void asterisco() {
        System.out.println();
        for (int i3 = 0; i3 < 4; i3++) {

            for (int x = 0; x < 4; x++) {
                System.out.print("  ");
                System.out.print("* ");
                if (x == 3) {
                    System.out.println();
                }
            }

            for (int y = 0; y < y; y++) {
                System.out.print("* ");
                System.out.print("  ");
                if (y == 3) {
                    System.out.println();
                }

            }
        }
    }
    
            public void piramidenu() {
        System.out.println();
        int cont = 0;

        for (int i4 = 1; i4 <= 10; i4++) {
            System.out.println(" ");

            cont = (2 * i4) - 1;

            for (int s = 1; s <= (10 - i4); s++) {
                System.out.print(" ");
            }

            for (int u = i4; u <= cont; u++) {
                System.out.print(u % 10);
            }

            for (int m = (cont - 1); m >= i4; m--) {
                System.out.print(m % 10);
            }
        }
    }
}
