package Bimestre2.Semana1.Semana3.MetodosOrdenamientoTarea;

public class Insercion {
    public static void main(String[] args) {
        //Para poder usar 100000 o 10000 datos, lo que hago es editar el tamanio de numeros.
        int numeros[] = new int[1000];
        int n = 0;
        long totaltiempo;
        int aux;
        for (int i = 0; i < 1; i++) {
            long inicio = System.currentTimeMillis();
            for (int indice = (numeros.length - 1); indice >= 0; indice--) {
                numeros[indice] = n;
                n++;
            }
            for (int cont1 = 1; cont1 < numeros.length; cont1++) {
                aux = numeros[cont1];
                for (int cont2 = (cont1 - 1); cont2 >= 0 && numeros[cont2] > aux; cont2--) {
                    numeros[cont2 + 1] = numeros[cont2];
                    numeros[cont2] = aux;
                }
            }
            for (int indice = 0; indice <= (numeros.length - 1); indice++) {
                System.out.println(numeros[indice]);
            }
            long fintiempo = System.currentTimeMillis();
            totaltiempo = fintiempo - inicio;

            System.out.println("El vector ordenado es: ");
            for (int i2 = 0; i2 < numeros.length; i2++) {
                System.out.println(numeros[i2] + " ");
            }
            System.out.println("\nTiempo que se tarda: " + totaltiempo + " milisegundos");
        }
    }
}
