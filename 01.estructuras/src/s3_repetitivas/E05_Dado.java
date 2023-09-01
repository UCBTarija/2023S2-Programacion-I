package s3_repetitivas;

import java.util.Random;

public class E05_Dado {
    public static void main(String[] args) {
        Random rnd = new Random();
        int cinco = 0;
        for(int i = 1; i < 100; i++){
            int x = rnd.nextInt(5);
            if(x == 5){
                cinco++;
            }
        }
        System.out.println(cinco);
    }
}
