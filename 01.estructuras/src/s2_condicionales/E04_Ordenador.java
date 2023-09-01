package s2_condicionales;

import java.util.Random;

public class E04_Ordenador {
    public static void main(String[] args) throws Exception {
        Random rnd = new Random();

        int a = rnd.nextInt(10) + 1;
        int b = rnd.nextInt(10) + 1;
        int c = rnd.nextInt(10) + 1;

        System.out.println(a + " " + b + " " + c);

        if(a < b && b < c){
            System.out.println(a + " " + b + " " + c);
        }

        if(a < c && c && b){
            System.out.println(a + " " + c + " " + b);
        }

        if(b < a && a < c){
            System.out.println(b + " " + a + " " + c);
        }


    }
}
