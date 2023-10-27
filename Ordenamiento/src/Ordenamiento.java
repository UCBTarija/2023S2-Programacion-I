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

    public Medida seleccion(int vector[]) {
        Medida medida = new Medida();        
        long ini = System.currentTimeMillis();
        int i, j, menor, pos, tmp;
        for (i = 0; i < vector.length - 1; i++) {
            menor = vector[i];
            pos = i;
            for (j = i + 1; j < vector.length; j++) {
                medida.comparaciones++;
                if (vector[j] < menor) {
                    menor = vector[j];
                    pos = j;
                }
            }
            medida.comparaciones++;
            if (pos != i) {
                medida.intercambios++;
                tmp = vector[i];
                vector[i] = vector[pos];
                vector[pos] = tmp;
            }
        }
        long fin = System.currentTimeMillis();
        medida.tiempo = fin - ini;
        return medida;
    }

    public void burbuja(int vector[]) {
        boolean cambio = true;
        while (cambio) {
            cambio = false;
            for (int i = 0; i < vector.length - 1; i++) {
                if(vector[i] > vector[i + 1]){
                    int aux = vector[i];
                    vector[i] = vector[i+1];
                    vector[i+1] = aux;
                    cambio = true;
                }
            }
        }
    }

}
