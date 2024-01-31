/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manos.a.la.obra;

import java.util.Scanner;

/**
 *
 * @author Gisella
 */
public class Ejercicio_5 {

    /**
     * Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double altura;
        boolean sexo;
        char letra = 'a';
   Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el sexo");
       sexo = leer.nextBoolean();
        
        System.out.println("Ingresa su altura:");
        altura = leer.nextDouble();
        
        System.out.println("Ingresa la ultima letra de su nombre: ");
       letra = leer.next().charAt(0);
    }
    
}
