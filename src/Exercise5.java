
/* Ejercicio 5 Danja Ruiz
Escriba una función que halle el área de un círculo de acuerdo con la siguiente fórmula: 𝐴 = 𝜋𝑟²
Ahora escriba una función que halle el área de la corona circular (...) a partir de la resta de las
áreas del círculo grande (con radio R) y el círculo pequeño (con radio r). En esta segunda
función debe usar la primera.
Además, escriba un programa que lea el valor de los dos radios y, usando la función anterior,
calcule y halle el área de la corona circular.
 */

import java.util.Scanner;

public class Exercise5 {
    public static double functionarea(double radius) {
        return Math.PI * Math.pow(radius,2);
    }

    public static double areacrown(double bigcircle, double smallcircle) {
        return functionarea(bigcircle) - functionarea(smallcircle);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entry Big Circle Radius: ");
        double bigcircle = sc.nextDouble();
        System.out.print("Entry Small Circle Radius: ");
        double smallcircle = sc.nextDouble();
        double area = areacrown(bigcircle,smallcircle);
        System.out.println("The area of the circular crown is " + area);
    }

}






