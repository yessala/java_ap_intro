/**
 * 
 */
package matrices;
/**
 * @author yessa
 *
 */
import java.util.Random;
import java.util.Scanner;

public class Buscaminas {
	
	 static Scanner leer = new Scanner(System.in);

    private char[][] mapa;
    private boolean[][] revelado;
    private int filas;
    private int columnas;
    private int minas;

    public Buscaminas(int filas, int columnas, int minas) {
        this.filas = filas;
        this.columnas = columnas;
        this.minas = minas;
        mapa = new char[filas][columnas];
        revelado = new boolean[filas][columnas];
    }

    public void jugar() {
        generarMapa();
        boolean gameOver = false;

        while (!gameOver) {
            imprimirMapa();
            int fila = obtenerEntrada("Ingrese la fila: ");
            int columna = obtenerEntrada("Ingrese la columna: ");
            
            if (revelado[fila][columna]) {
                System.out.println("¡Esa casilla ya ha sido revelada!");
            } else {
                gameOver = revelarCasilla(fila, columna);
                if (gameOver) {
                    System.out.println("¡Has perdido!");
                } else if (verificarVictoria()) {
                    imprimirMapa();
                    System.out.println("¡Has ganado!");
                    gameOver = true;
                }
            }
        }
    }

    private void generarMapa() {
        inicializarMapa();
        colocarMinas();
        calcularNumeros();
    }

    private void inicializarMapa() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                mapa[i][j] = 'O';
                revelado[i][j] = false;
            }
        }
    }

    private void colocarMinas() {
        Random random = new Random();
        int minasColocadas = 0;
        
        while (minasColocadas < minas) {
            int fila = random.nextInt(filas);
            int columna = random.nextInt(columnas);
            
            if (!revelado[fila][columna]) {
                mapa[fila][columna] = 'M';
                minasColocadas++;
            }
        }
    }

    private void calcularNumeros() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (mapa[i][j] != 'M') {
                    int contadorMinas = 0;
                    
                    for (int k = i - 1; k <= i + 1; k++) {
                        for (int l = j - 1; l <= j + 1; l++) {
                            if (k >= 0 && k < filas && l >= 0 && l < columnas && mapa[k][l] == 'M') {
                                contadorMinas++;
                            }
                        }
                    }
                    
                    mapa[i][j] = (char) (contadorMinas + '0');
                }
            }
        }
    }

    private void imprimirMapa() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (revelado[i][j]) {
                    System.out.print(mapa[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    private int obtenerEntrada(String mensaje) {
       
        System.out.print(mensaje);
        return leer.nextInt();
    }

    private boolean revelarCasilla(int fila, int columna) {
        if (mapa[fila][columna] == 'M') {
            return true;
        }
        
        revelado[fila][columna] = true;
        
        if (mapa[fila][columna] == '0') {
            for (int i = fila - 1; i <= fila + 1; i++) {
                for (int j = columna - 1; j <= columna + 1; j++) {
                    if (i >= 0 && i < filas && j >= 0 && j < columnas && !revelado[i][j]) {
                        revelarCasilla(i, j);
                    }
                }
            }
        }
        
        return false;
    }

    private boolean verificarVictoria() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (!revelado[i][j] && mapa[i][j] != 'M') {
                    return false;
                }
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Buscaminas buscaminas = new Buscaminas(8, 8, 10);
        buscaminas.jugar();
    }
}
