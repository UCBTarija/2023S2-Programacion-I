public class Recursivo {
    public int sumatoria(int n){
        int suma = 0;
        for(int i = n; i > 0; i--){
            suma += i;
        }
        return suma;
    }

    public int sumatoriaRecursiva(int n){
        if(n == 1) {
            return 1;
        }
        return n + sumatoriaRecursiva(n -1);
    }

    public int factorial(int n){
        int res = 1;
        for(int i = n; i > 0; i--){
            res *= i;
        }
        return res;
    }

    public int factorialRecursivo(int n){
        if(n == 0) {
            return 1;
        }
        return n * factorialRecursivo(n -1);
    }

    public int contarDigitosRec(int n){
        if(n < 10){
            return 1;
        }

        return 1 + contarDigitosRec(n / 10);
    }
}
