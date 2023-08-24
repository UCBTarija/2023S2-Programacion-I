package s2_condicionales;

import java.util.Scanner;

public class E01_comparador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero A: ");
        int num1 = scan.nextInt();

        System.out.println("Numero B: ");
        int num2 = scan.nextInt();
        
        if (num1 > num2) {
            System.out.println("A es mayor a B");
        }

        if (num1 < num2) {
            System.out.println("A es menor a B");
        }

        if (num1 == num2) {
            System.out.println("A es igual B");
        }

        scan.close();
    }
}
