package dia2;
//Escribir un programa que solicite al usuario un número del 1 al 7,
//representando un día de la semana, y muestre en pantalla el nombre 
//correspondiente a ese día. Utilizar la estructura "switch" para implementar 
//este programa.
import java.util.Scanner;

public class Dia2SwitchSemana {

	static Scanner leer = new Scanner(System.in);
	public static void main (String[] args){
		System.out.println("Ingrese un número: ");
		int dia = leer.nextInt();
		//segun el numero de dia, me imprime el día
		switch (dia){
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;            
		case 3:
			System.out.println("Miercoles");
			break;            
		case 4:
			System.out.println("Jueves");
			break;            
		case 5:
			System.out.println("Viernes");
			break;            
		case 6:
			System.out.println("Sabado");
			break;            
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Número no válido");
			break;
		}

	}

}
