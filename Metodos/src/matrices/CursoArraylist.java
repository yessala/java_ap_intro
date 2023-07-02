/**
 * 
 */
package matrices;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author yessa
 *
 */
public class CursoArraylist {

	public static void main(String[] args) {
		ArrayList<Estudiante> estudiantes = new ArrayList<>();
		Scanner leer = new Scanner(System.in);

		while (true) {
			System.out.println("Seleccione una opción:");
			System.out.println("1. Mostrar estudiantes");
			System.out.println("2. Agregar estudiante");
			System.out.println("3. Mostrar promedio general");
			System.out.println("4. Mostrar promedio por curso");
			System.out.println("5. Mostrar cantidad de estudiantes por curso");
			System.out.println("6. Salir");
			int opcion = leer.nextInt();
			leer.nextLine(); // Limpiar el buffer

			switch (opcion) {
			case 1:
				mostrarEstudiantes(estudiantes);
				break;
			case 2:
				agregarEstudiante(estudiantes, leer);
				break;
			case 3:
				mostrarPromedioGeneral(estudiantes);
				break;
			case 4:
				mostrarPromedioPorCurso(estudiantes);
				break;
			case 5:
				mostrarCantidadEstudiantesPorCurso(estudiantes);
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

	public static void mostrarEstudiantes(ArrayList<Estudiante> estudiantes) {
		if (estudiantes.isEmpty()) {
			System.out.println("No hay estudiantes registrados");
			return;
		}

		for (Estudiante estudiante : estudiantes) {
			System.out.println("Nombre: " + estudiante.getNombre());
			System.out.println("Puntaje: " + estudiante.getPuntaje());
			System.out.println("Curso: " + estudiante.getCurso());
			System.out.println("---------------------------");
		}
	}

	public static void agregarEstudiante(ArrayList<Estudiante> estudiantes, Scanner scanner) {
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

		estudiantes.add(new Estudiante(nombre, puntaje, curso));
		System.out.println("Estudiante agregado exitosamente");
	}

	public static void mostrarPromedioGeneral(ArrayList<Estudiante> estudiantes) {
		if (estudiantes.isEmpty()) {
			System.out.println("No hay estudiantes registrados");
			return;
		}

		double sumaPuntajes = 0.0;
		for (Estudiante estudiante : estudiantes) {
			sumaPuntajes += estudiante.getPuntaje();
		}

		double promedio = sumaPuntajes / estudiantes.size();
		System.out.println("Promedio general: " + promedio);
	}

	public static void mostrarPromedioPorCurso(ArrayList<Estudiante> estudiantes) {
		if (estudiantes.isEmpty()) {
			System.out.println("No hay estudiantes registrados");
			return;
		}

		ArrayList<String> cursos = new ArrayList<>();
		for (Estudiante estudiante : estudiantes) {
			if (!cursos.contains(estudiante.getCurso())) {
				cursos.add(estudiante.getCurso());
			}
		}

		for (String curso : cursos) {
			double sumaPuntajes = 0.0;
			int contador = 0;
			for (Estudiante estudiante : estudiantes) {
				if (estudiante.getCurso().equals(curso)) {
					sumaPuntajes += estudiante.getPuntaje();
					contador++;
				}
			}

			double promedio = sumaPuntajes / contador;
			System.out.println("Promedio del curso " + curso + ": " + promedio);
		}
	}

	public static void mostrarCantidadEstudiantesPorCurso(ArrayList<Estudiante> estudiantes) {
		if (estudiantes.isEmpty()) {
			System.out.println("No hay estudiantes registrados");
			return;
		}

		ArrayList<String> cursos = new ArrayList<>();
		for (Estudiante estudiante : estudiantes) {
			if (!cursos.contains(estudiante.getCurso())) {
				cursos.add(estudiante.getCurso());
			}
		}

		for (String curso : cursos) {
			int contador = 0;
			for (Estudiante estudiante : estudiantes) {
				if (estudiante.getCurso().equals(curso)) {
					contador++;
				}
			}

			System.out.println("Cantidad de estudiantes en el curso " + curso + ": " + contador);
		}
	}
}

class Estudiante {
	private String nombre;
	private double puntaje;
	private String curso;

	public Estudiante(String nombre, double puntaje, String curso) {
		this.nombre = nombre;
		this.puntaje = puntaje;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public String getCurso() {
		return curso;
	}
}
