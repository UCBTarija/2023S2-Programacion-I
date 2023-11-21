import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        
        File file = new File("/home/ronal/Escritorio/archivo.txt");
        FileReader fr = new FileReader(file);
        int i;
        while((i = fr.read()) != -1){
            System.out.print((char)i);
        }
        fr.close();

        System.out.println("================");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String linea;
        while ((linea = br.readLine()) != null){
            System.out.println(linea);
        }
        br.close();
    }
}
