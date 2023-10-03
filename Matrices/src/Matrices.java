import java.util.Random;

public class Matrices {

    public void imprimir(int tabla[][]){

        for(int i = 0; i < tabla.length; i++){
            for(int j = 0; j < tabla[0].length; j++){
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] diagonalPrincipal(int n){

        int[][] tabla = new int[n][n];

        for(int i = 0; i < n; i++){
            tabla[i][i] = 1;
        }
        
        return tabla;
    }

    public int[][] diagonalSecundaria(int n){
        int[][] tabla = new int[n][n];
        for(int i = 0; i < n; i++){
            tabla[i][n - i - 1] = 1;
            
        }        
        return tabla;
    }

    public int[][] ventana(int n){
        int[][] tabla = new int[n][n];
        for(int i = 0; i < n; i++){            
            tabla[0][i] = 1;
            tabla[n-1][i] = 1;
            tabla[i][0] = 1;
            tabla[i][n-1] = 1;            
        }        
        return tabla;
    }


    public int[][] generar(int fil, int col){
        Random rnd = new Random();
        int[][] tabla = new int[fil][col];
        
        for(int i = 0; i < fil; i++){
            for(int j = 0; j < col; j++){
                tabla[i][j] = rnd.nextInt(100);
            }
        }
        return tabla;
    }

    public int[][] transponer(int tabla[][]){


        
    }

}