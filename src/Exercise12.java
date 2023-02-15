/* Ejercicio 12 Danja Ruiz
 Escribir una función que reciba el nombre de un día (por ejemplo "lunes" o "martes", etc.) y retorne el nombre
del día de mañana. Usando la función anterior, escriba un programa que lea el nombre de un día y que imprima
el nombre del día de mañana.
 */

import java.util.Scanner;

public class Exercise12 {
    public static String getDay(String today) {
        switch (today) {
            case "Monday":
                return "Tuesday";
            case "Tuesday":
                return "Wednesday";
            case "Wednesday":
                return "Thursday";
            case "Thursday":
                return "Friday";
            case "Friday":
                return "Saturday";
            case "Saturday":
                return "Sunday";
            case "Sunday":
                return "Monday";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the day with initial capital letter and without leaving spaces: ");
        String today = scanner.nextLine();
        String tomorrow = getDay(today);
        System.out.println("So tomorrow will be " + tomorrow);
    }
}
