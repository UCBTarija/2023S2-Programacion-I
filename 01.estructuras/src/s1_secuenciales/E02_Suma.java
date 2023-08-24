package s1_secuenciales;

import java.util.Scanner;

public class E02_Suma {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero 1: ");
        int num1 = scan.nextInt();

        System.out.println("Numero 2: ");
        int num2 = scan.nextInt();
        
        int suma = num1 + num2;
        System.out.println("Suma: " + suma);
        
        scan.close();
    }
}
