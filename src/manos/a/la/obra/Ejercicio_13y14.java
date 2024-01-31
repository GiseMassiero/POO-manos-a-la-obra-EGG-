/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manos.a.la.obra;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gisella
 */
public class Ejercicio_13y14 {

    /**
     * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer = new Scanner (System.in);
        
         String[] Equipo = new String[10];
         
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre a asignar:");
              Equipo[i] = leer.nextLine();
             
        }
         System.out.println(Arrays.toString(Equipo)); 
    }
   
}
