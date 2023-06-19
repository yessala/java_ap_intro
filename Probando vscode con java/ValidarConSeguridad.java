import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarConSeguridad {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese una contraseña segura");
        String password = leer.nextLine();
        if (password.length() >= 8) {
            boolean mayuscula = false;
            boolean num = false;
            boolean letra = false;
            boolean especial = false;

            // Define caracteres especiales
            Pattern special = Pattern.compile("[.-_&%$]");
            Matcher hasEspecial = special.matcher(password);

            for (int i=0; i < password.length(); i++){
                char c = password.charAt(i);
                if (mayuscula == false && (mayuscula = Character.isUpperCase(c))) {
                    mayuscula = true;
                }
                if (num == false && (num = Character.isDigit(c))){
                    num = true;
                }
                if (letra == false && (letra = Character.isLowerCase(c))){
                    letra = true;
                }
                if (especial == false && (hasEspecial.find())){
                    especial = true;
                }
            }
            if (mayuscula && num  && letra  && especial){
                System.out.print("Contraseña validada con seguridad.");
            }else
            System.out.print("La contraseña no es válida, intente nuevamente.");
            }
        }

    }