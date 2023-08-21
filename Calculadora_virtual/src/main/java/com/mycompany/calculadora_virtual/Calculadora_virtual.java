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
        System.out.println("--------MULTIPLICACION--------");
        int g,h,multiplicacion;
        System.out.println("Digite el primer numero:");
        g=entrada.nextInt();
        System.out.println("Digite el segundo numero:");
        h=entrada.nextInt();
        multiplicacion = g*h;
        System.out.println("EL RESULTADO DE ESTA MULTIPLICACION ES:  " + multiplicacion);
    }
}
