package desafios;
import java.util.Scanner;

/**
 * @author yessa
 *
 */
public class ValidacionContrasenia {
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ingrese una contraseña con estandares de seguridad");
		String password = leer.nextLine();

		esValida(password);

	}

	public static void esValida(String password){
		//validación por metodo if y un  bucle
		if (password.length() >= 8) {

			//variables a verificar
			boolean mayuscula = false;
			boolean num = false;
			boolean minuscula = false;
			boolean especial = false;

			//el bucle para recorrer cada caracter en la cadena de String
			for (int i=0; i < password.length(); i++){
				//asigno una variable a el paso por cadena
				char c = password.charAt(i);

				// comprueba si hay alguna letra mayuscula en la contraseña
				if (mayuscula == false && (mayuscula = Character.isUpperCase(c))) {
					mayuscula = true;
				}

				//identifica la existencia de un número
				if (num == false && (num = Character.isDigit(c))){
					num = true;
				}

				//valida si hay letra minuscula
				if (minuscula == false && (minuscula = Character.isLowerCase(c))){
					minuscula = true;
				}

				//valida si la contraseña contiene alguno de os caracteres definidos con el contains
				if (especial = password.contains(".") || password.contains("-") || password.contains("_") 
							|| password.contains("#") || password.contains("$") || password.contains("!") 
							|| password.contains("?")){
					especial = true;
				}
				//rompe el bucle FOR si todas las variables son TRUE asi no sigue haciendo el pase por cadena pues ya tenemos la contraseña validada
				if ((mayuscula && num  && minuscula  && especial)){
					break;
				}
			}

			//Si todas las variables son true, valida la contraseña
			if (mayuscula && num  && minuscula  && especial){
				System.out.print("Contraseña validada con seguridad.");
			}else //aqui la contraseña no es valida
				System.out.print("La contraseña no es válida, intente nuevamente.");
		}
	}
}

