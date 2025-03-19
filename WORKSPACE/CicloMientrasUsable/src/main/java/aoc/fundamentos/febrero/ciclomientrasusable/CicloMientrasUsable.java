/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aoc.fundamentos.febrero.ciclomientrasusable;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CicloMientrasUsable {
    // Este programa saca el residuo de una division, basado en restas sucesivas
    public static void main(String[] args) {        
        System.out.println("Bienvenida");
        Scanner teclado = new Scanner(System.in);
        int dividendo;
        int divisor;
        
        System.out.println("Ingresa el dividendo");
        dividendo = teclado.nextInt();
        System.out.println("Ingresa el divisor");
        divisor = teclado.nextInt();
        
        int temporal = dividendo;
        //System.out.println("el valor temporal " + temporal);
        while(temporal > divisor){
            //System.out.println(temporal + " - " + divisor);
            temporal = temporal - divisor;            
            //System.out.println("temporal -> " + temporal);
        }
        
        System.out.println("El residuo es -> " + temporal);
        
        System.out.println("Termino!!!");
    }
}
