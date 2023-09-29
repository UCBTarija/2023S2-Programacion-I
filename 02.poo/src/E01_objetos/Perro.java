package E01_objetos;

public class Perro {

    public String nombre;
    public String color;

    public void comer(){
        System.out.println("comiendo...");
        digerir();
    }

    public void correr(){    
        int velocidad = 10;
        System.out.println("corriendo...");
    }

    public void presentate(){
        System.out.println("Hola me llamo " + nombre + " y soy de color " + color);
    }

    private void digerir(){
        System.out.println("digeriendo");
    }

}
