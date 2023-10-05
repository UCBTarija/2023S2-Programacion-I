import java.util.ArrayList;

import herencia.Animal;

public class App {
    public static void main(String[] args) {

        ArrayList<String> textos = new ArrayList<String>();
        textos.add("Juan");
        textos.add("PEdro");
        textos.add("Carlos");
        textos.add("Antonio");
        textos.add("Ramón");

        for(int i = 0; i < textos.size(); i++){
            System.out.println(textos.get(i));
        }

        for(String nombre : textos){
            System.out.println(nombre.toUpperCase());
            System.out.println(nombre.substring(0, 3));
        }


        // Animal a = new Animal();
        // a.nombre = "Nemo";

        // ArrayList lista = new ArrayList();
        // lista.add(a);
        // Animal b = (Animal)lista.get(0);


        // ArrayList<Animal> lista2 = new ArrayList<Animal>();
        // lista2.add(a);
        // Animal c = lista2.get(0);


    }
}
