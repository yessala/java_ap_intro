package desafios;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yessa
 *
 */
public class ValidarPassword {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Ingrese una contraseña segura");
		String password = leer.nextLine(); //usuario ingresa contraseña

		//validación por metodo if y un  bucle
		if (password.length() >= 8) {

			//variables a verificar
			boolean mayuscula = false;
			boolean num = false;
			boolean letra = false;
			boolean especial = false;

			// Define caracteres especiales validos para la contraseña usando Pattern y Matcher (import)
			Pattern special = Pattern.compile("[.-_&%$]");
			Matcher hasEspecial = special.matcher(password);

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
				if (letra == false && (letra = Character.isLowerCase(c))){
					letra = true;
				}

				//valida si la contraseña contiene alguno de os caracteres definidos en el pattern
				if (especial == false && (hasEspecial.find())){
					especial = true;
				}
				//rompe el bucle FOR si todas las variables son TRUE asi no sigue haciendo el pase por cadena pues ya tenemos la contraseña validada
				if ((mayuscula && num  && letra  && especial)){
					break;
				}
			}

			//Si todas las variables son true, valida la contraseña
			if (mayuscula && num  && letra  && especial){
				System.out.print("Contraseña validada con seguridad.");
			}else //aqui la contraseña no es valida
				System.out.print("La contraseña no es válida, intente nuevamente.");
		}
	}

}