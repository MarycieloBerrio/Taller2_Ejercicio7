/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package taller2.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        double a, b;
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        a = leer.nextDouble();

        System.out.print("Ingrese el valor de B: ");
        b = leer.nextDouble();

        if (a > b) {
            System.out.println("A es mayor que B");
        } else if (a == b) {
            System.out.println("A es igual a B");
        } else {
            System.out.println("A es menor que B");
        }
    }
}
