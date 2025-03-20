/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package aoc.fundamentos.febrero.vectoresordenamientoburbuja;

/**
 *
 * @author DELL
 */
public class VectoresOrdenamientoBurbuja {

    public static void main(String[] args) {
        System.out.println("Bienvenida");

        int[] a = new int[10];
        a[0] = 5;
        a[1] = 45;
        a[2] = 10;
        a[3] = 1;
        a[4] = 21;
        a[5] = 16;
        a[6] = 13;
        a[7] = 7;
        a[8] = 16;
        a[9] = 16;
        

        for (int i = 0; i < 10; i = i + 1) {
            for (int j = i + 1; j < 10; j = j + 1) {
                if (a[i] < a[j]) {
                    int temporal = a[j];
                    a[j] = a[i];
                    a[i] = temporal;
                }
            }
        }
        
        for (int i = 0; i < 10; i = i + 1) {
            System.out.println(a[i]);
        }

        System.out.println("Termino");
    }
}
