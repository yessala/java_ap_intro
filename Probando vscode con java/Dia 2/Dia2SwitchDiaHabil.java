// Escribir un programa que solicite al usuario un número del 1 al 7, representando un día de la semana, y determine si es un día hábil o un día no hábil. Mostrar el resultado en pantalla.  Considerar que los días hábiles son del 1 al 5 (de lunes a viernes), y utilizar la estructura "switch" para implementar este programa.
import java.util.Scanner;
public class Dia2SwitchDiaHabil {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese un número del 1 al 7");
        int dia = leer.nextInt();

        //el if valida si el número ingresado está entre el 1 el 7
        if (dia >= 1 && dia <= 7){
            //segun el día pasa a los case para definir si es habil o no
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Día hábil");
                break;
            default:
            System.out.println("Día no hábil");
                break;
        }
        //si el número no esta entre 1 y 7, imprime el siguiente mensaje
    }else
    System.out.println("El número no es válido para definir un día de la semana");
        
    }
}
