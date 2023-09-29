package E01_objetos;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Perro perro = new Perro();
        perro.nombre = "Boby";
        perro.color = "verde";

        perro.comer();
        perro.correr();
        perro.presentate();
        
        
        
        
    }
}
