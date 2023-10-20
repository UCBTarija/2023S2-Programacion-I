public class App {
    public static void main(String[] args) throws Exception {
        Ordenamiento ord = new Ordenamiento();

        int[] original = VectorUtil.generar(10);        
        VectorUtil.imprimirVector(original);

        int v[] = VectorUtil.clonar(original);
        ord.intercambio(v);
        VectorUtil.imprimirVector(v);

        int v1[] = VectorUtil.clonar(original);
        ord.seleccion(v1);
        VectorUtil.imprimirVector(v1);
    }
}
