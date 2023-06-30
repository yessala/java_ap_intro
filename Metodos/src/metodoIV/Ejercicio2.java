package metodoIV;

//Menú de operaciones sobre dos matrices
//Utilizando como base los ejercicios de clases anteriores, crear un programa 
//que presente un menú de opciones para realizar diversas acciones sobre dos matrices. 
//Se deben implementar todos los métodos necesarios para cada acción. 
//
//❗Recuerda crear los métodos necesarios para cada una de estas acciones y 
//el programa debe mostrar el menú de opciones para que el usuario pueda elegir la 
//acción deseada. Además, las matrices deben tener el mismo tamaño para realizar las 
//operaciones de suma y multiplicación.

import java.util.Scanner;

/**
 * @author yessa
 *
 */
public class Ejercicio2 {
	static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
		int size;
		System.out.println("Ingrese el tamaño de la matriz");
		size = leer.nextInt();
		int[][] matriz = new int[size][size];
		int[][] matriz2 = new int[size][size];
		menu(matriz, matriz2, size);

	}
	public static void menu(int[][] m1, int[][] m2, int size) {
		//Las opciones del menú son las siguientes:
		//1. Generar matrices (deben tener el mismo tamaño).
		//2. Mostrar matrices.
		//3. Imprimir matriz resultante de la suma de ambas matrices.
		//4. Imprimir matriz resultante de la multiplicación de ambas matrices.
		//5. Salir.
		System.out.println("MENU");
		System.out.println("1. Generar matrices");
		System.out.println("2. Mostrar matrices");
		System.out.println("3. Sumar matrices y mostrar la matriz resultante");
		System.out.println("4. Multiplicar matrices y mostrar la matriz resultante");
		System.out.println("5. Salir");
		int option = leer.nextInt();
		leer.nextLine();

		switch (option) {
		case 1:
			generarMatriz(m1, size);
			generarMatriz(m2, size);
			System.out.println();
			menu(m1, m2, size);
			break;
		case 2:
			System.out.println("Primera Matriz");
			mostrarMatriz(m1);
			System.out.println();
			System.out.println("Segunda Matriz");
			mostrarMatriz(m2);
			System.out.println();
			menu(m1, m2, size);
			break;
		case 3:
			System.out.println("Matriz resultante de la suma");
			sumarMatrices(m1, m2);
			System.out.println();
			menu(m1, m2, size);
			break;
		case 4:
			System.out.println("Matriz resultante de la multiplicacion");
			multiplicarMatrices(m1, m2);
			System.out.println();
			menu(m1, m2, size);
			break;
		case 5:
			System.out.println("Hasta luego");
			break;
		default:
			break;
		}


	}
	public static int[][] generarMatriz(int[][] m1, int size){

		for (int i = 0; i<size;i++) {
			for (int j=0; j<size;j++) {
				m1[i][j]= (int) (Math.random()*10);
			}
		}
		return m1;

	}
	public static void mostrarMatriz(int[][] m1) {
		for (int i = 0; i< m1.length;i++) {
			for (int j=0; j<m1[i].length;j++) {
				System.out.print("["+m1[i][j]+"]");
			}
			System.out.println();
		}
	}
	public static void sumarMatrices(int[][] m1, int[][] m2) {
		int[][] m3 = new int[m1.length][m1.length];

		for (int i = 0; i< m1.length;i++) {
			for (int j=0; j<m1[i].length;j++) {
				m3[i][j] = m1[i][j]+m2[i][j];
			}
		}
		mostrarMatriz(m3);
	}

	public static void multiplicarMatrices(int[][] m1, int[][] m2) {
		int[][] m3 = new int[m1.length][m1.length]; 
		int i,j,k, suma=0;

		for (i=0;i<m3.length;i++) {
			for (j=0;j<m3.length;j++) {
				for (k=0;k<m3.length;k++) {
					suma+=m1[i][k]*m2[k][j];
				}
				m3[i][j]=suma;
				suma=0;
			}
		}
		mostrarMatriz(m3);
	}

}


