package s6_matrices;

import java.util.Random;

public class E01_definicion {

    public static void main(String[] args) {
        
        int m[][] = new int [6][5];
        Random rnd = new Random();

        // m[0][4] = 8;
        // m[1][2] = 5;
        // m[3][3] = 6;
        // m[4][0] = 1;

        // System.out.println(m[1][2]);

        // int b = m[3][3] * 2;
        // System.out.println(b + m[0][4]);

        // System.out.println("=============");

        for(int f = 0; f < 6; f++){
            for(int c = 0; c < 5; c++){
                m[f][c] = rnd.nextInt(100);
            }            
        }


        for(int f = 0; f < 6; f++){
            for(int c = 0; c < 5; c++){
                System.out.print(m[f][c] + " ");
            }
            System.out.println();
        }


    }

}
