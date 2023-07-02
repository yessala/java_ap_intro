/**
 * 
 */
package matrices;

import java.util.Scanner;

/**
 * @author yessa
 *
 */
//Matriz de nombres y puntajes 
//Crear un programa que tenga una matriz de nombres, puntajes y cursos de estudiantes. 
//
//Los usuarios deberían poder ver el siguiente menú:
//

//Agregar estudiante: Permite al usuario ingresar un nuevo estudiante proporcionando su nombre, puntaje y curso como strings. Se realiza una validación para asegurar que el puntaje sea un string válido convertible a Double y esté dentro del rango de 0.00 a 10.00.
//Mostrar promedio general: Calcula y muestra el promedio general de todos los estudiantes.
//Mostrar promedio por curso: Calcula y muestra el promedio de los puntajes en cada curso.
//Mostrar cantidad de estudiantes por curso: Calcula y muestra la cantidad de estudiantes en cada curso.
//“Salir”: Esta opción permite terminar el programa.
//Después de cada selección, se muestra nuevamente el menú para que el usuario pueda realizar más acciones, excepto en el caso de seleccionar "Salir". 
public class MatrizCurso {
	static Scanner leer = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		String[][]
		menu();
		
	}
	
	public static void menu() {
		System.out.println("MENU");
		System.out.println("1. Mostrar estudiantes");
		System.out.println("2. Agregar estudiantes");
		System.out.println("3. Mostrar promedio general");
		System.out.println("4. Mostrar promedio por curso");
		System.out.println("5. Mostrar cantidad de estudiantes por curso");
		System.out.println("6. Salir");
		System.out.print("Opcion: ");
		int select = leer.nextInt();
	
		switch (select) {
		case 1:
			menu();
			break;
		case 2:
			menu();
			break;
		case 3:
			menu();
			break;
		case 4:	
			menu();
			break;
		case 5:
			menu();
			break;
		case 6:
			System.out.println("Hasta luego.");
			break;		
		default:
			break;
		}
	
	}
	//Mostrar estudiantes: Esta opción muestra por pantalla la lista de estudiantes junto con su nombre, puntaje y curso.
	public static void mostrarEstudiantes() {
		
	}
}
