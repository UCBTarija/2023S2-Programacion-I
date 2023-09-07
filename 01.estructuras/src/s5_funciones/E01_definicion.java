package s5_funciones;

public class E01_definicion {

    public static void main(String[] args) {
        saludar("Juan", "Perez");
        int e = 3;
        int m = suma(10, e) + cuadrado(10);
        System.out.println(m);
    }

    public static void saludar(String nombre, String apellido){
        System.out.println("hola " + nombre + " " + apellido);
    }

    public static int suma(int a, int b){
        int c = a + b;
        return c;
    }

    public static int cuadrado(int n){
        return n * n;
    }

}
