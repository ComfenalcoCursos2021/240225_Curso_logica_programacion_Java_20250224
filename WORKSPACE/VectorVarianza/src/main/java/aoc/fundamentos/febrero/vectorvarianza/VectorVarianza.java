/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package aoc.fundamentos.febrero.vectorvarianza;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class VectorVarianza {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenida");
        
        int n;
        float p = 0;
        int max = 0;
        int alt;
        int[] A;
        float suma = 0;
        float varianzaCuadrada = 0;
        System.out.println("Ingrese la cantidad de alturas a diligenciar");
        n = teclado.nextInt();
        A = new int[n];
        

        for (int i = 0; i < n; i = i + 1) {
            System.out.println("Ingrese la altura");
            alt = teclado.nextInt();
            A[i] = alt;
            p = p + alt;
            if(alt > max) {
                max = alt;
            }
        }
        
        p = p / n;
        
        for(int j = 0; j<n;j=j+1){
            suma = (suma + ( (A[j]-p) * (A[j]-p)));
        }
        
        varianzaCuadrada = suma/n;
        
        System.out.println("la altura maxima es " + max);
        System.out.println("El promedio es " + p);
        System.out.println("La varianza cuadrada es " + varianzaCuadrada);
        
        System.out.println("Termino!!!");

    }
}
