public class App {
    public static void main(String[] args) throws Exception {
        int[] v = VectorUtil.generar(10);
        VectorUtil.imprimirVector(v);

        Ordenamiento ord = new Ordenamiento();
        ord.intercambio(v);
        VectorUtil.imprimirVector(v);

    }
}
