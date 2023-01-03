package Bimestre2.Semana1.Semana3.MetodosOrdenamientoTarea;

public class Seleccion {
    public static void main(String[] args) {
        //Para poder usar 100000 o 10000 datos, lo que hago es editar el tamanio de numeros.
        int numeros[] = new int[100000];
        long totaltiempo = 0;
        int n = 1;
        int menor, pos, tem;
        for (int x = 0; x < 1; x++) {
            long inicio = System.currentTimeMillis();
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = n;
                n++;
            }
            for (int i = 0; i < numeros.length; i++) {
                menor = numeros[i];
                pos = i;
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[j] < menor) {
                        menor = numeros[j];
                        pos = j;
                    }
                }
                if (pos != i) {
                    tem = numeros[i];
                    numeros[i] = numeros[pos];
                    numeros[pos] = numeros[tem];
                }
            }
            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
            }
            long fintiempo = System.currentTimeMillis();
            totaltiempo = fintiempo - inicio;

            System.out.println("El vector ordenado es: ");
            for (int i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i] + " ");
            }
            System.out.println("\nTiempo que se tarda: " + totaltiempo + " milisegundos");
        }
    }
}
