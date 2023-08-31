package s3_repetitivas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class E04_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Número: ");
        int num = scan.nextInt();
        
        int factorial = 1;
        for(int i = 1; i <= num; i++ ){
            factorial = factorial * i;
        }

        System.out.println();
        String s = "El factorial de " + num + " es " + factorial;
        System.out.println(s);
    }
}
