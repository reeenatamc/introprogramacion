package Bimestre2.Semana1.Semana4;

import java.util.Scanner;

public class PotenciaMatriz {
    public static void main(String[] args) {
        int numero[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }; // dimension de la matriz 3x3
        int mat_potencia[][] = new int[numero.length][numero[0].length];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el valor de la potencia: ");
        int potencia = teclado.nextInt();
        for (int fila = 0; fila < numero.length; fila++) {
            for (int columna = 0; columna < numero[0].length; columna++) {
                mat_potencia[fila][columna] = (int) Math.pow(numero[fila][columna], potencia);
            }
        }
        //lectura de la matriz mat potencia
        for (int fila = 0; fila < numero.length; fila++) {
            for (int columna = 0; columna < numero[0].length; columna++) {
                System.out.print(mat_potencia[fila][columna] + "\t");
            }
            System.out.print("\n");
        }
    }
}
