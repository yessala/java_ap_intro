package dia2;
//Escribir un programa que solicite al usuario un número y determine si es
//positivo, negativo o cero. Mostrar el resultado en pantalla.

import java.util.Scanner;

public class Dia2PositivosNegativos {
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingrese numero: ");
		int num = leer.nextInt();
		if (num > 0) {
			System.out.print("Es Positivo");
		} else if(num == 0) {
			System.out.println("Es cero");
		} else 
			System.out.println("Es Negativo");
	}
}
