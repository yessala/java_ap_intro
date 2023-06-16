import java.util.Scanner;
import java.util.regex.Pattern;
 
// Programa Java para validar una contraseña en Java
public class ExpresionesRegulares {
    // Contraseña de 8-16 caracteres con al menos un dígito, al menos uno
    // letra minúscula, al menos una letra mayúscula, al menos una
    // caracter especial sin espacios en blanco
    private static final String PASSWORD_REGEX =
        "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.-_$#])(?=\\S+$).{8,16}$";
 
    private static final Pattern PASSWORD_PATTERN =
                                Pattern.compile(PASSWORD_REGEX);
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Ingrese contraseña");
        String password = sc.nextLine();
 
        // Validar una contraseña
        if (PASSWORD_PATTERN.matcher(password).matches()) {
            System.out.print("La contraseña " + password + " es válida");
        }
        else {
            System.out.print("La contraseña " + password + " no es válida");
        }
    }
}