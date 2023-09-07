package s5_funciones;

import java.util.Random;

public class E03_vector_util {
    public static void main(String[] args) {
        int x = 10;
        int v[] = generar(x);
        imprimirVector(v);
    }

    public static int[] generar(int tamanio){
        Random rnd = new Random();
        
        int vector[] = new int[tamanio];
        for(int i = 0; i < tamanio; i++){
            vector[i] = rnd.nextInt(100);
        }
        return vector;
    }

    public static void imprimirVector(int vector[]){
        for(int j= 0; j < vector.length; j++){
            System.out.print(vector[j] + " ");
        }
        System.out.println();
    }
}
