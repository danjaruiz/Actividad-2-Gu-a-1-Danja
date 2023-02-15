/* Ejercicio 11 Danja Ruiz
Vamos a hacer un programa que transforme un número entero a números romanos.
Por ahora solo vamos a considerar números entre 1 y 99. Para ello desarrolle las siguientes
funciones y después el programa correspondiente:
 */

import java.util.Scanner;

public class Exercise11 {
    /* 1) escriba una función que tome un número entero de dos cifras y retorne la cifra de las
decenas de ese número.*/
    public static int answerTens(int number) {
        return number / 10;
    }

        /* 2) Escriba otra función que tome un número entero de dos cifras y retorne la cifra de las
unidades de ese número.*/
    public static int answerUnits(int number) {
        return number % 10;
    }

    /* 3) Escriba otra función que reciba un número entero de un dígito (es decir, un número entre
0 y 9) y retorne el equivalente en romano de ese digito. O sea, para 1 retorne "I", para 2
debe retornar "II" y así sucesivamente. Para el cero retorne una cadena o string vacío, ""*/

    public static String zeroToNineRoman(int number) {
        switch (number) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return "";
        }
    }

    /* 4) Escriba finalmente una función que reciba un número entero de un dígito, es decir, un
número entre 0 y 9, y retorne el equivalente romano en decenas de ese número. Las decenas en
romano son: para el 1, es una "X", para el 2, es "XX", para el 3, es "XXX", para el 4 es "XL",
para el 5 es "L", y así sucesivamente.*/

    public static String tensRoman(int number) {
        switch (number) {
            case 1: return "X";
            case 2: return "XX";
            case 3: return "XXX";
            case 4: return "XL";
            case 5: return "L";
            case 6: return "LX";
            case 7: return "LXX";
            case 8: return "LXXX";
            case 9: return "XC";
            default: return "";
        }
    }

    /* 5) Ahora sí, escriba un programa que lea un número entero, y si el número tiene menos de 3
cifras, utilice las funciones anteriores, para convertir el número a romanos (es decir,
obtenga las decenas y unidades del número, convierta las unidades a romano, convierta las
decenas a romano, e imprima ambos strings en pantalla). Si el número tiene 3 o más dígitos
o es negativo, se debe mostrar un mensaje de error. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 99: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 1 || number > 99) {
            System.out.println("Remember, only numbers between 1 and 99");
            return;
        }

        int tens = answerTens(number);
        int units = answerUnits(number);
        String romanUnits = zeroToNineRoman(units);
        String romanTens = tensRoman(tens);

        System.out.println("The Roman equivalent of " + number + " is " + romanTens + romanUnits);
    }
}

