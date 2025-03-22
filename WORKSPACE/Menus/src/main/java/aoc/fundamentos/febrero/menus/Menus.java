/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aoc.fundamentos.febrero.menus;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Menus {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("bienvenido");
        Scanner teclado = new Scanner(System.in);
        
        int opcion = -1;
        
        while(opcion != 9){
            System.out.println("**********************************");
            System.out.println("*          bienvenido            *");
            System.out.println("*     1. mensaje 1               *");
            System.out.println("*     2. mensaje 2               *");
            System.out.println("*     9. salir                   *");
            System.out.println("**********************************");
            opcion = teclado.nextInt();
            if(opcion == 1) {
                System.out.println("ud eligio la opcion 1");
            }
            if(opcion == 2){
                System.out.println("ud eligio la opcion 2");
            }
        }
            
            
            
            
    }
}
