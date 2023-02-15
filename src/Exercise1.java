import java.util.Scanner;

/*Ejercicio 1 Danja Ruiz
 Escriba una función o método estático y luego un programa que use esa función, que encuentre el valor
 de la siguiente función algebraica: 𝑓(𝑥, 𝑦) = 𝑥²+ 2𝑥𝑦 + 𝑦²
 */

public class Exercise1 {
    static int function(int x, int y){
        int f = x * x + 2 * x * y + y * y;
        return f;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x, y, f;

        System.out.print("Enter x value");
        x = keyboard.nextInt();
        System.out.print("Enter y value");
        y = keyboard.nextInt();

        f = function(x, y);

        System.out.println("The result is " + f);
    }
}
