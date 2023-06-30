package desafios;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author yessa
 *
 */
public class ConversorDeTemperatura {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Ingrese temperatura en grados Celsius a convertir");
		double grado = leer.nextDouble();
		leer.nextLine(); //salto de linea paraque me deje agregar texto
		System.out.println("Seleccione el tipo de temperatura que ingresó C(celsius)/F(fahreneit)");
		String tipo = leer.nextLine();
		//convertir de celsius a fahrenhet
		if (tipo.equalsIgnoreCase("C")) {
			try {

				double fahrenheit = (grado * 9 / 5) + 32;

				System.out.println(grado + "° C equivale a " + fahrenheit + "° F.");
				//Exception
			} catch (InputMismatchException e) {
				System.out.println("Error: formato de temperatura equivocado");
			}
			//convertir de fahrenhet a celsius
		} else if (tipo.equalsIgnoreCase("F")) {
			try {

				double celsius = (grado - 32) * 5 / 9;

				System.out.println(grado + "° F equivale a " + celsius + "° C.");
				//exception
			} catch (InputMismatchException e) {
				System.out.println("Error: formato de temperatura equivocado");
			}

		}
	}

}
