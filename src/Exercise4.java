import java.util.Scanner;

/* Ejercicio 4 Danja Ruiz
Escriba una función y un programa en Java que resuelva el siguiente problema: Pedro acabó de recibir el
sueldo mensual. Si se gasta el 40% de ese sueldo en el arriendo y el 15% del sueldo en comida, determine
cuánto dinero se gastó en cada uno de esos dos ítems (en arriendo y en comida) y cuánto dinero le queda al
final.
 */

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entry Salary: ");
        double salary = sc.nextDouble();
        double rent = salary * 0.40;
        double food = salary * 0.15;
        double save = salary - (rent + food);
        System.out.println("Rental expense is $" + rent);
        System.out.println("Food expense is $" + food);
        System.out.println("Your balance at the end of the month is $" + save);
    }
}


