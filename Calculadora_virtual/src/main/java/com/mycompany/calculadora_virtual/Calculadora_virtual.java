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
        System.out.println("--------RESTA--------");
        int c,d,resta;
        System.out.println("Digite el primer numero:");
        c=entrada.nextInt();
        System.out.println("Digite el segundo numero:");
        d=entrada.nextInt();
        resta = c-d;
        System.out.println("EL RESULTADO DE ESTA RESTA ES: " + resta);
        
    }
}
