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
public class ListasTipoDatos {

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
        
        
        BolsaGatos bolsa1 = new BolsaGatos();
        bolsa1.id = 1;
        bolsa1.nombre = "pepe";
        BolsaGatos bolsa2 = new BolsaGatos();
        bolsa2.id = 2;
        bolsa2.nombre = "fulano";
        System.out.println("A CONTINUACION LAS BOLSAS");
        System.out.println(bolsa1.id);
        System.out.println(bolsa2.id);

        List<BolsaGatos> listaBolsas = new ArrayList<BolsaGatos>();
        
        listaBolsas.add(bolsa1);
        listaBolsas.add(bolsa2);
        
        System.out.println("==================");
        
        for(BolsaGatos item : listaBolsas){
            System.out.println( item.id + " -> " + item.nombre );
        }
        
        System.out.println("Termino!");
    }
}
