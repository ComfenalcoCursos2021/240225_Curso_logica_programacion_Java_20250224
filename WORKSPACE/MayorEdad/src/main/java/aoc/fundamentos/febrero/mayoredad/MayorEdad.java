/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package aoc.fundamentos.febrero.mayoredad;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MayorEdad {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese la edad por favor");
        edad = teclado.nextInt();
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.println("Termino v1.2!!!");
    }
}
