/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package aoc.fundamentos.febrero.tablasmultiplicar;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TablasMultiplicar {

    public static void main(String[] args) {
        System.out.println("Bienvenida");
        Scanner teclado = new Scanner(System.in);
        int tabla;

        System.out.println("Ingrese el valor al cual le calcularemos la tabla de multiplicar");
        tabla = teclado.nextInt();
        System.out.println("");
        for (int i = 1; i <= 10; i = i + 1) {
            int resultado = tabla * i;
            System.out.println(tabla + " x " + i + " = " + resultado);
        }

        System.out.println("Termino!!!");
    }
}
