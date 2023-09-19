package s6_matrices;

import java.util.Scanner;

public class E03_multiplicar {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Número: ");
        int n = scan.nextInt();   

        int m[][] = new int [10][3];        

        for(int i = 0; i < 10; i++){            
            m[i][0] = n;
            m[i][1] = i + 1;
            m[i][2] = m[i][0] * m[i][1];
        }

        for(int f = 0; f < 10; f++){
            for(int c = 0; c < 3; c++){
                System.out.print(m[f][c] + " ");
            }
            System.out.println();
        }
    }

}
