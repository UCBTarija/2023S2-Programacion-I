package s1_secuenciales;

import java.util.Scanner;

public class E01_Variables {
    public static void main(String[] args) {
        
        // DECLARACIÓN E INICIALIZACIÓN DE VARIABLES
        
        // declaración de una variable de tipo entero
        // inicializa con el valor por defecto del tipo de dato
        // TIPO variable;
        int a;

        // asignación de un valor
        a = 10;

        // inicialización y asignación
        // TIPO variable = valor;
        int b = 20;

        // NOMBRES DE VARIABLE

        // Las variables deben ser nombradas de acuerdo al valor que almacenan:
        int edad = 15;
        String nombre = "juan";
        double salario = 100.85;
        boolean completado = false;

        // si el nombre incluye varias palabras, se las debe escribir en notación CAMEL CASE
        String nombreCompleto = "Pedro";
        int cantidadAlumnos = 30;
        double maxAltura = 10.5;
        boolean esFeriado = true;

        // los nombres no deben iniciar con números
        // String 1erDia = "Lunes";  ERROR

        // VARIABLES DE TIPO OBJETO

        // la declaración y asignación de una clase es similar
        // que de un tipo primitivo:        
        // TIPO variable = new TIPO(<parámetros>);
        Scanner scan = new Scanner(System.in);

        // el valor asignado a una variable debe ser del mismo tipo
        // primero se evalúa el paréntesis, luego la operación relacional >
        boolean anios = (3 + 5) > 100;
    }
}
