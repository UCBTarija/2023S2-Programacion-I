package s5_funciones;

public class E02_varios {

    public static void main(String[] args) {
        if(esPrimo(11)){
            System.out.println("Es primo");
        }        
    }

    public static boolean esPrimo(int num){
        int count = 0;
        for(int i = 1; i<=num; i++){
            if(num % i == 0){
                count++;
            }
        }
        return count == 2;
    }


}
