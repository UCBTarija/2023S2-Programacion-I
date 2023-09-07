package s4_arreglos;

import java.util.Random;
import java.util.Scanner;

public class E01_Definicion {

    public static void main(String[] args) {          
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Tamaño: ");
        int t = scan.nextInt();
        
        int a[] = new int[t];

        for(int i= 0; i<t; i++){
            a[i] = rnd.nextInt(100);
        }

        imprimirVector(a);
    }

    public static void imprimirVector(int vector[]){
        for(int j= 0; j < vector.length; j++){
            System.out.print(vector[j] + " ");
        }
        System.out.println();
    }

}
