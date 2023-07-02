/**
 * 
 */
package matrices;

import java.util.Scanner;

/**
 * @author yessa
 *
 */
public class CursoArray {

	public static void main(String[] args) {
		Estudiante[] estudiantes = new Estudiante[100]; // Tamaño máximo de 100 estudiantes
		int contadorEstudiantes = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Seleccione una opción:");
			System.out.println("1. Mostrar estudiantes");
			System.out.println("2. Agregar estudiante");
			System.out.println("3. Mostrar promedio general");
			System.out.println("4. Mostrar promedio por curso");
			System.out.println("5. Mostrar cantidad de estudiantes por curso");
			System.out.println("6. Salir");
			int opcion = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer

			switch (opcion) {
			case 1:
				mostrarEstudiantes(estudiantes, contadorEstudiantes);
				break;
			case 2:
				if (contadorEstudiantes < estudiantes.length) {
					contadorEstudiantes = agregarEstudiante(estudiantes, contadorEstudiantes, scanner);
				} else {
					System.out.println("La lista de estudiantes está llena. No se pueden agregar más.");
				}
				break;
			case 3:
				mostrarPromedioGeneral(estudiantes, contadorEstudiantes);
				break;
			case 4:
				mostrarPromedioPorCurso(estudiantes, contadorEstudiantes);
				break;
			case 5:
				mostrarCantidadEstudiantesPorCurso(estudiantes, contadorEstudiantes);
				break;
			case 6:
				System.out.println("¡Hasta luego!");
				System.exit(0);
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
		}
	}

	public static void mostrarEstudiantes(Estudiante[] estudiantes, int contadorEstudiantes) {
		if (contadorEstudiantes == 0) {
			System.out.println("No hay estudiantes registrados");
			return;
		}

		for (int i = 0; i < contadorEstudiantes; i++) {
			System.out.println("Nombre: " + estudiantes[i].getNombre());
			System.out.println("Puntaje: " + estudiantes[i].getPuntaje());
			System.out.println("Curso: " + estudiantes[i].getCurso());
			System.out.println("---------------------------");
		}
	}

	public static int agregarEstudiante(Estudiante[] estudiantes, int contadorEstudiantes, Scanner scanner) {
		System.out.print("Ingrese el nombre del estudiante: ");
		String nombre = scanner.nextLine();

		System.out.print("Ingrese el puntaje del estudiante: ");
		double puntaje;
		while (true) {
			try {
				puntaje = Double.parseDouble(scanner.nextLine());
				if (puntaje < 0.00 || puntaje > 10.00) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				System.out.print("Puntaje inválido. Ingrese nuevamente: ");
			}
		}

		System.out.print("Ingrese el curso del estudiante: ");
		String curso = scanner.nextLine();

		estudiantes[contadorEstudiantes] = new Estudiante(nombre, puntaje, curso);
		System.out.println("Estudiante agregado exitosamente");

		return contadorEstudiantes + 1;
	}

	public static void mostrarPromedioGeneral(Estudiante[] estudiantes, int contadorEstudiantes) {
		if (contadorEstudiantes == 0) {
			System.out.println("No hay estudiantes registrados");
			return;
		}

		double sumaPuntajes = 0.0;
		for (int i = 0; i < contadorEstudiantes; i++) {
			sumaPuntajes += estudiantes[i].getPuntaje();
		}

		double promedio = sumaPuntajes / contadorEstudiantes;
		System.out.println("Promedio general: " + promedio);
	}

	public static void mostrarPromedioPorCurso(Estudiante[] estudiantes, int contadorEstudiantes) {
		if (contadorEstudiantes == 0) {
			System.out.println("No hay estudiantes registrados");
			return;
		}

		String[] cursos = obtenerCursos(estudiantes, contadorEstudiantes);

		for (String curso : cursos) {
			double sumaPuntajes = 0.0;
			int contador = 0;
			for (int i = 0; i < contadorEstudiantes; i++) {
				if (estudiantes[i].getCurso().equals(curso)) {
					sumaPuntajes += estudiantes[i].getPuntaje();
					contador++;
				}
			}

			double promedio = sumaPuntajes / contador;
			System.out.println("Promedio del curso " + curso + ": " + promedio);
		}
	}

	public static void mostrarCantidadEstudiantesPorCurso(Estudiante[] estudiantes, int contadorEstudiantes) {
		if (contadorEstudiantes == 0) {
			System.out.println("No hay estudiantes registrados");
			return;
		}

		String[] cursos = obtenerCursos(estudiantes, contadorEstudiantes);

		for (String curso : cursos) {
			int contador = 0;
			for (int i = 0; i < contadorEstudiantes; i++) {
				if (estudiantes[i].getCurso().equals(curso)) {
					contador++;
				}
			}

			System.out.println("Cantidad de estudiantes en el curso " + curso + ": " + contador);
		}
	}

	public static String[] obtenerCursos(Estudiante[] estudiantes, int contadorEstudiantes) {
		String[] cursos = new String[contadorEstudiantes];
		int contador = 0;

		for (int i = 0; i < contadorEstudiantes; i++) {
			String curso = estudiantes[i].getCurso();

			if (!existeCurso(cursos, contador, curso)) {
				cursos[contador] = curso;
				contador++;
			}
		}

		String[] cursosFinales = new String[contador];
		System.arraycopy(cursos, 0, cursosFinales, 0, contador);

		return cursosFinales;
	}

	public static boolean existeCurso(String[] cursos, int contador, String curso) {
		for (int i = 0; i < contador; i++) {
			if (cursos[i].equals(curso)) {
				return true;
			}
		}
		return false;
	}
}

//class Estudiante {
//	private String nombre;
//	private double puntaje;
//	private String curso;
//
//	public Estudiante(String nombre, double puntaje, String curso) {
//		this.nombre = nombre;
//		this.puntaje = puntaje;
//		this.curso = curso;
//	}
//
//	public String getNombre() {
//		return nombre;
//	}
//
//	public double getPuntaje() {
//		return puntaje;
//	}
//
//	public String getCurso() {
//		return curso;
//	}
//}
