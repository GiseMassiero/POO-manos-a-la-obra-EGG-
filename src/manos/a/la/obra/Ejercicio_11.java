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
public class Ejercicio_11 {

    /**
     * Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        int largo;
         
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase, por favor:");
        frase = leer.nextLine();
        
        largo = frase.length();
        System.out.println("La frase cambiada es: " + codificar(frase, largo));
        
    }
    

    public static String codificar(String frase, int largo){
        String letra;
        String frase2 = "";
        
        for (int i = 0; i < largo-1; i++){
          
        letra = frase.substring(i,i+1);
           
        switch (letra){
            case "a": 
                    frase = frase.replace(letra, "@");
                    break;
                case "e":
                    frase = frase.replace(letra, "#");
                    break;
                case "i":
                    frase = frase.replace(letra, "$");
                    break;
                case "o":
                    frase = frase.replace(letra, "%");
                    break;
                case "u":
                    frase = frase.replace(letra, "*");
                    break;

                default:
                    frase = frase.replace(letra, letra);
            }

        }
        return frase;
    }

}
