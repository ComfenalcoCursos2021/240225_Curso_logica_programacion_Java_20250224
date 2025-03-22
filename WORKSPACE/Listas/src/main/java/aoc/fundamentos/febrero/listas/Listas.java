/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package aoc.fundamentos.febrero.listas;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Listas {

    public static void main(String[] args) {
        System.out.println("Bienvenida!");

        int[] a = new int[10];
        Integer c;
        Integer[] d = new Integer[10];
        List<Integer> b = new ArrayList<Integer>();

        c = 10;
        a[0] = 10;
        d[0] = 10;
        b.add(10);
        b.add(11);
        b.add(12);
        b.add(13);
        b.add(14);
        b.add(15);
        
        for(Integer item : b){
            System.out.println(" -> " + item);
        }
        
        for (int i = 0; i < b.size(); i++) {
            Integer item = b.get(i);
            System.out.println(" -> " + item);
        }
        
        b.reversed();
        
        for (Iterator<Integer> iterator = b.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            System.out.println(" -> " + next);
        }
        
        
        

        System.out.println("Termino!");
    }
}
