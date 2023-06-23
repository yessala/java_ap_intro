// Escribir un programa que solicite al usuario un número del 1 al 3 para seleccionar una figura geométrica (1: círculo, 2: cuadrado, 3: triángulo). Luego, mostrar en pantalla el área correspondiente a la figura seleccionada. Utilizar la estructura "switch" para implementar este programa.
import java.util.Scanner;

public class Dia2SwitchGeometria {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        //se imprime las opciones para que el usuario elija
        System.out.println("Seleccione la figura que desea calcular: ");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        int option = leer.nextInt();

        switch (option){
            //metodo para calcular el area de un circulo, se le pide al usuario el rádio
            case 1:
            System.out.println("ingrese el radio para calcular el área: ");
            int radio = leer.nextInt();
            double areaCi = Math.PI * radio * radio;
            System.out.println("El area de un círculo de radio " + radio + " es: " + String.format("%.2f", areaCi));
            break;
            //metodo para calcular el area de un cuadrado, se le pide al usuario la longitud de un lado
            case 2:
            System.out.println("ingrese el lado para calcular el área: ");
            int side = leer.nextInt();
            double areaCu = side * side;
            System.out.println("El área de un cuadrado de lado " + side + " es: " + String.format("%.2f", areaCu));
            break;
            //metodo para calcular el area de un triangulo segun la base y la altura (datos solicitados al usuario)
            case 3:
            System.out.println("ingrese la base: ");
            int base = leer.nextInt();
            System.out.println("ingrese la altura: ");
            int altura = leer.nextInt();
            double areaT = (base * altura) /2;
            System.out.println("El área de un triagulo de base " + base + " y de altura " + altura +" es: " + String.format("%.2f", areaT));
            break;
            //si la opcion elegida no es correcta, se imprime el siguente mensaje y se cierra el programa
            default:
            System.out.println("El número ingresado no se encuentra en las opciones dadas");
            break;

        }
    }
   
}
