/* Ejercicio 13 Danja Ruiz
La empresa La Generosa S.A desea aumentar el sueldo a sus empleados, para ello ha
establecido las siguientes condiciones:
1) Quienes ganan hasta $ 800.000 tendrán un incremento del 10%
2) Quienes devengan más de $800.000 y hasta 1’200.000 recibirán un aumento del 8%
3) y los demás del 5%.
Se requiere una función que reciba el sueldo actual de un empleado y que retorne el valor
 del aumento, y luego escriba un programa que usando la función anterior,
 calcule el valor del aumento y luego imprima el nuevo salario para ese empleado.
 */

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee salary: $");
        int todaySalary = scanner.nextInt();

        double increase;
        if (todaySalary <= 800000) {
            increase = todaySalary * 0.1;
        } else if (todaySalary <= 1200000) {
            increase = todaySalary * 0.08;
        } else {
            increase = todaySalary * 0.05;
        }

        int salaryIncreased = todaySalary + (int) increase;
        System.out.println("The employee's new salary is: $" + salaryIncreased);
    }
}
