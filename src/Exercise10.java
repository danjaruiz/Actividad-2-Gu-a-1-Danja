/* Ejercicio 10 Danja Ruiz
Escriba una función en el que a partir de dos números enteros y un operador aritmético (un String, que puede
ser "+", "-", "*", "/", "%" o "**"), aplica la operación correspondiente y retorna el resultado.
El programa deberá leer los dos números, la operación y, usando la función, deberá mostrar el resultado.
 */

import java.util.Scanner;

public class Exercise10 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter a second whole number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter the symbol of the mathematical operation you want to perform (+, -, *, /, %, **): ");
        String  operation = scanner.next();
        double result = calculating(firstNumber, secondNumber, operation);
        System.out.print("The result of the operation is: " + result);
    }

    public static double calculating(int firstNumber, int secondNumber, String operation) {
        switch (operation) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                return firstNumber / secondNumber;
            case "%":
                return firstNumber % secondNumber;
            case "**":
                return Math.pow(firstNumber, secondNumber);
            default:
                System.out.println("No operator or Invalid operator");
                return 0;
        }
    }
}
