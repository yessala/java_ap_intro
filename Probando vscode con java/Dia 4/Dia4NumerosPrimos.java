import java.util.Scanner;

public class Dia4NumerosPrimos{
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        boolean primo = false;
        int num1;
        do{
            System.out.println("Ingrese un numero");
             num1=leer.nextInt();
            for (int i = 2; i <= num1-1; i++){
                if (num1 == 0){
                    primo = false;
                    break;
                    }else if (num1%i==0){
                        primo = false;
                        break;
                    } else if (num1 ==2){
                    primo = true;
                        break;
                }else{
                    primo =true;
                   }
                }
         }while (primo == false);
         System.out.println("El número " + num1 + " es primo.");
    } 
}