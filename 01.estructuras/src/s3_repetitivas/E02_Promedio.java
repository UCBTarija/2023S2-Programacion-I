package s3_repetitivas;

import java.util.Scanner;

public class E02_Promedio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        System.out.print("Numero: ");
        int num = scan.nextInt();
        while(num != 0){
            // contar
            contador = contador + 1;
            // acumular
            suma = suma + num;
            // pedir siguiente numero
            System.out.print("Numero: ");
            num = scan.nextInt();           
        }
        System.out.println("");
        System.out.println("Cantidad: " + contador);
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + (suma / contador));        
    }
}
