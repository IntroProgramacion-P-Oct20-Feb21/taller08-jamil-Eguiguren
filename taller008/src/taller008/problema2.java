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
        //Se genera una condicion fort para que se vaya realizando una repeticion
        //Sacando solo el caracter deseado
        for(int i = 1; i <=26; i++){
            valor = (char) (i + 96);
            //El siguiente for se genera para poder realizar lo perdido
            //que cada palabra se repita sumando de 1 en 1
            for (int contador = 1;contador <= i; contador++){
              System.out.printf("%s",valor); 
            }
            System.out.println();
        }
    }  
}
