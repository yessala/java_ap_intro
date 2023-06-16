import java.util.InputMismatchException;
import java.util.Scanner;
public class DesafioConversorDeTemperatura {

    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
      
        try{
            System.out.println("Ingrese temperatura en grados Celsius a convertir");
            double celsius=leer.nextDouble();

            double fahrenheit = (celsius * 9/5) + 32;

            System.out.println(celsius + "° C equivale a " + fahrenheit + "° F.");

        } catch(InputMismatchException e){
            System.out.println("Error: formato de temperatura equivocado");
        }

    }

   
}
