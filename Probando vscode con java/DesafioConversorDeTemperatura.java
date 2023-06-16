import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioConversorDeTemperatura {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese temperatura en grados Celsius a convertir");
        double grado = leer.nextDouble();
        leer.nextLine();
        System.out.println("Seleccione el tipo de temperatura que ingresó C(celsius)/F(fahreneit)");
        String tipo = leer.nextLine();
        if (tipo.equalsIgnoreCase("C")) {
            try {

                double fahrenheit = (grado * 9 / 5) + 32;

                System.out.println(grado + "° C equivale a " + fahrenheit + "° F.");

            } catch (InputMismatchException e) {
                System.out.println("Error: formato de temperatura equivocado");
            }
        } else if (tipo.equalsIgnoreCase("F")) {
            try {

                double celsius = (grado - 32) * 5 / 9;

                System.out.println(grado + "° F equivale a " + celsius + "° C.");

            } catch (InputMismatchException e) {
                System.out.println("Error: formato de temperatura equivocado");
            }

        }
    }

}
