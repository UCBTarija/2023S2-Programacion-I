public class Ordenamiento {

    public void intercambio(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] > vector[j]) {
                    int aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }
            }
        }
    }

    public void seleccion(int vector[]) {
        
        int i, j, menor, pos, tmp;
        for (i = 0; i < vector.length - 1; i++) {
            menor = vector[i];
            pos = i;
            for (j = i + 1; j < vector.length; j++) {
                if (vector[j] < menor) {
                    menor = vector[j];
                    pos = j;
                }
            }
            if (pos != i) {
                tmp = vector[i];
                vector[i] = vector[pos];
                vector[pos] = tmp;
            }
        }
    }


}
