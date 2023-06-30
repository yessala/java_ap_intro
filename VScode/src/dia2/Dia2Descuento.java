package dia2;
//Escribir un programa que solicite al usuario el precio de un producto y
//determine si tiene derecho a un descuento. Si el precio es mayor o igual a $100,
//aplicar un descuento del 10% y mostrar el nuevo precio. De lo contrario, mostrar
//el precio original sin descuento.
import java.util.Scanner;

public class Dia2Descuento {
 static Scanner leer = new Scanner(System.in);
 public static void main(String[] args) {
     System.out.println("Ingrese el precio del producto: ");
     double precio = leer.nextDouble();

     //determinar si el producto tiene descuento o no, por su precio
     if (precio >= 100){
         // si tiene descuento, se le resta el 10%
         double descuento = precio-(precio*0.10) ;
         //se imprime el precio final del producto recortando los decimales a maximo 2, con el String.format
         System.out.println("El producto tiene descuento y su costo final es "+ String.format("%.2f", descuento));
     }else
     //si el producto no tiene el valor para tener descuento, imprime lo siguiente
     System.out.println("El producto no tiene descuento, su valor es " + precio);
 }
}
