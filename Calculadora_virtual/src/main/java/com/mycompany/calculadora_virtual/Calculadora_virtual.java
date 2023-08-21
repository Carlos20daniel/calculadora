/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora_virtual;

import java.util.Scanner;

/**
 *
 * @author Carlos Cuenca
 */
public class Calculadora_virtual {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("--------SUMA--------");
        int a,b,suma;
        System.out.println("Digite el primer numero:");
        a=entrada.nextInt();
        System.out.println("Digite el segundo numero:");
        b=entrada.nextInt();
        suma = a+b;
        System.out.println("EL RESULTADO DE ESTA SUMA ES: " + suma);
        
    }
}
