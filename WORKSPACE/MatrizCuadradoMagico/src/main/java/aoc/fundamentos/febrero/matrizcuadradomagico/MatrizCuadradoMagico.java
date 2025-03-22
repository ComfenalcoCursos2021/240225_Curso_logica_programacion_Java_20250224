/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package aoc.fundamentos.febrero.matrizcuadradomagico;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MatrizCuadradoMagico {

    public static void main(String[] args) {
        System.out.println("Bienvenida");
        Scanner teclado = new Scanner(System.in);
        int lado;

        System.out.println("Ingrese el tamaño del cuadrado magico");
        lado = teclado.nextInt();

        while (lado % 2 == 0 || lado < 3) {
            if (lado % 2 == 0) {
                System.out.println("Ingrese un valor que sea impar");
            }
            if (lado < 3) {
                System.out.println("Ingrese un valor mayor o igual a 3");
            }
            lado = teclado.nextInt();
        }

        int[][] cuadrado = new int[lado][lado];

        int columna = lado / 2;
        int divisor = 2;
        float columnaDecimal = (float) lado / divisor;
        float columnaDecimalF = lado / (divisor * 1.0f);

        System.out.println("COLUMNA -> " + columna);
        System.out.println("COLUMNA decimal-> " + columnaDecimal);
        System.out.println("COLUMNA decimal-> " + columnaDecimalF);

        int fila = 0;

        cuadrado[fila][columna] = 1;

        int numeroFinal = lado * lado;
        for (int i = 1; i <= numeroFinal; i++) {
            cuadrado[fila][columna] = i;
            int filaT = fila - 1;
            int columnaT = columna + 1;

            if (filaT < 0) {
                filaT = lado - 1;
            }
            if (columnaT >= lado) {
                columnaT = 0;
            }

            for (int j = 0; j < lado; j++) {
                for (int k = 0; k < lado; k++) {
                    System.out.print(cuadrado[j][k] + "\t");
                }
                System.out.println("");
            }
            System.out.println("=====================================");

            if (cuadrado[filaT][columnaT] == 0) {
                fila = filaT;
                columna = columnaT;
            } else {
                fila = fila + 1 ;
            }

        }
        System.out.println("Termino!");
    }

}
