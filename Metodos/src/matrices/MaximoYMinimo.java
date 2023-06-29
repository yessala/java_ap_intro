package matrices;

public class MaximoYMinimo {

	public static void main(String[] args) {
		int [][] matriz1= {{9,2,16} ,{8,1,6}};
		int numeroMayor = matriz1[0][0];
		int numeroMenor = matriz1[0][0];
						//primero for, pasa por las filas
		for (int i=0; i<matriz1.length;i++) {
							//segundo for, pasa por las columas
			for (int j=0; j<matriz1[0].length;j++) {
				//compara el numero de la matriz con el numero mayor guardado en la variable
				if (matriz1[i][j]>numeroMayor) {
					numeroMayor = matriz1[i][j];
				}//si el numero es mayor, se guarda en la variable, sino.. sigue el ciclo
			}
		}
		System.out.println("El numero mayor de la matriz es "+ numeroMayor);
		System.out.println();

		for (int i=0; i<matriz1.length;i++) {
			for (int j=0; j<matriz1[0].length;j++) {
				//compara el numero de la matriz con el numero menor guardado en la variable
				if (matriz1[i][j]<numeroMenor) {
					numeroMenor = matriz1[i][j];
				}//si el numero es menor, se guarda en la variable, sino.. sigue el ciclo
			}
		}
		System.out.println("El numero menor de la matriz es "+ numeroMenor);
		
		for (int i = 0; i<matriz1.length;i++) {
			for (int j=0; j<matriz1[0].length;j++) {
				System.out.print("["+matriz1[i][j]+"]");
			}
			System.out.println();
		}
		System.out.println();
		
		//imprimir matriz invertida
	for (int i = matriz1.length-1; i>=0;i--) {
		for (int j=matriz1[0].length-1; j>=0;j--) {
			System.out.print("["+matriz1[i][j]+"]");
		}
		System.out.println();
	}
}
}
