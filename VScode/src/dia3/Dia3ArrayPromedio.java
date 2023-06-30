package dia3;
//Escribir un programa que cree un array de 3 enteros e imprima por consola el 
//promedio de todos sus elementos, sin usar el bucle for.

//import java.util.Arrays;
//
public class Dia3ArrayPromedio {
	//	public static void main(String[] args) {
	//		//definir valores de la array
	//		int[] value = {1,2,3};
	//		//llamo la clase Arrays con su metodo stream para acceder a 
	//		//los valores, luego la funcion de java sum() que me suma los valores 
	//		int suma = Arrays.stream(value).sum();
	//
	//		System.out.println("El promedio de todos los objetos de la array es: " + (suma/value.length));
	//	}

	public static void main(String[] args) {
		int[] value = {1,2,3};
		int suma = 0;

		//Otra forma de sumar (sin metodo arrays), es co un bucle for
		for(int i=0;i<value.length;i++) {
			suma+= value[i];
		}
		System.out.println("El promedio de la array es  "+ (suma/value.length));
	}


}
