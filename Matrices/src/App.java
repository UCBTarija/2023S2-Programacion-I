public class App {
    public static void main(String[] args) throws Exception {
        
        Matrices tablas = new Matrices();
        
        int a[][] = {{1, 2, 3}, {10, 20, 30}};
        
        tablas.imprimir(a);
        System.out.println("============");

        int[][] diagonal1 = tablas.diagonalPrincipal(4);
        tablas.imprimir(diagonal1);

        System.out.println("============");
        int[][] diagonal2 = tablas.diagonalSecundaria(4);
        tablas.imprimir(diagonal2);

        System.out.println("============");
        int[][] ventana = tablas.ventana(4);
        tablas.imprimir(ventana);

        System.out.println("============");
        int[][] tAleatoria = tablas.generar(5, 4);
        tablas.imprimir(tAleatoria);

        int [][] transpuesta = tablas.transponer(tAleatoria);
        tablas.imprimir(transpuesta);


    }
}
