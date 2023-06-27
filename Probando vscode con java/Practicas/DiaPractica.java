package Practicas;

import java.util.Scanner;

public class DiaPractica {
    // + - * / = matematicos y asignacion
    // > < >= <= == != comparación
    // && - ||... tabla de la verdad and(&&) or(||)

    // if (i > 10 || i < 4){
    // }

    // int, double, float (numericos)
    // boolean (true y false)
    // String ""
    // char 'a'

    // public - private - proteted

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        // int num2, num1;
        // String nombre;

        // System.out.println("Ingrese el primer numero");
        // num1 =leer.nextInt();

        // System.out.println("Ingrese el segundo numero");
        // num2=leer.nextInt();

        // //System.out.println(num1+num2);

        // if (num1 > num2){
        // System.out.println("El primer numero es mayor que el segundo");
        // }else if (num1<num2 ){
        // System.out.println("el segundo numero ingresado es mayor que el primero");
        // }
        // }

        // public static int suma(int n, int m){
        // int sumar = n+m;

        // return sumar;
        double a, b, c; // coeficientes ax^2+bx+c=0
        double x1, x2, d; // soluciones y determinante
        System.out.println("Introduzca primer coeficiente (a):");
        a = leer.nextInt();
        System.out.println("Introduzca segundo coeficiente: (b):");
        b = leer.nextInt();
        System.out.println("Introduzca tercer coeficiente: (c):");
        c = leer.nextInt();
        // calculamos el determinante
        d = ((b * b) - 4 * a * c);
        if (d < 0)
            System.out.println("No existen soluciones reales");
        else {
            // queda confirmar que a sea distinto de 0.
            // si a=0 nos encontramos una división por cero.

            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Solución: " + x1);
            System.out.println("Solución: " + x2);
        }
    }

}