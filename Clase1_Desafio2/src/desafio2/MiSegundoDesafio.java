package desafio2;

import java.util.Scanner;

public class MiSegundoDesafio {
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		calculator();

	}


	public static void calculator() {

		System.out.println("Que operación desea realizar");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Salir");
		int select = leer.nextInt();
		switch (select) {
		case 1:
			sumar();	
			break;
		case 2:
			restar();
			break;
		case 3:
			multiplicar();
			break;
		case 4:
			dividir();
			break;
		case 5:
			salir();
break;
		default:
			break;
		}
	}

	public static void sumar() {

		System.out.println("Ingrese el primer número");
		int num1 = leer.nextInt();
		System.out.println("Ingrese el segundo número");
		int num2 = leer.nextInt();

		System.out.println("La suma de los dos números es " + (num1+num2));
	}

	public static void restar() {

		System.out.println("Ingrese el primer número");
		int num1 = leer.nextInt();
		System.out.println("Ingrese el segundo número");
		int num2 = leer.nextInt();

		System.out.println("La resta de los dos números es " + (num1-num2));
	}
	public static void multiplicar() {

		System.out.println("Ingrese el primer número");
		int num1 = leer.nextInt();
		System.out.println("Ingrese el segundo número");
		int num2 = leer.nextInt();

		System.out.println("El producto de los dos números es " + (num1*num2));
	}
	public static void dividir() {

		System.out.println("Ingrese el primer número");
		int num1 = leer.nextInt();
		System.out.println("Ingrese el segundo número");
		int num2 = leer.nextInt();

		System.out.println("La división de los dos números es " + (num1/num2));
	}

	public static void salir() {
		System.out.println("Hasta luego");


	}


}
