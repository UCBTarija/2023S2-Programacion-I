package s3_repetitivas;

import java.util.Random;

public class E06_Multiplos {
    public static void main(String[] args) {        
        
        Random rnd = new Random();

        int m3 = 0;
        int m5 = 0;
        
        for(int i = 0; i < 10; i++){
            int num = rnd.nextInt(20);
            if(num % 3 == 0){
                m3 = m3 + num;
            }
            if(num % 5 == 0){
                m5 = m5 + num;
            }

            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Múltiplos de 3 = " + m3);
        System.out.println("Múltiplos de 5 = " + m5);
    }
}
