package Bimestre2.Semana1.Semana3.MetodosOrdenamientoTarea;

public class BurbujaPlus {
    public static void main(String[] args) {
        //Para poder usar 100000 o 10000 datos, lo que hago es editar el tamanio de numeros.
        int numeros[] = new int[100000];
        double tiempo[] = new double[3];
        long totaltiempo = 0;
        int n = 1; // Inicializa n con el valor 1
        boolean cambio;
        for (int j = 0; j < numeros.length; j++) {
            numeros[j] = n;
            n++;
        }
        long inicio = System.currentTimeMillis();
        int aux;
        do {
            cambio = false;
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                    cambio = true;
                }
            }
        } while (cambio);
        long fintiempo = System.currentTimeMillis();
        totaltiempo = fintiempo - inicio;

        System.out.println("El vector ordenado es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }
        System.out.println("\nTiempo que se tarda: " + totaltiempo + " milisegundos");
    }
}
