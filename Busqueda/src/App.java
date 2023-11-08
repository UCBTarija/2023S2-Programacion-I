import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int v[] = VectorUtil.generar(20);
        VectorUtil.imprimirVector(v);
        
        System.out.print("Buscar: ");
        int valor = scan.nextInt();
        System.out.println("");

        int pos = Busqueda.busquedaBinaria(v, valor);
        if(pos == -1){
            System.out.println("No encontrado");            
        } else{
            System.out.println("Posición " + pos);
        }
    }
}
