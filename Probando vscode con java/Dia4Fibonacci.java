import java.util.Arrays;

public class Dia4Fibonacci{
    
    public static void main(String[] args) {
      
    
    int contador = 1;
    int[] fibo = new int[8];
    int num1 = 0;
    int num2 = 1;

    fibo[0] = 0;
    while (contador <8){
        fibo[contador] = num1 + num2;
        num1 = fibo[contador-1];
        num2 = fibo[contador];        
        contador ++;
    }
System.out.println(Arrays.toString(fibo));

}
}