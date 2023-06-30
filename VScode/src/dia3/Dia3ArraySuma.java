package dia3;
//Escribir un programa que cree un array de 3 enteros e imprima por consola 
//la suma de todos sus elementos, sin usar el bucle for.

//import java.util.Arrays;

public class Dia3ArraySuma {
	public static void main(String[] args) {
		//definir valores de la array
		int[] value = {1,2,3};

		//metodo 1 para sumar elementos de una array
		//llamo la clase Arrays con su metodo stream para acceder a los valores, luego la funcion de java sum() que me suma los valores 
		//int suma = Arrays.stream(value).sum();

		//metodo 2 de como sumar elementos de una array mediante un for
		int suma = 0;

		for (int i = 0; i < value.length; i++)
			suma += value[i];

		System.out.println("La suma de todos los objetos de la array es: " + suma);

	}
}
//esta es otra forma de hacer la suma
//Arrays.stream(value).parallel().reduce(0,(a,b)->  a + b)
//fuente de la informcion
//https://www.delftstack.com/es/howto/java/find-sum-of-array-in-java/
