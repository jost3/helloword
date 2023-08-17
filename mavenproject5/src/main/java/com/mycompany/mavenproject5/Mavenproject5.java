/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Mavenproject5 {

    public static void main(String[] args) {
        
        int h1 = 10;
        int h2 = 20;
        int suma = h1+h2;
        int resta = h1-h2;
        System.out.println("la suma es de "+suma);
        System.out.println("la resta es de"+resta);
        
        Scanner operacion = new Scanner(System.in);
        
        System.out.println("ingrese el primer numero: ");
        int num = operacion.nextInt();
        System.out.println("ingrese el segundo  numero: ");
        int num1 = operacion.nextInt();
        int suma1 = num+num1;
        int resta1= num-num1;
        System.out.println("la suma es de : "+suma1);
        System.out.println("la resta de : "+resta1);
    }
}
