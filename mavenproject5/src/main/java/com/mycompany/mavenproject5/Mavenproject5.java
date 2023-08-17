/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;
import java.util.Scanner;
import javax.swing.JOptionPane;
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
        
        String entrada1= JOptionPane.showInputDialog("ingrsa el primer numero: ");
        int num2 = Integer.parseInt(entrada1);
        String entrada2= JOptionPane.showInputDialog("ingrsa el segundo  numero: ");
        int num3 = Integer.parseInt(entrada2);
        int suma2 = num2+num3;
        int resta2 = num2-num3;
        
        String salida = "suma : "+suma2+ "resta"+resta2;
        JOptionPane.showMessageDialog(null,salida);
        
    }
}
