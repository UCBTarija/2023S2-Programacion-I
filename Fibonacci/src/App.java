import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {


        Fibonacci fibo = new Fibonacci();

        try{
        
            int[] serie = fibo.generar(0);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


        // String s = "";
        // for(int i : serie){
        //     s += i + " ";
        // }
        // System.out.println(s);
    }
}
