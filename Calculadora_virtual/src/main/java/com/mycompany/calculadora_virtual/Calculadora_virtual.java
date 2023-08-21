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
        System.out.println("--------DIVICION--------");
        int e,f,divicion;
        System.out.println("Digite el primer numero:");
        e=entrada.nextInt();
        System.out.println("Digite el segundo numero:");
        f=entrada.nextInt();
        divicion = e/f;
        System.out.println("EL RESULTADO DE ESTA DIVICION ES:  " + divicion);
    }
}
