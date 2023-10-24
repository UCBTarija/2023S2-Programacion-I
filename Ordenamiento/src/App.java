public class App {
    public static void main(String[] args) throws Exception {
        Ordenamiento ord = new Ordenamiento();

        int[] original = VectorUtil.generar(10000);        
        //VectorUtil.imprimirVector(original);

        int v[] = VectorUtil.clonar(original);
        long inicio = System.currentTimeMillis();
        ord.intercambio(v);
        //VectorUtil.imprimirVector(v);
        long fin = System.currentTimeMillis();
        System.out.println("Intercambio: " + (fin - inicio));

        int v1[] = VectorUtil.clonar(original);
        inicio = System.currentTimeMillis();
        ord.seleccion(v1);
        fin = System.currentTimeMillis();
        //VectorUtil.imprimirVector(v1);
        System.out.println("Selección: " + (fin - inicio));
         

        int v2[] = VectorUtil.clonar(original);
        inicio = System.currentTimeMillis();
        ord.burbuja(v2);
        fin = System.currentTimeMillis();
        //VectorUtil.imprimirVector(v2);
        System.out.println("Burbuja: " + (fin - inicio));
        
    }
}
