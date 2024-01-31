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
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     * Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el primer número entero :");
        int num1 = leer.nextInt();
        
        System.out.println("Ingresa el segundo número entero: ");
        int num2 = leer.nextInt();
        
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos enteros ingresados son mayores a 25");

        } else if (num1 > 25 && num2 < 25) {
            System.out.println("El primer número ingresado es mayor a 25 ");

        } else if (num1 < 25 && num2 > 25) {
            System.out.println("El segundo número ingresado es mayor a 25 ");

        } else if (num1 < 25 && num2 < 25) {
            System.out.println("Ambos enteros ingresados son menores a 25 ");

        }

    }

}
