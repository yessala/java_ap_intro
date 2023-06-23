// Escribir un programa que solicite al usuario una contraseña y verifique si coincide con una contraseña predefinida. Si la contraseña ingresada es correcta, mostrar un mensaje de "Acceso concedido". De lo contrario, mostrar un mensaje de "Acceso denegado".
import java.util.Scanner;

public class Dia2Contrasenia {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese su Contraseña: ");
        String password = leer.nextLine();
        //Contraseña definida para comparar
        String validPassword = "contra1234";
        
        //Validación de contraseña método equals para String
        if (password.equals(validPassword)){
            System.out.print("Acceso Concedido");
        }else
        System.out.println("Acceso Denegado");
    }
}
