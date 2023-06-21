
//  Escribir un programa que solicite al usuario un número y determine si es divisible por 5 y por 3, por ninguno de los dos o por ambos. Mostrar el resultado en pantalla.
import java.util.Scanner;

public class Dia2Divisibilidad {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese numero: ");
        int num = leer.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("El número ingresado es divisible entre ambos");
        } else if (num % 3 != 0 && num % 5 == 0) {
            System.out.println("El número es divisible entre 5");
        } else if (num % 3 == 0 && num % 5 != 0) {
            System.out.println("El número es divisible entre 3");
        } else {
            System.out.println("El número no es divisible entre ninguno de los dos números");
        }

    }
}
