package s3_repetitivas;

import java.util.Scanner;

public class E07_invertido {
    public static void main(String[] args) {        
        Scanner scan = new Scanner(System.in);

        int residuo;
        int num = scan.nextInt();
        int invertido = 0;
        while(num > 0){
            residuo = num % 10;
            invertido = invertido * 10 + residuo;
            num = num / 10;
        }
        System.out.println("Numero: " + num);
        System.out.println("Invertido: " + invertido);
    }
}
