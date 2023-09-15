package practicovectores;

import java.util.Random;

public class VectorUtil {

    public int[] generarVector(int n) {
        Random rnd = new Random();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = rnd.nextInt(100);
        }

        return vector;
    }

    public String vectorAtexto(int vector[]) {
        String s = "";
        for (int i = 0; i < vector.length; i++) {
            s = s + vector[i] + " ";
        }
        return s;
    }

    public double promedio(int vector[]) {

        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma = suma + vector[i];
        }

        if(vector.length > 0){
            return suma / vector.length;
        }
        
        return 0;
    }

}
