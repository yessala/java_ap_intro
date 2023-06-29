package matrices;
public class Multiplicacion {
	    public static void main(String[] args) {	    	
	        int [][] matriz1= {{1,2,3} ,{4,5,6}};
	        int [][] matriz2= {{10,20}, {30,40}, {50,60}};
	        int [][] matrizresultante= new int [matriz1.length] [matriz2[0].length];
	        int suma= 0;
	        				//matriz.length (fila)
	        for (int i=0; i<matriz1.length; i++){   //i=2 k=3 j=2
	        					//matriz[0].length (columna)
	            for (int j=0; j<matriz2[0].length; j++) {   
	            					//columna de la primera matriz o fila de la segunda matriz
	                for (int k=0; k < matriz1[0].length; k++){
	                	//se asigna a la variable suma el valor resultante de la multiplicacion de ambos numeros
	                    suma += matriz1[i][k]* matriz2 [k][j];
	                }
	                //se asigna el valor de suma luego que termine todas las iteraciones de k
	                //al elemento de la matriz resultante (posicion i,j)
	            matrizresultante [i][j]= suma;
	            suma=0;
	            }
	        }
	        
	    	for (int i = 0; i< matrizresultante.length;i++) {
				for (int j=0; j<matrizresultante[0].length;j++) {
					System.out.print("["+matrizresultante[i][j]+"]");
				}
				System.out.println();
			}
}
}
