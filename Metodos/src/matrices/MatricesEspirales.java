package matrices;
import java.util.Scanner;
public class MatricesEspirales {
	static Scanner tcl=new Scanner(System.in);

	public static void main(String args[]){

		int n=0;
		int inicio=0;
		int lim;
		int cont=1;


		System.out.println(" Ingrese el valor para N ");

		n =tcl.nextInt();
		lim = n - 1;

		int [][] matriz = new int[n][n];

		while(cont< (n*n))
		{
			for(int i=inicio;i<=lim;i++){
				matriz[inicio][i]=cont++;
			}
			for(int i=inicio+1;i<=lim;i++){
				matriz[i][lim]=cont++;
			}
			for(int i=lim-1;i>=inicio;i--){
				matriz[lim][i]=cont++;
			}
			for(int i=lim-1;i>=inicio+1;i--)			{

				matriz[i][inicio]=cont++;
			}
			inicio++;
			lim--;
		}
		for(int j=0;j<=matriz.length;j++){
			System.out.println();
			for(int i=0;i<=matriz.length;i++){
				System.out.print("["+matriz[j][i]+"]" + "");
			}
		}   
	}
}
