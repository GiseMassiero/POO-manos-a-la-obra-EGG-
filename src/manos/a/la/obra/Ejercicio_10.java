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
public class Ejercicio_10 {

    /**Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int numero;
        int cont = 0;

        do {
            System.out.println("Ingrese un número: ");
            numero = leer.nextInt();

            cont++;
            System.out.print(numero);

            for (int i = 0; i < numero; i++) {

                System.out.print("*");

            }
            System.out.println(" ");
        } while (numero > 1 && numero < 20 && cont < 5);
    }
}
