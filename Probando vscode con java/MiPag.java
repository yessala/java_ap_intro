import java.util.Arrays;
public class MatrixMultiplication {
    public static void main(String[] args) {
        // Create two matrices
        int[][] matrix1 = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrix2 = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // Multiply the matrices
        int[][] product = Matrix.multiply(matrix1, matrix2);
        // Print the product
        System.out.println(Arrays.deepToString(product));
    }
}




// import java.util.Scanner;
// import java.util.Arrays;
// import java.util.Matrix;

// public class MiPag{
//     static Scanner leer = new Scanner(System.in);


//     public static void main (String[] args){

//        int[][] arr = {{1,2},{3,4}};
//        int[][] arr2 = {{3,4},{1,2}};
        
        

       //         int[][] arr3 = multiply(arr,arr2);
        
//         System.out.println(Arrays.deepToString(arr3));
       

//     }
//     public static int[][] multiply(int[][] a, int[][] b) {
//     int[][] c = new int[a.length][b[0].length];
//     // se comprueba si las matrices se pueden multiplicar
//     if (a[0].length == b.length) {
//         for (int i = 0; i < a.length; i++) {
//             for (int j = 0; j < b[0].length; j++) {
//                 for (int k = 0; k < a[0].length; k++) {
//                     // aquí se multiplica la matriz
//                     c[i][j] += a[i][k] * b[k][j];
//                 }
//             }
//         }
//     }
//     /**
//      * si no se cumple la condición se retorna una matriz vacía
//      */
//     return c;
// }
 


// }
// }