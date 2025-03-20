/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package aoc.fundamentos.febrero.matriz;

/**
 *
 * @author DELL
 */
public class Matriz {

    public static void main(String[] args) {
        System.out.println("Bienvenida");
        int[][] a = new int[3][3];
        a[1][0] = 5;
        for (int i = 0; i < 3; i = i + 1) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("Termino!!");
    }
}
