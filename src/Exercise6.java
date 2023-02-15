/*Ejercicio 6 Danja Ruiz
Escriba métodos estáticos o funciones en Java que nos ayuden a encontrar el área y el perímetro del terreno:
1) Escriba una función que halle el área de un rectángulo a partir de su base y su altura
2) Escriba una función que halle la hipotenusa de un triángulo rectángulo a partir de los catetos del triángulo.
3) Encuentre el área de un triángulo a partir de su base y su altura
4) Encuentre el perímetro del terreno a partir de los lados A, B, C (hay que encontrar la hipotenusa).
5) El programa debe leer las dimensiones de los 3 lados y hallar el área y el perímetro del terreno usando las
funciones anteriores.
 */

import java.util.Scanner;

public class Exercise6 {
    public static double rectangleArea(double b, double h){
        return b * h;
    }

    public static double triangleHypotenuse(double AB, double BC){
        return Math.sqrt(Math.pow(AB,2) + Math.pow(BC,2));
    }

    public static double triangleArea(double b, double h){
        return (b * h) / 2;
    }

    public static double perimeter(double A, double B, double C){
        return A + B + C + triangleHypotenuse(A, B);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter measurement of side A: ");
        double A = sc.nextDouble();
        System.out.print("Enter measurement of side B: ");
        double B = sc.nextDouble();
        System.out.print("Enter measurement of side C: ");
        // no está corriendo de aquí en adelante, falta programar el cálculo total :(
        double C = sc.nextDouble();
        double area = sc.nextDouble();
        double perimeter  = sc.nextDouble();
        System.out.print("The Total Area is: " + area);
        System.out.print("The Total Perimeter is: " + perimeter);
        }
    }
