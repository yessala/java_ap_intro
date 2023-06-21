// Escribir un programa que cree un array de 3 enteros y devuelva el valor máximo presente en el array, sin usar el bucle for.
import java.util.Arrays;

public class Dia3ArrayMaximo{

    public static void main(String[] args) {
        int[] value = {7,3,9};
        //ordeno los valores de menor a mayor
        Arrays.sort(value);
                                                                    //selecciono el ultimo valor del array
        System.out.println("El valor máximo de entre los objetos es " + value[value.length-1]);
    }
}
