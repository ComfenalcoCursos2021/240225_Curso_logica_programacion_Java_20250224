/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package aoc.fundamentos.febrero.dobledeunnumero;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DobleDeUnNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        
        System.out.println("Por favor ingrese el numero para hallarle el doble");
        
        
        a = teclado.nextInt();
        a = a * 2;
        System.out.println("El doble " + a);
    }
}
