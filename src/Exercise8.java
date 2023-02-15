/* Ejercicio 8 Danja Ruiz
En el nuevo edificio de la universidad, cada piso tendrá el mismo número de salones y en todos los salones
tendrán la misma capacidad (cantidad de estudiantes que caben en el salón). Escriba una función y un
programa en Java que calcule el número de salones y el número de pisos que tendrá el nuevo edificio a partir
del número de estudiantes que tiene la universidad, la capacidad del salón y el número de salones que tendrá
un piso del edificio.
 */


import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the total number of students: ");
    int students = scanner.nextInt();
    int capacityRoom = 40;
    int roomsPerFloor = 8;
    int calculateRooms = (int) Math.ceil((int) students / capacityRoom);
    int calculateFloors = (int) Math.ceil((int) calculateRooms / roomsPerFloor);
    System.out.println("The number of rooms required is: " + calculateRooms);
    System.out.println("The number of floors required is: " + calculateFloors);
    }
}