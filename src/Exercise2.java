import java.util.Scanner;

/*Ejercicio 2 Danja Ruiz
El paseo: cuando termine esta pandemia, vamos a organizar un paseo. Al paseo irán estudiantes gordos y
flacos. Un estudiante gordo ocupa dos sillas de un bus y un estudiante flaco ocupa solo una silla. Si sabemos
cuántas sillas tiene un bus, cuántos estudiantes gordos van al paseo y cuántos estudiantes flacos van al paseo,
escriba una función y un programa en Java que encuentre el número de buses que se necesitan alquilar para
llevar todos esos estudiantes al paseo
 */
public class Exercise2 {
    static int NumberOfBuses(int fat, int skinny, int chairs) {
        int buses = (int) Math.ceil((fat * 2 + skinny) / (double) chairs);
        return buses;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int fat, skinny, chairs, buses; 

        System.out.print("Number of fat people: ");
        fat = keyboard.nextInt();
        System.out.print("Number of skinny people: ");
        skinny = keyboard.nextInt();
        System.out.print("Number of chairs: ");
        chairs= keyboard.nextInt();

        buses = NumberOfBuses(fat, skinny, chairs);
        System.out.println("Need to rent: " + buses + " Buses");
    }
}
