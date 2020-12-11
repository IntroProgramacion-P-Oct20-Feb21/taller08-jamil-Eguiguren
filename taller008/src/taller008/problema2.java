package taller008;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smart
 */
public class problema2 {
    public static void main(String[] args) {
        char valor;
        
        for(int i = 1; i <=26; i++){
            valor = (char) (i + 96);
            for (int contador = 1;contador <= i; contador++){
              System.out.printf("%s",valor); 
            }
            System.out.println();
        }
    }  
}
