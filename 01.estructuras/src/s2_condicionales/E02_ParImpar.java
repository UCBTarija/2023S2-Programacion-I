package s2_condicionales;

import java.util.Scanner;

public class E02_ParImpar {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero A: ");
        int num1 = scan.nextInt();

        if(num1 % 2 == 0 ){
            System.out.println(num1 + " es par");
        } else {
            System.out.println(num1 + " es impar");
        }

        scan.close();
    }
}
