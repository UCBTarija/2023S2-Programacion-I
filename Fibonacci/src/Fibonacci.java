

public class Fibonacci {

    public int[] generar(int n) throws Exception{

        if(n == 0){
            throw new Exception("error: no puede ser menor a 1");
        }

        int[] vector = new int[n];
        int num1 = 0, num2 = 1, sum = 1;
        
        vector[0] = num1;
        for(int i = 1; i < n; i++){
            vector[i] = sum;
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        return vector;
    }
    
}
