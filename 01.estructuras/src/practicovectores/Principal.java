package practicovectores;

public class Principal {
    
    public static void main(String[] args) {
        
        VectorUtil util = new VectorUtil();

        int vector[] = util.generarVector(10);

        String texto = util.vectorAtexto(vector);        
        System.out.println("Vector: " + texto);

        double promedio = util.promedio(vector);
        System.out.println("Promedio: " + promedio);
    }

}
