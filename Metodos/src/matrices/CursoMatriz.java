/**
 * 
 */
package matrices;

import java.util.Scanner;

/**
 * @author yessa
 *
 */
public class CursoMatriz {

	    public static void main(String[] args) {
	        String[][] estudiantes = new String[100][3];
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
	            System.out.print("Opción: ");
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

	    public static void mostrarEstudiantes(String[][] estudiantes, int contadorEstudiantes) {
	        if (contadorEstudiantes == 0) {
	            System.out.println("No hay estudiantes registrados");
	            return;
	        }

	        System.out.println("Estudiantes registrados:");
	        for (int i = 0; i < contadorEstudiantes; i++) {
	            System.out.println("Nombre: " + estudiantes[i][0]);
	            System.out.println("Puntaje: " + estudiantes[i][1]);
	            System.out.println("Curso: " + estudiantes[i][2]);
	            System.out.println("---------------------------");
	        }
	    }

	    public static int agregarEstudiante(String[][] estudiantes, int contadorEstudiantes, Scanner scanner) {
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

	        estudiantes[contadorEstudiantes][0] = nombre;
	        estudiantes[contadorEstudiantes][1] = String.valueOf(puntaje);
	        estudiantes[contadorEstudiantes][2] = curso;

	        System.out.println("Estudiante agregado exitosamente");

	        return contadorEstudiantes + 1;
	    }

	    public static void mostrarPromedioGeneral(String[][] estudiantes, int contadorEstudiantes) {
	        if (contadorEstudiantes == 0) {
	            System.out.println("No hay estudiantes registrados");
	            return;
	        }

	        double sumaPuntajes = 0.0;
	        for (int i = 0; i < contadorEstudiantes; i++) {
	            sumaPuntajes += Double.parseDouble(estudiantes[i][1]);
	        }

	        double promedio = sumaPuntajes / contadorEstudiantes;
	        System.out.println("Promedio general: " + promedio);
	    }

	    public static void mostrarPromedioPorCurso(String[][] estudiantes, int contadorEstudiantes) {
	        if (contadorEstudiantes == 0) {
	            System.out.println("No hay estudiantes registrados");
	            return;
	        }

	        String[] cursosUnicos = obtenerCursosUnicos(estudiantes, contadorEstudiantes);

	        for (String curso : cursosUnicos) {
	            double sumaPuntajes = 0.0;
	            int contador = 0;
	            for (int i = 0; i < contadorEstudiantes; i++) {
	                if (estudiantes[i][2].equals(curso)) {
	                    sumaPuntajes += Double.parseDouble(estudiantes[i][1]);
	                    contador++;
	                }
	            }

	            double promedio = sumaPuntajes / contador;
	            System.out.println("Promedio del curso " + curso + ": " + promedio);
	        }
	    }

	    public static void mostrarCantidadEstudiantesPorCurso(String[][] estudiantes, int contadorEstudiantes) {
	        if (contadorEstudiantes == 0) {
	            System.out.println("No hay estudiantes registrados");
	            return;
	        }

	        String[] cursosUnicos = obtenerCursosUnicos(estudiantes, contadorEstudiantes);

	        for (String curso : cursosUnicos) {
	            int contador = 0;
	            for (int i = 0; i < contadorEstudiantes; i++) {
	                if (estudiantes[i][2].equals(curso)) {
	                    contador++;
	                }
	            }

	            System.out.println("Cantidad de estudiantes en el curso " + curso + ": " + contador);
	        }
	    }

	    public static String[] obtenerCursosUnicos(String[][] estudiantes, int contadorEstudiantes) {
	        String[] cursosUnicos = new String[contadorEstudiantes];
	        int contador = 0;

	        for (int i = 0; i < contadorEstudiantes; i++) {
	            String curso = estudiantes[i][2];

	            if (!existeCurso(cursosUnicos, contador, curso)) {
	                cursosUnicos[contador] = curso;
	                contador++;
	            }
	        }

	        String[] cursosFinales = new String[contador];
	        System.arraycopy(cursosUnicos, 0, cursosFinales, 0, contador);

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


