package s6_matrices;

import java.util.Scanner;

public class E02_cargado {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Tamaño: ");
        int n = scan.nextInt();        
        int m[][] = new int [n][n];        

        for(int f = 0; f < n; f++){            
            for(int c = 0; c < n; c++){
                m[f][c] = scan.nextInt();
            }
        }

        for(int f = 0; f < n; f++){
            for(int c = 0; c < n; c++){
                System.out.print(m[f][c] + " ");
            }
            System.out.println();
        }
    }

}
