package desafios;
import java.util.Scanner;

/**
 * @author yessa
 *
 */
public class Calculadora {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Ingrese el primer número");
		int num1 = leer.nextInt();
		System.out.println("Ingrese el segundo número");
		int num2 = leer.nextInt();

		calculadora(num1, num2);

	}

	public static void calculadora(int n1, int n2) {
		System.out.println("Que operacion desea realizar");
		System.out.println("1. sumar");
		System.out.println("2. restar");
		System.out.println("3. multiplicar");
		System.out.println("4. dividir");
		int select = leer.nextInt();

		switch (select) {
		case 1:
			sumar(n1, n2);
			break;
		case 2:
			restar(n1, n2);
			break;
		case 3:
			multiplicar(n1, n2);
			break;
		case 4:
			dividir(n1, n2);
			break;
		default:
			break;
		}

	}

	public static void sumar(int n1, int n2) {

		System.out.println("La suma de " + n1 + " mas " + n2 + " es " + (n1 + n2));

	}

	public static void restar(int n1, int n2) {

		System.out.println("La resta de " + n1 + " menos " + n2 + " es " + (n1 - n2));

	}

	public static void multiplicar(int n1, int n2) {

		System.out.println("El producto de " + n1 + " por " + n2 + " es " + (n1 * n2));

	}

	public static void dividir(int n1, int n2) {

		System.out.println("La división de " + n1 + " por " + n2 + " es " + (n1 / n2));

	}

}