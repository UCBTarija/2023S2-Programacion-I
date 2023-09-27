package s4_arreglos;

public class E02_BuscarSub {

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 8, 8 };
        int[] b = {4, 5};

        int pos = findArray(a, b);
        System.out.println(pos);

    }
    
    public static int findArray(int largeArray[], int subArray[]) {

        if ((subArray.length == 0) || (subArray.length > largeArray.length)) {
            return -1;
        }

        int limit = largeArray.length - subArray.length;

        for (int i = 0; i <= limit; i++) {
            if (largeArray[i] == subArray[0]) {
                boolean encontrado = true;

                for (int j = 1; j < subArray.length; j++) {
                    if (largeArray[i + j] != subArray[j]) {
                        encontrado = false;
                        break;
                    }
                }

                if (encontrado) {
                    return i;
                }
            }
        }
        return -1;
    }
}
