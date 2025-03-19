/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aoc.fundamentos.febrero.ciclomientrasvalidacion;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CicloMientrasValidacion {

    // aca vamos a hacer la validacion de un numero positivo, es decir que 
    // solo deje pasar los positivos!!!
    public static void main(String[] args) {
        System.out.println("Bienvenida");
        Scanner teclado = new Scanner(System.in);
        int numero;
        
        
        System.out.println("Ingrese un numero");
        
        numero = teclado.nextInt();
        
        while(numero < 0) {
            System.out.println("INGRESE POR FAVOR UN NUMERO POSITIVO");
            numero = teclado.nextInt();
        }
                
        System.out.println("Felicitaciones el numero ingresado es positivo");
        
        
        System.out.println("Termino!!!");
    }
}
