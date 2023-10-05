package herencia;
public class App {
    public static void main(String[] args) throws Exception {
        
        Animal a = new Animal();
        a.nombre = "Cabra";
        a.comer();

        Acuatico b = new Acuatico();
        b.nombre = "nemo";
        b.comer();
    
        Animal c = b;
        c.comer();
        

    }
}
