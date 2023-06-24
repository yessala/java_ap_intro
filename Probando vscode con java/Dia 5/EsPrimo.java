import java.util.Scanner;

public class EsPrimo{
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        boolean primo;

        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        int j = 0;

        if (num1 == 0 || num1 == 1) {
            System.out.println("El número " + num1 + " no es primo.");
        } else {
            for (int i = 1; i <= num1; i++) {

                if (num1 % i == 0) {
                    j += 1;
                }
              
            }
            if (j == 2) {
                    primo = true;
                    System.out.println("El número " + num1 + " es primo.");
                } else {
                    primo = false;
                    System.out.println("El número " + num1 + " no es primo.");
                }

        }
    }
}