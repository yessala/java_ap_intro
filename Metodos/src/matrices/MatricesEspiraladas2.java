 /**
 */
package matrices;

import java.util.Scanner;

/**
 * @author yessa
 *
 *para crear matrices espiraladas de n*m
 *sentido a las agujas del reloj iniciando el 1 en la posicion 0,0
 *
 */
public class MatricesEspiraladas2 {
	
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		//esto aplica nada mas para matrices cuadradas
		System.out.print("Ingrese las filas de la matriz: ");
		int n = leer.nextInt();
		System.out.print("Ingrese las columnas de la matriz: ");
		int m = leer.nextInt();
		int[][] matrix = new int[n][m];
		int i, startRow = 0, startColumn=0;
		int endRow= n-1, endColumn =m-1;
		int value = 1;

		while (value <= (n*m)) {
			//recorre de izquierda a derecha
			for (i=startColumn; i<=endColumn;i++) {
				matrix[startColumn][i]= value;
				value++;
			}
			startRow++;
			//Recorre de arriba a abajo
			for (i=startRow;i<=endRow;i++) {
				matrix[i][endColumn]=value;
				value++;
				;
			}
			endColumn--;
			//Recorre de derecha a izquierda
			for (i=endColumn; i>= startColumn;i--) {
				matrix[endRow][i]=value;
				value++;
			}
			
			endRow--;
			//recorre de abajo a arriba
			for (i=endRow;i>=startRow;i--) {
				matrix[i][startColumn]=value;
				value++;
			}
			startColumn++;
		}

		for(i = 0; i < matrix.length;i++ ) {
			for (int j=0;j < matrix[0].length;j++) {
				System.out.print("["+matrix[i][j]+"]"+"\t");
			}
			System.out.println();
		}
	}
}
