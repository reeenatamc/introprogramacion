package Bimestre2.Semana1.Semana3.MetodosOrdenamientoTarea;

public class BurbujaSimple {
    public static void main(String[] args) {
        //Para poder usar 100000 o 10000 datos, lo que hago es editar el tamanio de numeros.
        int numeros[] = new int[100000];
        long totalTime = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        totalTime = endTime - inicio;

        System.out.println("El arreglo ordenado es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }
        System.out.println("\nTiempo que se tarda: " + totalTime + " milisegundos");
    }
}
