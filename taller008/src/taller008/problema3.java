package taller008;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smart
 */
public class problema3 {
        public static void main(String[] args) {
        // TODO code application logic here 
        Scanner entrada = new Scanner(System.in);
        
        Double numero;
        double suma = 0;
        double numerador;
        double denominador;
        //Se pide que ingrese valores por teclado
        System.out.println("Ingrese un numero para la operacion: ");
        numero = entrada.nextDouble();
        //Se realiza la operacion 
        //Se genera un if para 
        if(numero >= 0){
            for (int i = 1; i <= numero; i++) {
            numerador = 1;
            denominador = Math.pow(2, i);
            suma = suma + (numerador/denominador);                
          } 
        }else{ 
            System.out.println("El numero ingresado no es positivo");
        }
        System.out.printf("Valor de la sumatoria %.2f\n", suma);
    }
    
}
    

