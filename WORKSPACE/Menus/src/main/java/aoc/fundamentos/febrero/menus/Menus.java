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
        
        Scanner teclado = new Scanner(System.in);
        
        int opcion = -1;
        
        
        
        while(opcion != 9){
            imprimirBienvenida();
            System.out.println("**********************************");
            System.out.println("*          bienvenido            *");
            System.out.println("*     1. sumar (por fuera)       *");
            System.out.println("*     2. Restar (en funcion)     *");
            System.out.println("*     3. Ingresar segundo menu   *");
            System.out.println("*     9. salir                   *");
            System.out.println("**********************************");
            opcion = teclado.nextInt();
            if(opcion == 1) {
                System.out.println("ud eligio la opcion 1");
                
                System.out.println("INGRESE EL PRIMER NUMERO");
                int primero = teclado.nextInt();
                
                System.out.println("INGRESE EL SEGUNDO NUMERO");
                int segundo = teclado.nextInt();
                
                int rta = sumarDosNumeros(primero, segundo);
                System.out.println("______________________________");
                System.out.println("Suma = " + rta);
                
            }
            if(opcion == 2){
                System.out.println("ud eligio la opcion 2");
                restarEnFuncionConTeclado(teclado);
                //restarEnFuncion();
            }
            if(opcion == 3) {
                segundoMenu(teclado);
            }
        }
            
            
            
            
    }
    
    public static void segundoMenu(Scanner teclado) {
        int opcion = -1;
        
        
        
        while(opcion != 9){
            imprimirBienvenida();
            System.out.println("**********************************");
            System.out.println("*          bienvenido            *");
            System.out.println("*     1. NADA                    *");
            System.out.println("*     2. NADA 2                  *");
            
            System.out.println("*     9. RETORNAR                *");
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

    public static void imprimirBienvenida() {
        System.out.println("============================="); 
        System.out.println("==========BIENVENIDA========="); 
        System.out.println("============================="); 
        
    }
    public static void restarEnFuncionConTeclado(Scanner tecladoInterno) {
       
        System.out.println("BIENVENIDO A RESTAR");
        System.out.println("Ingrese el primer numero");
        int primero = tecladoInterno.nextInt();
        System.out.println("Ingrese el segundo numero");
        int segundo = tecladoInterno.nextInt();
        
        int resultado = primero - segundo;
        System.out.println("_____________________________");
        System.out.println("Resta => " + resultado);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void restarEnFuncion() {
        Scanner tecladoInterno = new Scanner(System.in);
        System.out.println("BIENVENIDO A RESTAR");
        System.out.println("Ingrese el primer numero");
        int primero = tecladoInterno.nextInt();
        System.out.println("Ingrese el segundo numero");
        int segundo = tecladoInterno.nextInt();
        
        int resultado = primero - segundo;
        System.out.println("_____________________________");
        System.out.println("Resta => " + resultado);
    }
    public static int sumarDosNumeros(int a, int b) {
        int resultado;
        resultado = a+b;        
        return resultado;
    }
}
