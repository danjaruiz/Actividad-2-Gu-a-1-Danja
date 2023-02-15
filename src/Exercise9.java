import java.util.Scanner;

/* Ejercicio 9 Danja Ruiz
Escribir una función que reciba dos números enteros y retorne el mayor número de los dos. Escriba un
programa, que lea dos números enteros, y usando la función anterior, imprima el mayor de los dos
 */
public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a whole number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter a second whole number: ");
        int secondNumber = scanner.nextInt();
        int largestNumber = Math.max(firstNumber, secondNumber);
        System.out.println("The greater number between the two entered is: " + largestNumber);
    }

    public static int largestNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
            }
    }
}
