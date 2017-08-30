/*
 Dado en centímetro el ancho y el alto de un rectángulo. ¿Cuál será el perímetro y el área?
 */
package com.cice.aritmetica;

import java.util.Scanner;


/**
 *
 * @author cice
 */
public class aritmetica {
        
        
    public static void main(String[] args) {
        
        int ancho;
        int alto;
        
        
        System.out.print("Introduce en numeros enteros y en centimetros el ancho del rectángulo: ");
        
        
        Scanner sc = new Scanner(System.in);
        ancho = sc.nextInt();
        
        System.out.print("Introuce en numeros enteros y en centimetros el alto del rectángulo: ");
        
        Scanner sc1 = new Scanner(System.in);
        alto = sc1.nextInt();
        
        System.out.println("El perímetro del rectángulo es: " + ((ancho*2)+(alto*2)));
        System.out.println("El area del rectángulo es: " + ancho*alto + "cm2");
        System.out.println("gracias");
        
        
        
    }
    
}
