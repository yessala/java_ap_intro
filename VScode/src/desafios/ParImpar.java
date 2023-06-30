package desafios;
import java.util.Scanner;

/**
 * @author yessa
 *
 */
public class ParImpar {
	static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {



		System.out.println("Ingrese un numero para verificar si es par ó impar");
		int num = leer.nextInt();

		System.out.println(parImpar(num));
	}

	public static String parImpar(int num){

		String resultado = (num%2<=0) ? "El número es par" : "El número es impar";

		return resultado; 
	}

}