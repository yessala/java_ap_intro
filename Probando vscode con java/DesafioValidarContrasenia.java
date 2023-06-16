import java.util.Scanner;

public class DesafioValidarContrasenia {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // input de contraseña

        System.out.println("Criterios de seguridad obligatorios:");
        System.out.println();
        System.out.println("entre 3 y 8 caracteres");
        System.out.println("primera letra en mayúscula");
        System.out.println(". o - como caracteres especiales");
        System.out.println("Ingrese contraseña");
        String contra = leer.nextLine();
        
        //ciclo de validación, mientras sea falso, pide nueva contraseña
        while (validacion(contra) == false){
            System.out.println("Intente una contraseña más segura");
            contra = leer.nextLine();
        }
        //contraseña aceptada
        System.out.println("Contraseña válida");
    }

    // metodo para validar criterio de seguridad para contraseña
    public static boolean validacion(String pw){
        // boolean esValida = false;
    boolean esValida = false;
        if (pw != null){
        //valido que la primera letra sea mayúscula
         boolean primeraMayuscula =Character.isUpperCase(pw.charAt(0));

        //identifico la longitud y la valido con los parámetros
        int largo = pw.length();
        boolean largoValido=(largo >= 8); 

        //valido el contenido especifico
         boolean contenido = pw.contains(".") || pw.contains("-");

        esValida = ((primeraMayuscula && largoValido && contenido));
        }
    return esValida;
    }

}
