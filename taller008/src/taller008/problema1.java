/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller008;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Smart
 */
public class problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String  palabra ;
        // Se pide que ingrese una palabra por teclado para poder realizar
        // el proceso
        System.out.println("Ïngrese una palabra: ");
        palabra = entrada.nextLine();
        char letra;
        for (int i = 0; i < palabra.length(); i++){
            letra = palabra.charAt(i);   
            for (int contador = 0;contador < (i+1); contador++){
              System.out.printf("%s",letra);     
             }
            System.out.println(); 
            }
        } 
    }
    
