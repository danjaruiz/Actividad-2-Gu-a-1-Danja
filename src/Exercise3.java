import java.util.Scanner;

/* Ejercicio 3 Danja Ruiz
Escriba una función que calcule la longitud de la escalera (𝑦) teniendo en cuenta que conocemos la altura
que tiene la escalera (𝑥) cuando está inclinada sobre la pared con un ángulo α. Escriba el programa que
use la función anterior para hallar la longitud de la escalera a partir de los otros datos.
 */

public class Exercise3 {
    static double functionLength(double height, double angle) {
        double hypotenuse = height / Math.sin(Math.toRadians(angle)); /* utilizando la ecuación: c=a/sin(alpha) */
        return hypotenuse;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double height, angle, hypotenuse;

        System.out.print("Enter height value: ");
        height = keyboard.nextDouble();
        System.out.print("Enter angle value: ");
        angle = keyboard.nextInt();

        hypotenuse = functionLength(height, angle);

        System.out.println("The result is " + hypotenuse);
    }
}
