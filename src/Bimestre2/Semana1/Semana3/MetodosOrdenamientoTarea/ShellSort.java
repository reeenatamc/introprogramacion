package Bimestre2.Semana1.Semana3.MetodosOrdenamientoTarea;

import java.util.Scanner;

public class ShellSort {
    public static void main(String[] args) {
        //Para poder usar 100000 o 10000 datos, lo que hago es editar el tamanio de n.

        int n = 100000;
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = 100000 - i;
        }

        long startTime = System.currentTimeMillis();

        int interno = (int) Math.floor(n / 2);
        while (interno > 0) {
            for (int i = interno; i < n; i++) {
                int j = i - interno;
                while (j >= 0) {
                    int k = j + interno;
                    if (vector[j] <= vector[k]) {
                        j -= 1;
                    } else {
                        int aux = vector[j];
                        vector[j] = vector[k];
                        vector[k] = aux;
                        j -= interno;
                    }
                }
            }
            interno = (int) Math.floor(interno / 2);
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("El vector ordenado es: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vector[i] + " ");
        }
        System.out.println("\nTiempo que se tarda: " + totalTime + " milisegundos");

    }
}
