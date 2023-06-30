package dia2;
import java.util.Scanner;

public class Dia2Clasificacion {
	
	    static Scanner leer = new Scanner(System.in);

	    public static void main(String[] args) {

	        System.out.println("Igrese una puntuación para calificarla (0-100)");
	        int num = leer.nextInt();

	        if (num >= 0 && num <= 100) {
	            if ((num >= 90 && num <= 100)) {
	                System.out.println("La calificación es 'A'");
	            } else if (num >= 80 && num <= 89) {
	                System.out.println("La calificación es 'B'");
	            } else if (num >= 70 && num <= 79) {
	                System.out.println("La calificación es 'C'");
	            } else if (num >= 60 && num <= 69) {
	                System.out.println("La calificación es 'D'");
	            } else if (num < 60) {
	                System.out.println("La calificación es 'F'");
	            } else {
	                System.out.println("La puntuación no es válida");
	            }

	        }
	    }
}
