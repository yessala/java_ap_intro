package dia2;
//Escribir un programa que solicite al usuario una calificación numérica del 1
//al 5 y muestre en pantalla la calificación correspondiente en letras, utilizando la siguiente escala:
//1: "Muy deficiente"
//2: "Deficiente"
//3: "Suficiente"
//4: "Notable"
//5: "Sobresaliente". Utilizar la estructura "switch" para implementar este programa.
import java.util.Scanner;

public class Dia2SwitchCalificacion {
 static Scanner leer = new Scanner(System.in);

 public static void main(String[] args) {
     System.out.println("Ingrese su calificación del 1 al 5");
     int calificacion = leer.nextInt();
     // valida que el número ingresado este en el rango correspondiente
     if (calificacion >= 1 && calificacion <= 5) {
         // seleccion de calificacion para mostrar mensaje correspondiente segun la
         // calificacion
         switch (calificacion) {
             case 1:
                 System.out.println("Muy deficiente");
                 break;
             case 2:
                 System.out.println("Deficiente");
                 break;
             case 3:
                 System.out.println("Suficiente");
                 break;
             case 4:
                 System.out.println("Notable");
                 break;
             case 5:
                 System.out.println("Sobresaliente");
                 break;
         }
     } else // si la calificación ingresada no esta dentro de los valores correspondientes,
            // muestra el siguiente mensaje
         System.out.println("Calificación no valida");
 }

}
