/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aoc.fundamentos.febrero.singleton;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Singleton {

    public static void imprimir(String texto){
        System.out.println("=========================================");
        System.out.println("===> " + texto);
        System.out.println("=========================================");
    }
    public static void main(String[] args) {
        imprimir("Bienvenida!");
        
        Calculadora c = Calculadora.obtenerInstancia();
        
        Scanner teclado = new Scanner(System.in);
        
        
        int primero = teclado.nextInt();
        int segundo = teclado.nextInt();
        imprimir("suma => " + c.sumar(primero, segundo) );
        
        
        Calculadora yo = Calculadora.obtenerInstancia();
        imprimir("restar " + yo.restar(90, 50));
        imprimir("termino!");
    }
}
