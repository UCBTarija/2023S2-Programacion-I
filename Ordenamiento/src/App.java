public class App {
    public static void main(String[] args) throws Exception {
        Ordenamiento ord = new Ordenamiento();

        int[] original = VectorUtil.generar(10000);        
        //VectorUtil.imprimirVector(original);

        int v[] = VectorUtil.clonar(original);
        ord.intercambio(v);

        int v1[] = VectorUtil.clonar(original);
        Medida medidaSeleccion = ord.seleccion(v1);
        System.out.println("SELECCION");
        System.out.println("Tiempo: " + medidaSeleccion.tiempo);
        System.out.println("Comparaciones: " + medidaSeleccion.comparaciones);
        System.out.println("Intercambios: " + medidaSeleccion.intercambios);
         

        int v2[] = VectorUtil.clonar(original);
        ord.burbuja(v2);
        
    }
}
