package s2_condicionales;

import java.util.Scanner;

public class E03_Bisiesto {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Año: ");
        int num1 = scan.nextInt();

        if ((num1 % 4 == 0)
                && ((num1 % 100 != 0) || (num1 % 400 == 0))) {
                    
            System.out.println("Bisiesto");
        } else {
            System.out.println("No bisiesto");
        }

        scan.close();
    }
}
