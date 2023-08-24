import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {

        // imprimir algo con salto de línea, el operador + concatena, no suma
        int a = 5;
        System.out.println("Concatenando: " + 10 + a);
        // para que se haga la operación de suma antes de concatenar
        // se debe encerrar en parentesis
        System.out.println("Primero suma lo del parentesis, luego concatena: " + (5 + a));

        // Pedir al usuario un texto y cargarlo en una variable de tipo String
        Scanner scan = new Scanner(System.in);
        String texto = scan.nextLine();

        // pedir un número
        int num = scan.nextInt();

    }
}
