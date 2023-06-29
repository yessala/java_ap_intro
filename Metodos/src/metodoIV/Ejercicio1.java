package metodoIV;

import java.util.Scanner;

/**
 * @author yessa
 *
 */
public class Ejercicio1 {
	//	Generar matriz aleatoria
	//	Crear un programa que genere una matriz cuadrada de números aleatorios:
	//
	//	El usuario debe proporcionar el tamaño deseado de la matriz y el rango de valores a utilizar. 
	//
	//	Se debe implementar un método llamado "crearMatriz()" que acepte como parámetros el tamaño de la matriz, 
	//	el valor máximo permitido para los elementos y el valor mínimo permitido para los elementos. 
	//
	//	A través de la consola, el usuario ingresará los valores requeridos y se generará una matriz 
	//	aleatoria con números dentro del rango especificado.

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		int size, valueMin, valueMax;

		do {
			System.out.println("Ingrese el tamaño de la matriz");
			size = leer.nextInt();
		}while (size <= 1);
		int[][] matriz = new int[size][size];
		do {
			System.out.println("Ingrese el número minimo de la matriz");
			valueMin = leer.nextInt();
			System.out.println("Ingrese el número maximo de la matriz");
			valueMax = leer.nextInt();
		}while(valueMax <= valueMin);

		menu(matriz, size,valueMax,valueMin);
	}

	//	Menú de operaciones sobre una matriz
	//	A partir de los ejercicios de clases anteriores, crear un programa que presente un menú de 
	//	opciones para realizar diversas acciones sobre una matriz. Se deben implementar todos los métodos necesarios para cada acción. 

	public static void menu(int[][]matriz, int size, int valorMax, int valorMin){

		System.out.println("Seleccione una operación del menú");
		System.out.println("1. Generar Matriz");
		System.out.println("2. Mostrar matriz");
		System.out.println("3. Sumar todos los elementos de la matriz");
		System.out.println("4. Imprimir el número más grande");
		System.out.println("5. Imprimir número más pequeño");
		System.out.println("6. Imprimir cantidad de números pares");
		System.out.println("7. Imprimir cantidad de números impares");
		System.out.println("8. Imprimir una matriz en orden inverso");
		System.out.println("9. Imprimir trasposición de la matriz");
		System.out.println("10. Salir");
		int option = leer.nextInt();
		leer.nextLine();

		switch (option) {
		case 1:
			matriz = generarMatriz(size,valorMax,valorMin);
			menu(matriz, size,valorMax,valorMin);
			break;
		case 2:
			mostrarMatriz(size,matriz);
			menu(matriz, size,valorMax,valorMin);
			break;
		case 3:
			System.out.println("La suma de todos los valores de la matriz es "+ sumarValores(size,matriz));
			break;
		case 4:
			numeroMayor(matriz, size);
			menu(matriz, size, valorMax, valorMin);
			break;
		case 5:
			numeroMenor(matriz, size);
			menu(matriz, size, valorMax, valorMin);
			break;
		case 6:
			pares(matriz, size);
			menu(matriz, size, valorMax, valorMin);
			break;
		case 7:
			impares(matriz, size);
			menu(matriz, size, valorMax, valorMin);
			break;
		case 8:
			invertir(matriz, size);
			menu(matriz, size, valorMax, valorMin);
			break;
		case 9:
			trasponer(matriz, size);
			menu(matriz, size, valorMax, valorMin);
			break;
		case 10:
			System.out.println("Hasta luego");
			break;
		default:
			break;
		}		
	}

	//	1. Generar matriz.
	public static int[][] generarMatriz(int size, int valorMax, int valorMin){
		int[][] matriz = new int [size][size];
		for (int i=0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matriz[i][j] = (int)(valorMin + (Math.random() * (valorMax - (valorMin+1))));
			}
		}		
		return matriz;
	}
	//	2. Mostrar matriz.
	
public static void mostrarMatriz(int size, int[][] m1){

		for (int i=0; i < size ; i++) {
			for (int j=0; j < size;j++) {
				System.out.print("["+ m1[i][j] +"]");
			}
			System.out.println();
		}

	}
//	  3. Sumar todos los elementos de la matriz.
		public static int sumarValores(int size, int[][] m1) {
			int suma=0;
			for (int i=0; i < size ; i++) {
				for (int j=0; j < size;j++) {
					suma += m1[i][j];
				}
			}
			return suma;
		}
	//	4. Imprimir número más grande.
		public static void numeroMayor(int[][] m1, int size) {
			int i,j;
			int numeroMayor = m1[0][0];
			String position = "0,0";
			
			for (i=0 ; i < m1[0].length;i++) {
				for (j=0 ; j<m1.length;j++) {
					
					if (m1[i][j]> numeroMayor) {
						numeroMayor = m1[i][j];
						position = i + "," + j;
					}
				}
			}	
			System.out.println("El numero mayor de la matriz es: " +numeroMayor + " y esta en la posición " + position);
			
		}
		
	//	5. Imprimir número más pequeño.
		public static void numeroMenor(int[][] m1, int size) {
			int i,j;
			int numeroMenor = m1[0][0];
			String position = "0,0";
			
			for (i=0 ; i < m1[0].length;i++) {
				for (j=0 ; j<m1.length;j++) {
					
					if (m1[i][j] < numeroMenor) {
						numeroMenor = m1[i][j];
						position = i + "," + j;
					}
				}
			}		
			System.out.println("El numero mayor de la matriz es: " +numeroMenor + " y esta en la posición " + position);
		}
	//	6. Imprimir cantidad de números pares.
		public static void pares(int[][] m1, int size) {
			int par=0;
			int i,j;
			for (i=0 ; i < m1[0].length;i++) {
				for (j=0 ; j<m1.length;j++) {
					
					if (m1[i][j]%2==0 ) {
						par++;
					}
				}
			}
			System.out.println("La cantidad de numeros pares de la matriz es: " + par);
		}
	//	7. Imprimir cantidad de números impares.
		public static void impares(int[][] m1, int size) {
			int impar=0;
			int i,j;
			for (i=0 ; i < m1[0].length;i++) {
				for (j=0 ; j<m1.length;j++) {
					
					if (m1[i][j]%3==0 ) {
						impar++;
					}
				}
			}
			System.out.println("La cantidad de numeros impares de la matriz es: " + impar);
		}
	//	8. Imprimir una matriz en orden inverso.
		public static void invertir(int[][] m1, int size){
			
			for (int i=size-1; i >=0 ; i--) {
				for (int j=size-1; j >=0;j--) {
					System.out.print("["+ m1[i][j] +"]");
				}
				System.out.println();
			}
		}
	//	9. Imprimir transposición de la matriz.
		public static void trasponer(int[][] m1, int size){
			int[][]m2= new int[size][size];
			for (int i=0 ; i < m1.length;i++) {
				for (int j=0 ; j<m1[0].length;j++) {
				m2[i][j] = m1[j][i];
				}
			}
			for (int i=0; i < size ; i++) {
				for (int j=0; j < size;j++) {
					System.out.print("["+ m2[i][j] +"]");
				}
				System.out.println();
			}
		}

}
