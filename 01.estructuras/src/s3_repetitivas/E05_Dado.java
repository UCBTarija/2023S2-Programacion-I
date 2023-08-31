package s3_repetitivas;

import java.util.Random;

public class E05_Dado {
    public static void main(String[] args) {
        Random rnd = new Random();
        int lado = rnd.nextInt(5) + 1;
        System.out.println(lado);
    }
}
