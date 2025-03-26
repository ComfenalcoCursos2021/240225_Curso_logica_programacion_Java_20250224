/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aoc.fundamentos.febrero.singleton;

/**
 *
 * @author DELL
 */
public class Calculadora {
    
    private static Calculadora laInstancia;    
    
    public static Calculadora obtenerInstancia(){
        if(laInstancia == null){
            laInstancia = new Calculadora();
        }
        
        return laInstancia;
    }
    private Calculadora(){
        
    }
    
    public int sumar(int a, int b){
        int rta = a+b;
        return rta;
    }
    
    public int restar(int a, int b){
        int rta = a-b;
        return rta;
    }
    public int multiplicar(int a, int b){
        int rta = a*b;
        return rta;
    }
    public int dividir(int a, int b){
        int rta = a/b;
        return rta;
    }
}
