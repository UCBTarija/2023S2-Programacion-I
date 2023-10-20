public class Ordenamiento {
    
    public void intercambio(int vector[]){        
        for(int i = 0; i < vector.length; i++){
            for(int j = i + 1; j < vector.length; j++){
                if(vector[i] > vector[j]){
                    int aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }

    public void seleccion(int vector[]) {
        
    }


}
