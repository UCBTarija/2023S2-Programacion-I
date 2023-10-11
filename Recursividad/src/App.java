public class App {
    public static void main(String[] args) throws Exception {
        
        Recursivo recursivo = new Recursivo();
        int resultado = recursivo.sumatoria(4);
        System.out.println(resultado);

        int resultadoRec = recursivo.sumatoriaRecursiva(4);
        System.out.println(resultadoRec);

        System.out.println(recursivo.factorial(5));
        System.out.println(recursivo.factorialRecursivo(5));

        System.out.println(recursivo.contarDigitosRec(12345));

    }

}
